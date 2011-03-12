package cat.quadriga.runtime.qvm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.runtime.ComponentObject;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeComponent;

public class CentralEntitySystem {
  private final ThreadLocal<Connection> databaseConnection;
  
  private final ThreadLocal<PreparedStatement> 
                        newEntityWithInfo, 
                        newEntityWithoutInfo,
                        setEntityName;
  
  private final ThreadLocal<CallableStatement> lastAutoIncrement;
  
  private Exception anyException = null;
  
  
  
  private Set<String> componentTables = new HashSet<String>();
  private List<DBComponent> components = new ArrayList<DBComponent>();
  
  public CentralEntitySystem() {
    try {
      databaseConnection = 
        new ThreadLocal < Connection > () {
            @Override protected Connection initialValue() {
                try {
                  return DriverManager.getConnection("jdbc:hsqldb:mem:localES","SA","");
                } catch (SQLException e) {
                  anyException = e;
                }
                return null;
            }
        };
      
      Statement statement = databaseConnection.get().createStatement();
      
      statement.addBatch("CREATE TABLE components ("
                          + "id IDENTITY,"
                          + "name VARCHAR(500) NOT NULL,"
                          + "description VARCHAR(1000),"
                          + "table_name VARCHAR(50) NOT NULL)"
                        );
      
      statement.addBatch("CREATE TABLE entities ("
                          + "id IDENTITY,"
                          + "debug_info VARCHAR(500))"
                        );
      
      statement.addBatch("CREATE TABLE entity_names ("
                          + "id INTEGER NOT NULL,"
                          + "name VARCHAR(500),"
                          + "PRIMARY KEY(name),"
                          + "FOREIGN KEY(id) REFERENCES entities(id))"
                        );
      
      statement.addBatch("CREATE TABLE entity_components ("
                          + "entity_id INTEGER NOT NULL,"
                          + "component_id INTEGER NOT NULL,"
                          + "component_data INTEGER NOT NULL,"
                          + "PRIMARY KEY(entity_id, component_id),"
                          + "FOREIGN KEY(entity_id) REFERENCES entities(id),"
                          + "FOREIGN KEY(component_id) REFERENCES components(id)"
                          + ")"
                        );
      
      statement.executeBatch();
      
      
      newEntityWithInfo = 
        new ThreadLocal < PreparedStatement > () {
        @Override protected PreparedStatement initialValue() {
          try{
            return databaseConnection.get().prepareStatement(
                                     "INSERT INTO entities (debug_info)" +
                                     "VALUES (?)");
          } catch (SQLException e) {
            anyException = e;
          }
          return null;
          }
        };
      newEntityWithoutInfo = 
        new ThreadLocal < PreparedStatement > () {
        @Override protected PreparedStatement initialValue() {
          try{
            return databaseConnection.get().prepareStatement(
                                     "INSERT INTO entities (debug_info)" +
                                     "VALUES (NULL)");
          } catch (SQLException e) {
            anyException = e;
          }
          return null;
          }
        };
        
        setEntityName = 
          new ThreadLocal < PreparedStatement > () {
          @Override protected PreparedStatement initialValue() {
            try{
              return databaseConnection.get().prepareStatement(
                                       "INSERT INTO entity_names (id, name)" +
                                       "VALUES (?,?)");
            } catch (SQLException e) {
              anyException = e;
            }
            return null;
          }
        };
        
        lastAutoIncrement = 
          new ThreadLocal < CallableStatement > () {
          @Override protected CallableStatement initialValue() {
            try{
              return databaseConnection.get().prepareCall("CALL IDENTITY();");
            } catch (SQLException e) {
              anyException = e;
            }
            return null;
          }
        };
      
      
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
    testExceptions();
  }

  public int createEntity(String entityName, String entityDebugInfo) {
    try {
      int newId;
        
      if(entityDebugInfo == null) {
        newEntityWithoutInfo.get().execute();
      } else {
        newEntityWithInfo.get().setString(1, entityDebugInfo);
        newEntityWithInfo.get().execute();
      }
      
      newId = lastAutoIncrement();
      
      if(entityName != null) {
        setEntityName.get().setInt(1, newId);
        setEntityName.get().setString(2, entityName);
        setEntityName.get().execute();
      }

      testExceptions();
      return newId;
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
    
  }
  
  public RuntimeComponent createComponent(RuntimeComponent qc, String tableName) {
    
    assert qc.isValid();
    
    DBComponent component = new DBComponent();
    
    String name = qc.getBinaryName();
    if(tableName == null) {
      tableName = name.replace('.', '_');
      if(componentTables.contains(tableName)) {
        int num = 0;
        while(componentTables.contains(tableName + num)) {
          ++num;
        }
        tableName += num;
      }
    } else if(componentTables.contains(tableName)) {
      throw new IllegalArgumentException("Table name " + tableName + " already exists");
    }
    
    try {
      PreparedStatement ps = databaseConnection.get().prepareStatement(
                                "INSERT INTO components "
                              + "(name, description, table_name)"
                              + "VALUES (?,?,?)");
      
      ps.setString(1, name);
      ps.setString(2, qc.getDescription());
      ps.setString(3, tableName);
      ps.execute();

      component.id = lastAutoIncrement();
      component.tableName = tableName;
      component.original = qc;
      
      Statement statement = databaseConnection.get().createStatement();
      
      String createTableStatement = "CREATE TABLE " + tableName + "(";
      createTableStatement += "data_id IDENTITY"; 
        
      for(QuadrigaComponent depen : qc.getDependencies()) {
        component.dependencies.add(depen);
      }
      
        
      for(String field : qc.getAllFields()) {
        createTableStatement += ", " + field + " ";
        
        component.fields.put(field,qc.getField(field));
        component.fieldList.add(field);
        
        JavaType type = qc.getField(field).type;
        if(type instanceof PrimitiveTypeRef) {
          switch(((PrimitiveTypeRef)type).type) {
          case BOOLEAN:
            createTableStatement += "BOOLEAN";
            break;
          case CHAR:
            createTableStatement += "INTEGER";
            break;
          case BYTE:
            createTableStatement += "TINYINT";
            break;
          case SHORT:
            createTableStatement += "SMALLINT";
            break;
          case INT:
            createTableStatement += "INTEGER";
            break;
          case LONG:
            createTableStatement += "BIGINT";
            break;
          case FLOAT:
            createTableStatement += "FLOAT";
            break;
          case DOUBLE:
            createTableStatement += "DOUBLE";
            break;
          default:
            throw new IllegalArgumentException("Component " + qc.getBinaryName()
                + " field " + field + " type not suported.");
          }
        } else {
          createTableStatement += "OTHER";
        }
      }
      
      createTableStatement += " )";
      
      
      statement.execute(createTableStatement);
      
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
    
    testExceptions();
    components.add(component);
    return component;
  }
  
  private int lastAutoIncrement() throws SQLException {
    ResultSet rs = lastAutoIncrement.get().executeQuery();
    rs.next();
    return rs.getInt(1);
  }
  
  private void testExceptions() {
    if(anyException != null)
      throw new IllegalStateException(anyException);
  }
  
  public String printAllTables() {
    StringBuilder builder = new StringBuilder();
    
    
    
    try {
      Statement st = databaseConnection.get().createStatement();
    
      ResultSet rs = st.executeQuery("SELECT id, debug_info FROM entities");
      builder.append("HSQLDB Entity System\nENTITIES:\n");
      while(rs.next()) {
        builder.append("  id: ");
        builder.append(rs.getInt(1));
        builder.append(", debug_info: ");
        builder.append(rs.getString(2));
        builder.append('\n');
      }
      
      
    
      rs = st.executeQuery("SELECT id, name FROM entity_names");
      builder.append("\nENTITY NAMES:\n");
      while(rs.next()) {
        builder.append("  id: ");
        builder.append(rs.getInt(1));
        builder.append(", name: ");
        builder.append(rs.getString(2));
        builder.append('\n');
      }
      
      
      List<String> compTables = new LinkedList<String>();
    
      rs = st.executeQuery("SELECT id, name, description, table_name FROM components");
      builder.append("\nCOMPONENTS:\n");
      while(rs.next()) {
        builder.append("  id: ");
        builder.append(rs.getInt(1));
        builder.append("\n   name: ");
        builder.append(rs.getString(2));
        builder.append("\n   description: ");
        builder.append(rs.getString(3));
        builder.append("\n   table name: ");
        builder.append(rs.getString(4));
        compTables.add(rs.getString(4));
        builder.append('\n');
      }
      
      for(DBComponent component : components) {
        rs = st.executeQuery("SELECT * FROM " + component.tableName);
        builder.append('\n');
        builder.append("TABLE ");
        builder.append(component.tableName);
        builder.append('\n');
        
        component.printAllTable(builder);
      }
      
      
      
      

    } catch (SQLException e) {
      e.printStackTrace();
    }
    return builder.toString();
  }
  
  
  private final class DBComponent implements RuntimeComponent {
    
    private int id;
    private String tableName;
    
    Map<String,ComponentField> fields = new HashMap<String, ComponentField>();
    List<String> fieldList = new ArrayList<String>();
    Set<QuadrigaComponent> dependencies = new HashSet<QuadrigaComponent>();
    
    RuntimeComponent original;
    
    final ThreadLocal<PreparedStatement> 
                        getDescription = new ThreadLocal <PreparedStatement> () {
                                        @Override protected PreparedStatement initialValue() {
                                          try{
                                            return databaseConnection.get().prepareStatement(
                                                                     "SELECT description FROM components WHERE id = " + id);
                                          } catch (SQLException e) {
                                            anyException = e;
                                          }
                                          return null;
                                          }
                                        },
                        getName = new ThreadLocal <PreparedStatement> () {
                                          @Override protected PreparedStatement initialValue() {
                                            try{
                                              return databaseConnection.get().prepareStatement(
                                                                       "SELECT name FROM components WHERE id = " + id);
                                            } catch (SQLException e) {
                                              anyException = e;
                                            }
                                            return null;
                                            }
                                          },
                        createObject = new ThreadLocal <PreparedStatement> () {
                                          @Override protected PreparedStatement initialValue() {
                                            try{
                                              
                                              String names = null, quest = null;
                                              boolean first = true;
                                              for(String field : fieldList) {
                                                if(first) {
                                                  names = field;
                                                  quest = "?";
                                                  first = false;
                                                } else {
                                                  names += ", " + field;
                                                  quest = ", ?";
                                                }
                                              }
                                              
                                              String st = "INSERT INTO " + tableName
                                                        + "(" + names + ")" 
                                                        + "VALUES (" + quest + ")";
                                              
                                              return databaseConnection.get().prepareStatement(st);
                                            } catch (SQLException e) {
                                              anyException = e;
                                            }
                                            return null;
                                            }
                                          };
    

    @Override
    public ComponentObject createObject(Map<String, ComputedValue> arguments) {
      
      DBComponentObject componentObject = new DBComponentObject();
      
      try {
        ComponentObject base = original.createObject(arguments);
        
        PreparedStatement createObject = this.createObject.get();
        
        int i = 0;
        for(String field: fieldList) {
          ++i;
          JavaType type = getField(field).type;
          
          ComputedValue cv = base.getFieldValue(field);
          
          if(type instanceof PrimitiveTypeRef) {
            switch(((PrimitiveTypeRef)type).type) {
            case BOOLEAN:
              createObject.setBoolean(i, cv.getAsBool());
              break;
            case CHAR:
              createObject.setInt(i, cv.getAsChar());
              break;
            case BYTE:
              createObject.setByte(i, cv.getAsByte());
              break;
            case SHORT:
              createObject.setShort(i, cv.getAsShort());
              break;
            case INT:
              createObject.setInt(i, cv.getAsInt());
              break;
            case LONG:
              createObject.setLong(i, cv.getAsLong());
              break;
            case FLOAT:
              createObject.setFloat(i, cv.getAsFloat());
              break;
            case DOUBLE:
              createObject.setDouble(i, cv.getAsDouble());
              break;
            default:
              throw new IllegalArgumentException("Component " + getBinaryName()
                  + " field " + field + " type not suported.");
            }
          } else {
            createObject.setObject(i, cv.getAsObject());
          }
        }
        
        createObject.execute();
        
        componentObject.id = lastAutoIncrement();
      } catch(SQLException e) {
        throw new IllegalStateException(e);
      }
      
      testExceptions();
      return componentObject;
    }

    @Override
    public Set<String> getAllFields() {
      return fields.keySet();
    }

    @Override
    public Set<QuadrigaComponent> getDependencies() {
      return dependencies;
    }

    @Override
    public JavaType getFieldType(String field) {
      return fields.get(field).type;
    }

    @Override
    public String getDescription() {
      try {
        ResultSet rs = getDescription.get().executeQuery();
        rs.next();
        testExceptions();
        return rs.getString(1);
      } catch (SQLException e) {
        throw new IllegalStateException(e);
      }
    }

    @Override
    public ComponentField getField(String name) {
      return fields.get(name);
    }

    @Override
    public QuadrigaComponent getValid(SymbolTable symbolTable, ErrorLog errorLog) {
      return this;
    }

    @Override
    public String getBinaryName() {
      try {
        ResultSet rs = getName.get().executeQuery();
        rs.next();
        testExceptions();
        return rs.getString(1);
      } catch (SQLException e) {
        throw new IllegalStateException(e);
      }
    }

    @Override
    public String getInstanceableName() {
      //TODO
      return null;
    }

    @Override
    public BaseType getMathematicResultType(BaseType other) {
      return null;
    }

    @Override
    public boolean isAssignableFrom(BaseType rightOperand) {
      return false;
    }

    @Override
    public boolean isMathematicallyOperable() {
      return false;
    }

    @Override
    public boolean isSerializable() {
      return false;
    }

    @Override
    public boolean isValid() {
      return true;
    }

    @Override
    public String treeStringRepresentation() {
      return getBinaryName();
    }
    
    void printAllTable(StringBuilder sb) throws SQLException {
      
      String select = "SELECT data_id";
      
      for(String field : getAllFields()) {
        select += ", " + field;
      }
      
      select += " FROM " + tableName;
      
      Statement st = databaseConnection.get().createStatement();
      
      ResultSet rs = st.executeQuery("SELECT * FROM " + tableName);
      while(rs.next()) {
        sb.append("  id: ");
        sb.append(rs.getInt(1));
        
        for(String field : getAllFields()) {
          sb.append("\n   ");
          sb.append(field);
          sb.append(": ");
          
          JavaType type = getField(field).type;
          if(type instanceof PrimitiveTypeRef) {
            switch(((PrimitiveTypeRef)type).type) {
            case BOOLEAN:
              sb.append(rs.getBoolean(field));
              break;
            case CHAR:
              break;
            case BYTE:
              sb.append(rs.getByte(field));
              break;
            case SHORT:
              sb.append(rs.getShort(field));
              break;
            case INT:
              sb.append(rs.getInt(field));
              break;
            case LONG:
              sb.append(rs.getLong(field));
              break;
            case FLOAT:
              sb.append(rs.getFloat(field));
              break;
            case DOUBLE:
              sb.append(rs.getDouble(field));
              break;
            default:
              throw new IllegalArgumentException("Component " + getBinaryName()
                  + " field " + field + " type not suported.");
            }
          } else {
            sb.append(rs.getObject(field));
          }
        }
        
        sb.append('\n');
      }
    }
    
    
    private class DBComponentObject implements ComponentObject {
      
      int id;

      @Override
      public void copy(ComponentObject other) {
        // TODO Auto-generated method stub
        
      }

      @Override
      public RuntimeComponent getComponent() {
        return DBComponent.this;
      }

      @Override
      public ComputedValue getFieldValue(String field) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void setFieldValue(String field, ComputedValue value) {
        // TODO Auto-generated method stub
        
      }
    }
    
  }
}
