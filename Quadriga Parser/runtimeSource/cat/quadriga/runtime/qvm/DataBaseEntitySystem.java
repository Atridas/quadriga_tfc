package cat.quadriga.runtime.qvm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.parsers.code.types.qdg.QuadrigaField;
import cat.quadriga.runtime.ComponentInstance;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.EntitySystem;
import cat.quadriga.runtime.JavaReference;
import cat.quadriga.runtime.RuntimeComponent;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.RuntimeSystem;

public class DataBaseEntitySystem implements EntitySystem {
  private final ThreadLocal<Connection> databaseConnection;
  
  private final ThreadLocal<PreparedStatement> 
                        newEntity,
                        setEntityName;
  
  private final ThreadLocal<CallableStatement> lastAutoIncrement;
  
  private Exception anyException = null;
  
  
  
  private final Set<String> componentTables = new HashSet<String>();
  private final Map<String,DBComponent> components = new HashMap<String,DBComponent>();
  private final Map<String, Integer> systemIds = new HashMap<String, Integer>();
  
  public DataBaseEntitySystem() {
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
      
      databaseConnection.get().setAutoCommit(true);
      
      statement.addBatch("CREATE TABLE components ("
                          + "id IDENTITY,"
                          + "name VARCHAR(500) NOT NULL,"
                          + "description VARCHAR(1000),"
                          + "table_name VARCHAR(50) NOT NULL)"
                        );
      
      statement.addBatch("CREATE TABLE entities ("
                          + "id IDENTITY,"
                          + "parent INTEGER NOT NULL,"
                          + "debug_info VARCHAR(500))"
                        );
      
      statement.addBatch("CREATE TABLE entity_names ("
                          + "id INTEGER NOT NULL,"
                          + "parent INTEGER NOT NULL,"
                          + "name VARCHAR(500),"
                          + "PRIMARY KEY(parent,name),"
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
      
      statement.addBatch("CREATE TABLE Systems ("
                          + "id IDENTITY,"
                          + "name VARCHAR(500)"
                          + ")"
                        );
      
      statement.addBatch("CREATE TABLE System_Components ("
                          + "system_id INTEGER NOT NULL,"
                          + "component_id INTEGER NOT NULL,"
                          + "PRIMARY KEY(system_id, component_id),"
                          + "FOREIGN KEY(system_id) REFERENCES Systems(id),"
                          + "FOREIGN KEY(component_id) REFERENCES components(id)"
                          + ")"
                        );
      
      statement.addBatch("CREATE TABLE System_Last_Iteration ("
                          + "system_id INTEGER NOT NULL,"
                          + "entity_id INTEGER NOT NULL,"
                          + "PRIMARY KEY(system_id, entity_id),"
                          + "FOREIGN KEY(system_id) REFERENCES Systems(id)"
                          + ")"
                        );
      
      statement.executeBatch();
      
      
      newEntity = 
        new ThreadLocal < PreparedStatement > () {
        @Override protected PreparedStatement initialValue() {
          try{
            return databaseConnection.get().prepareStatement(
                                     "INSERT INTO entities (parent,debug_info)" +
                                     "VALUES (?,?)");
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
                                       "INSERT INTO entity_names (id, parent, name)" +
                                       "VALUES (?,?,?)");
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

  @Override
  public Entity createEntity(String entityName, String entityDebugInfo, Entity father,
      RuntimeEnvironment runtime) {
    try {
      
      DBEntity dbFather;
      if(father == null || father instanceof DBEntity) {
        dbFather = (DBEntity)father;
        //TODO comprovar que sigui de la mateixa BBDD?
      } else {
        throw new IllegalArgumentException("Type of father " + father + " no compatible.");
      }
      
      DBEntity entity = new DBEntity();
        
      if(dbFather == null) {
        newEntity.get().setInt(1, -1);
      } else {
        newEntity.get().setInt(1, dbFather.id);
      }
        
      if(entityDebugInfo == null) {
        newEntity.get().setNull(2, Types.VARCHAR);
      } else {
        newEntity.get().setString(2, entityDebugInfo);
      }
      newEntity.get().execute();

      entity.id = lastAutoIncrement();
      
      if(entityName != null) {
        setEntityName.get().setInt(1, entity.id);
        if(dbFather == null) {
          setEntityName.get().setInt(2, -1);
        } else {
          setEntityName.get().setInt(2, dbFather.id);
        }
        setEntityName.get().setString(3, entityName);
        setEntityName.get().execute();
      }

      testExceptions();
      return entity;
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
    
  }
  
  @Override
  public RuntimeComponent createComponent(RuntimeComponent qc, String tableName,
      RuntimeEnvironment runtime) {
    
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
      
      List<String> entityRefs = new LinkedList<String>();
        
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
        } else if(type instanceof QuadrigaEntity) {
          createTableStatement += "INTEGER";
          entityRefs.add(field);
        } else {
          createTableStatement += "OTHER";
        }
      }
      
      for(String entityRef : entityRefs) {
        createTableStatement += 
                      ", FOREIGN KEY (" + entityRef + 
                      ") REFERENCES entities(id)";
      }
      
      createTableStatement += " )";
      
      
      statement.execute(createTableStatement);
      
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
    
    testExceptions();
    components.put(component.getBinaryName(), component);
    return component;
  }
  
  @Override
  public void registerSystem(RuntimeSystem system, RuntimeEnvironment runtime) {
    if(systemIds.containsKey(system.getBinaryName())) return;
    
    
    String sql = "INSERT INTO systems (name) VALUES (\'" + system.getBinaryName() + "\')";
    
    try {
      databaseConnection.get().prepareStatement(sql).execute();
      
      int id = lastAutoIncrement();
      
      
      for(QuadrigaComponent c : system.neededComponents()) {
        DBComponent dbComp = this.components.get(c.getBinaryName());
        if(dbComp == null) {
          dbComp = (DBComponent)createComponent((RuntimeComponent)c, null, runtime);
        }
        
        int componentId = dbComp.id;
        
        sql = "INSERT INTO system_components (system_id, component_id)"
            + "VALUES(" + id + ", " + componentId + ")";
        
        databaseConnection.get().prepareStatement(sql).execute();
      }
      
      
      
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
    
  }
  
  @Override
  public void getSystemUpdateInformation(
      RuntimeSystem system,
      List<Entity> update,
      List<Entity> newEntities,
      List<Entity> deletedEntities,
      RuntimeEnvironment runtime)
  {
    String sql;
    ResultSet rs;
    PreparedStatement ps;
    SortedSet<Integer> actualEntities = null;
    if(system.hasNewOrDelete()) {
      actualEntities = new TreeSet<Integer>();
    }
    try {
      sql = "SELECT COUNT(*) " +
          "FROM System_Components SC, Systems S " +
          "WHERE S.name = ? " +
          "  AND SC.system_id = S.id";
      ps = databaseConnection.get().prepareStatement(sql);
      ps.setString(1, system.getBinaryName());
      rs = ps.executeQuery();
      rs.next();
      int count = rs.getInt(1);
      
      
      sql = 
        "SELECT C.entity_id " +
        "FROM Entity_Components C, System_Components SC, Systems S " +
        "WHERE S.name = ? " +
        "  AND SC.system_id = S.id " +
        "  AND C.component_id = SC.component_id " +
        "ORDER BY C.entity_id";
      ps = databaseConnection.get().prepareStatement(sql);
      ps.setString(1, system.getBinaryName());
      
      rs = ps.executeQuery();
      
      int lastId = -1;
      int it = 0;
      while(rs.next()) {
        int id = rs.getInt(1);
        if(id != lastId) {
          if(it == count) {
            DBEntity entity = new DBEntity();
            entity.id = lastId;
            update.add(entity);
            if(system.hasNewOrDelete()) {
              actualEntities.add(lastId);
            }
          }
          lastId = id;
          it = 0;
        }
        ++it;
      }
      if(it == count) {
        DBEntity entity = new DBEntity();
        entity.id = lastId;
        update.add(entity);
      }
      
      if(system.hasNewOrDelete()) {
        SortedSet<Integer> prevEntities = new TreeSet<Integer>();
        
        sql = "SELECT SLI.entity_id " +
        		  "FROM System_last_iteration SLI, Systems S " +
        		  "WHERE SLI.system_id = S.id AND S.name = ?";
        ps = databaseConnection.get().prepareStatement(sql);
        ps.setString(1, system.getBinaryName());
        rs = ps.executeQuery();
        
        while(rs.next()) {
          prevEntities.add(rs.getInt(1));
        }
        

        Set<Integer> auxSet = new TreeSet<Integer>(actualEntities);
        auxSet.removeAll(prevEntities);
        
        for(int id : auxSet) {
          DBEntity entity = new DBEntity();
          entity.id = id;
          newEntities.add(entity);
        }
        
        auxSet.clear();
        auxSet.addAll(prevEntities);
        auxSet.removeAll(actualEntities);
        
        for(int id : auxSet) {
          DBEntity entity = new DBEntity();
          entity.id = id;
          deletedEntities.add(entity);
        }
      }
      
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
    
  }
  
  @Override
  public Entity findEntity(int guid) {
    DBEntity entity = new DBEntity();
    entity.id = guid;
    return entity;
  }
  
  @Override
  public Entity findEntity(String name) {
    return findEntity(name, null);
  }
  @Override
  public Entity findEntity(String name, Entity parent) {
    int parentId;
    if(parent == null) {
      parentId = -1;
    } else if(parent instanceof DBEntity) {
      parentId = ((DBEntity)parent).id;
      
      //TODO comprovar que la entitat sigui del "sistema" correcte
    } else {
      throw new IllegalArgumentException("Entity of class " + parent.getClass() + " not supported.");
    }
    String st = "SELECT id FROM entity_names WHERE parent = ? AND name = ?";
    
    try {
      PreparedStatement ps = databaseConnection.get().prepareStatement(st);
      
      ps.setInt(1, parentId);
      ps.setString(2, name);
      
      ResultSet rs = ps.executeQuery();
      
      if(rs.next()) {
        DBEntity result = new DBEntity();
        result.id = rs.getInt(1);
        return result;
      } else {
        if(parentId == -1) {
          return null;
        } else {
          return null;
        }
      }
      
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
    
    
  }
  
  @Override
  public void addComponent(Entity entity, ComponentInstance component,
      RuntimeEnvironment runtimeEnv) {
    DBComponent.DBComponentObject dbCompInstance;
    DBEntity dbEntity;
    if(entity instanceof DBEntity) {
      dbEntity = (DBEntity) entity;
      //TODO comprovar que sigui d'aquesta BBDD
    } else {
      throw new IllegalArgumentException("Type of entity " + entity + " not compatible.");
    }
    
    
    if(component instanceof DBComponent.DBComponentObject) {
      dbCompInstance = (DBComponent.DBComponentObject)component;
      //TODO assegurar-se que no estigui assignat? o no cal?
      
      //TODO assegurar-se que sigui d'aquesta classe?¿
    } else {
      RuntimeComponent runtime = component.getComponent();
      DBComponent dbComp = components.get(runtime.getBinaryName());
      if(dbComp == null) {
        dbComp = (DBComponent)createComponent(runtime, null, runtimeEnv);
      }
      dbCompInstance = (DBComponent.DBComponentObject) dbComp.createInstance(component.getFieldValues(),runtimeEnv);
    }
    
    //TODO cachejar l'statement?
    try {
      PreparedStatement ps = databaseConnection.get().prepareStatement(
                                "INSERT INTO entity_components "
                              + "(entity_id, component_id, component_data) "
                              + "VALUES (?, ?, ?)");
      
      ps.setInt(1, dbEntity.id);
      ps.setInt(2, dbCompInstance.getComponentTypeId());
      ps.setInt(3, dbCompInstance.id);
      
      ps.execute();
      
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }
    
  }
  
  @Override
  public List<Entity> getAllEntitiesWithComponents(
      Set<QuadrigaComponent> components, 
      RuntimeEnvironment runtime) 
  {
    //List<DBComponent> dbComponents = new ArrayList<DBComponent>(components.size());
    List<String> subtables = new ArrayList<String>(components.size());
    for(QuadrigaComponent comp : components) {
      DBComponent dbComp = this.components.get(comp.getBinaryName());
      if(dbComp == null) {
        dbComp = (DBComponent)createComponent((RuntimeComponent)comp, null, runtime);
      }
      
      String aux = "SELECT entity_id FROM entity_components WHERE component_id = " + dbComp.id;
      subtables.add(aux);
    }

    String statement;
    if(subtables.size() == 0) {
      statement = "SELECT id FROM entities";      
    } else if(subtables.size() == 1) {
      statement = subtables.get(0);   
    } else {
      String from = "";
      String where = "";
      for(int i = 0; i < subtables.size(); ++i) {
        if(i!=0) from += ",";
        from += " (" + subtables.get(i) + ") T" + i;
        
        if(i>1) where += " AND";
        if(i>0) where += " T" + i + ".entity_id = T0.entity_id";
      }
      
      statement = "SELECT entity_id FROM " + from + " WHERE " + where;
    }

    try {
      ResultSet rs = databaseConnection.get().prepareStatement(statement).executeQuery();
    
      List<Entity> entities = new ArrayList<Entity>(0);
      while(rs.next()) {
        DBEntity entity = new DBEntity();
        entity.id = rs.getInt(1);
        
        for(QuadrigaComponent comp : components) {
          entity.cacheComponent(comp);
        }
        
        entities.add(entity);
      }
      
      return entities;
      
    } catch (SQLException e) {
      throw new IllegalStateException(e);
    }

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
    
      ResultSet rs = st.executeQuery("SELECT id, parent, debug_info FROM entities");
      builder.append("HSQLDB Entity System\nENTITIES:\n");
      while(rs.next()) {
        builder.append("  id: ");
        builder.append(rs.getInt(1));
        int parent = rs.getInt(2);
        if(parent >= 0) {
          builder.append("\n   parent: ");
          builder.append(parent);
        }
        builder.append("\n   debug_info: ");
        builder.append(rs.getString(3));
        builder.append('\n');
      }

      
      
      rs = st.executeQuery("SELECT id, parent, name FROM entity_names");
      builder.append("\nENTITY NAMES:\n");
      while(rs.next()) {
        builder.append("  id: ");
        builder.append(rs.getInt(1));
        int parent = rs.getInt(2);
        if(parent >= 0) {
          builder.append("\n   parent: ");
          builder.append(parent);
        }
        builder.append("\n   name: ");
        builder.append(rs.getString(3));
        builder.append('\n');
      }
      
    
      rs = st.executeQuery("SELECT entity_id, component_id, component_data FROM entity_components");
      builder.append("\nENTITY COMPONENTS:\n");
      while(rs.next()) {
        builder.append("  entity: ");
        builder.append(rs.getInt(1));
        builder.append(", component type: ");
        builder.append(rs.getInt(2));
        builder.append(", component: ");
        builder.append(rs.getInt(3));
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
      
      for(DBComponent component : components.values()) {
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
  
  public String printAllEntities() {
    StringBuilder builder = new StringBuilder();

    List<String> aux = new LinkedList<String>();
    try {
      Statement st = databaseConnection.get().createStatement();
    
      ResultSet rs = st.executeQuery("SELECT id FROM entities WHERE parent = -1");
      builder.append("HSQLDB Entity System\n\n");
      
      while(rs.next()) {
        DBEntity ent = new DBEntity();
        ent.id = rs.getInt(1);
        aux.add(ent.print());
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return Utils.treeStringRepresentation("ENTITIES", aux);
  }
  
  public String toString() {
    return printAllEntities();
  }
  
  private final class DBEntity implements Entity {
    
    /**
     * 
     */
    private static final long serialVersionUID = 5442595694189819152L;
    int id;
    private Map<String,DBComponent.DBComponentObject> cachedComponents = new HashMap<String,DBComponent.DBComponentObject>();

    @Override
    public Entity getParent() {
      DBEntity father = new DBEntity();
      
      
      try {
        PreparedStatement st = databaseConnection.get().prepareStatement(
                                  "SELECT parent " +
                                  "FROM entities " +
                                  "WHERE id = " + id);
        
        ResultSet rs = st.executeQuery();
        if(rs.next()) {
          father.id = rs.getInt(1);
          if(father.id >= 0) 
            return father;
        }
        
        return null;
      } catch(SQLException e) {
        throw new IllegalStateException(e);
      }
    }

    @Override
    public boolean getAsBool() {
      throw new IllegalStateException("Error");
    }

    @Override
    public byte getAsByte() {
      throw new IllegalStateException("Error");
    }

    @Override
    public char getAsChar() {
      throw new IllegalStateException("Error");
    }

    @Override
    public double getAsDouble() {
      throw new IllegalStateException("Error");
    }

    @Override
    public float getAsFloat() {
      throw new IllegalStateException("Error");
    }

    @Override
    public int getAsInt() {
      throw new IllegalStateException("Error");
    }

    @Override
    public long getAsLong() {
      throw new IllegalStateException("Error");
    }

    @Override
    public Object getAsObject() {
      return this;
    }

    @Override
    public short getAsShort() {
      throw new IllegalStateException("Error");
    }

    @Override
    public String getStringValue() {
      return toString();
    }

    @Override
    public BaseType getType() {
      //TODO
      return QuadrigaEntity.baseEntity;
    }

    @Override
    public void set(ComputedValue other) {
      throw new IllegalStateException("Error");
    }
    
    
    public String print() throws SQLException {
      List<String> aux = new LinkedList<String>();
      
      Statement st = databaseConnection.get().createStatement();
      
      ResultSet rs = st.executeQuery(
                      "SELECT debug_info " +
                      "FROM entities " +
                      "WHERE id = " + id);
      
      rs.next();
      aux.add("debug_info: " + rs.getString(1));
      
      rs = st.executeQuery(
          "SELECT name " +
          "FROM entity_names " +
          "WHERE id = " + id);
      
      if(rs.next()) {
        aux.add("name: " + rs.getString(1));
      }
      
      rs = st.executeQuery(
          "SELECT C.name " +
          "FROM entity_components EC, components C " +
          "WHERE entity_id = " + id +
          " AND EC.component_id = C.id");
      while(rs.next()) {
        String componentName = rs.getString(1);
        
        
        ComponentInstance ci = getComponent(components.get(componentName));
        DBComponent.DBComponentObject dbci = (DBComponent.DBComponentObject)ci;
        
        aux.add(Utils.treeStringRepresentation(
                         "Component: " + componentName, dbci.print(st)));
      }
      
      
      rs = st.executeQuery("SELECT id FROM entities WHERE parent = " + id);
      while(rs.next()) {
        DBEntity ent = new DBEntity();
        ent.id = rs.getInt(1);
        aux.add(Utils.treeStringRepresentation(
                  "child:", ent.print()));
      }
      return Utils.treeStringRepresentation("id: " + id, aux);
    }

    @Override
    public ComponentInstance getComponent(QuadrigaComponent type) {
      ComponentInstance ci = cachedComponents.get(type.getBinaryName());
      if(ci!=null) return ci;
      
      DBComponent dbc = components.get(type.getBinaryName());
      
      try {
        ci = dbc.getComponent(this);
        cachedComponents.put(type.getBinaryName(), (DBComponent.DBComponentObject)ci);
        return ci;
      } catch (SQLException e) {
        throw new IllegalStateException(e);
      }
    }
    
    @Override
    public void cacheComponent(QuadrigaComponent component) {
      if( cachedComponents.containsKey(component.getBinaryName()) ) return;
      DBComponent dbc = components.get(component.getBinaryName());
      
      try {
        cachedComponents.put(
            component.getBinaryName(), 
            dbc.getComponent(this));
      } catch (SQLException e) {
        throw new IllegalStateException(e);
      }
      
    }

    @Override
    public void commitChanges() {
      for(ComponentInstance ci : cachedComponents.values()) {
        ci.commitChanges();
      }
    }
    
    @Override
    public String toString() {
      return "DBEntity: " + id;
    }

    @Override
    public int getGUID() {
      return id;
    }
  }
  
  private final class DBComponent implements RuntimeComponent {
    
    private int id;
    private String tableName;
    
    Map<String,QuadrigaField> fields = new HashMap<String, QuadrigaField>();
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
                                              
                                              String names = "data_id", quest = "NULL";
                                              for(String field : fieldList) {
                                                names += ", " + field;
                                                quest += ", ?";
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
    public ComponentInstance createInstance(Map<String, ComputedValue> arguments, RuntimeEnvironment runtime) {

      DBComponentObject componentObject = new DBComponentObject();
      
      PreparedStatement createObject = this.createObject.get();
      
      try {
        ComponentInstance base = original.createInstance(arguments, runtime);
        
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
          } else if(type instanceof QuadrigaEntity) {
            createObject.setInt(i, ((DBEntity)cv).id);
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
    
    public DBComponentObject getComponent(DBEntity entity) throws SQLException {
      String statement =  "SELECT component_data " +
                          "FROM entity_components " +
                          "WHERE entity_id = " + entity.id +
                          " AND component_id = " + id;
      
      ResultSet rs = databaseConnection.get().createStatement().executeQuery(statement);
      
      rs.next();
      DBComponentObject dbobj = new DBComponentObject();
      dbobj.id = rs.getInt(1);
      return dbobj;
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
    public QuadrigaField getField(String name) {
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
              sb.append(rs.getInt(field));
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
          } else if(type instanceof QuadrigaEntity) {
            sb.append("Entity: ");
            sb.append(rs.getInt(1));
          } else {
            sb.append(rs.getObject(field));
          }
        }
        
        sb.append('\n');
      }
    }
    
    
    private class DBComponentObject implements ComponentInstance {
      
      int id;
      private final Map<String,ComputedValue> cachedFields = new HashMap<String, ComputedValue>();
      private final Map<String,ComputedValue> changedFields = new HashMap<String, ComputedValue>();

      private int getComponentTypeId() {
        return DBComponent.this.id;
      }
      
      @Override
      public void copy(ComponentInstance other) {
        cachedFields.clear();
        changedFields.clear();
        String sql = "UPDATE " + tableName + " SET ";
        boolean first = true;
        for(String field: fieldList) {
          if(first) {
            sql += field + "=?";
            first = false;
          } else {
            sql += ", " + field + "=?";
          }
        }
        sql += " WHERE data_id = " + id;
        
        try {
          PreparedStatement ps = databaseConnection.get().prepareStatement(sql);
          
          int i = 0;
          for(String field: fieldList) {
            ++i;
            JavaType type = getField(field).type;
            ComputedValue cv = other.getFieldValue(field);
            if(type instanceof PrimitiveTypeRef) {
              switch(((PrimitiveTypeRef)type).type) {
              case BOOLEAN:
                ps.setBoolean(i,cv.getAsBool());
                break;
              case CHAR:
                ps.setInt(i, cv.getAsChar());
                break;
              case BYTE:
                ps.setByte(i, cv.getAsByte());
                break;
              case SHORT:
                ps.setShort(i, cv.getAsShort());
                break;
              case INT:
                ps.setInt(i, cv.getAsInt());
                break;
              case LONG:
                ps.setLong(i, cv.getAsLong());
                break;
              case FLOAT:
                ps.setFloat(i, cv.getAsFloat());
                break;
              case DOUBLE:
                ps.setDouble(i, cv.getAsDouble());
                break;
              default:
                throw new IllegalArgumentException("Component " + getBinaryName()
                    + " field " + field + " type not suported.");
              }
            } else if(type instanceof QuadrigaEntity) {
              ps.setInt(i, ((DBEntity)cv).id);
            } else {
              ps.setObject(i, cv.getAsObject());
            }
          }
          
          ps.execute();
          
        } catch (SQLException e) {
          throw new IllegalStateException(e);
        }
        
        testExceptions();
      }

      @Override
      public RuntimeComponent getComponent() {
        return DBComponent.this;
      }

      @Override
      public ComputedValue getFieldValue(String field) {
        ComputedValue cv = cachedFields.get(field);
        if(cv != null) {
          return cv;
        }
        
        try {
          Statement st = databaseConnection.get().createStatement();
          testExceptions();
          ResultSet rs = st.executeQuery(
                              "SELECT " + field 
                            + " FROM " + tableName 
                            + " WHERE data_id = " + id);
          
          rs.next();
          
          JavaType type = getField(field).type;
          CodeZone cz = CodeZoneClass.runtime;
          if(type instanceof PrimitiveTypeRef) {
            switch(((PrimitiveTypeRef)type).type) {
            case BOOLEAN:
              cv = new LiteralData.BooleanLiteral(rs.getBoolean(1), cz);
              break;
            case CHAR:
              cv = new LiteralData.CharacterLiteral((char)rs.getInt(1), cz);
              break;
            case BYTE:
              cv = new LiteralData.IntegerLiteral(rs.getInt(1), cz);
              break;
            case SHORT:
              cv = new LiteralData.IntegerLiteral(rs.getInt(1), cz);
              break;
            case INT:
              cv = new LiteralData.IntegerLiteral(rs.getInt(1), cz);
              break;
            case LONG:
              cv = new LiteralData.LongLiteral(rs.getLong(1), cz);
              break;
            case FLOAT:
              cv = new LiteralData.FloatLiteral(rs.getFloat(1), cz);
              break;
            case DOUBLE:
              cv = new LiteralData.DoubleLiteral(rs.getDouble(1), cz);
              break;
            default:
              throw new IllegalArgumentException("Component " + getBinaryName()
                  + " field " + field + " type not suported.");
            }
          } else if(type instanceof QuadrigaEntity) {
            DBEntity ent = new DBEntity();
            ent.id = rs.getInt(1);
            cv = ent;
          } else {
            cv = new JavaReference( rs.getObject(1) );
            changedFields.put(field,cv);
          }
        } catch (SQLException e) {
          throw new IllegalStateException(e);
        }
        
        cachedFields.put(field,cv);
        return cv;
        
      }

      @Override
      public void setFieldValue(String field, ComputedValue value) {
        assert fields.get(field) != null;
        cachedFields.put(field,value);
        changedFields.put(field,value);
      }

      @Override
      public void commitChanges() {
        
        if(changedFields.size() == 0) return;
        
        String sql = "UPDATE " + tableName + " SET ";
        boolean first = true;
        for(String field: changedFields.keySet()) {
          if(first) {
            sql += field + "=?";
            first = false;
          } else {
            sql += ", " + field + "=?";
          }
        }
        sql += " WHERE data_id = " + id;
        
        try {
          PreparedStatement ps = databaseConnection.get().prepareStatement(sql);
          
          int i = 0;
          //TODO no m'en fio que segueixi el mateix ordre que abans, s'hauria
          //de re-mirar.
          for(Entry<String, ComputedValue> field: changedFields.entrySet()) {
            ++i;
            JavaType type = getField(field.getKey()).type;
            ComputedValue cv = field.getValue();
            if(type instanceof PrimitiveTypeRef) {
              switch(((PrimitiveTypeRef)type).type) {
              case BOOLEAN:
                ps.setBoolean(i,cv.getAsBool());
                break;
              case CHAR:
                ps.setInt(i, cv.getAsChar());
                break;
              case BYTE:
                ps.setByte(i, cv.getAsByte());
                break;
              case SHORT:
                ps.setShort(i, cv.getAsShort());
                break;
              case INT:
                ps.setInt(i, cv.getAsInt());
                break;
              case LONG:
                ps.setLong(i, cv.getAsLong());
                break;
              case FLOAT:
                ps.setFloat(i, cv.getAsFloat());
                break;
              case DOUBLE:
                ps.setDouble(i, cv.getAsDouble());
                break;
              default:
                throw new IllegalArgumentException("Component " + getBinaryName()
                    + " field " + field + " type not suported.");
              }
            } else if(type instanceof QuadrigaEntity) {
              ps.setInt(i, ((DBEntity)cv).id);
            } else {
              ps.setObject(i, cv.getAsObject());
            }
          }
          
          ps.execute();
          
        } catch (SQLException e) {
          throw new IllegalStateException(e);
        }

        cachedFields.clear();
        testExceptions();
      }

      @Override
      public Map<String, ComputedValue> getFieldValues() {
        String sql = "SELECT ";
        boolean first = true;
        for(String field: getAllFields()) {
          if(!cachedFields.containsKey(field)) {
            if(first) {
              sql += field;
              first = false;
            } else {
              sql += ", " + field;
            }
          }
        }
        sql += " FROM " + tableName + " WHERE data_id = " + id;

        try {
          PreparedStatement ps = databaseConnection.get().prepareStatement(sql);
        
          ResultSet rs = ps.executeQuery();
          
          rs.next();
          
          for(String field: getAllFields()) {
            if(!cachedFields.containsKey(field)) {
              JavaType type = getField(field).type;
              CodeZone cz = CodeZoneClass.runtime;
              ComputedValue cv;
              if(type instanceof PrimitiveTypeRef) {
                switch(((PrimitiveTypeRef)type).type) {
                case BOOLEAN:
                  cv = new LiteralData.BooleanLiteral(rs.getBoolean(field), cz);
                  break;
                case CHAR:
                  cv = new LiteralData.CharacterLiteral((char)rs.getInt(field), cz);
                  break;
                case BYTE:
                  cv = new LiteralData.IntegerLiteral(rs.getInt(field), cz);
                  break;
                case SHORT:
                  cv = new LiteralData.IntegerLiteral(rs.getInt(field), cz);
                  break;
                case INT:
                  cv = new LiteralData.IntegerLiteral(rs.getInt(field), cz);
                  break;
                case LONG:
                  cv = new LiteralData.LongLiteral(rs.getLong(field), cz);
                  break;
                case FLOAT:
                  cv = new LiteralData.FloatLiteral(rs.getFloat(field), cz);
                  break;
                case DOUBLE:
                  cv = new LiteralData.DoubleLiteral(rs.getDouble(field), cz);
                  break;
                default:
                  throw new IllegalArgumentException("Component " + getBinaryName()
                      + " field " + field + " type not suported.");
                }
              } else if(type instanceof QuadrigaEntity) {
                DBEntity entity = new DBEntity();
                entity.id = rs.getInt(field);
                cv = entity;
              } else {
                cv = new JavaReference( rs.getObject(field) );
                changedFields.put(field,cv);
              }
              cachedFields.put(field, cv);
            }
          }
          
        } catch (SQLException e) {
          throw new IllegalStateException(e);
        }
        return cachedFields;
      }

      @Override
      public boolean getAsBool() {
        throw new IllegalStateException("Error");
      }

      @Override
      public byte getAsByte() {
        throw new IllegalStateException("Error");
      }

      @Override
      public char getAsChar() {
        throw new IllegalStateException("Error");
      }

      @Override
      public double getAsDouble() {
        throw new IllegalStateException("Error");
      }

      @Override
      public float getAsFloat() {
        throw new IllegalStateException("Error");
      }

      @Override
      public int getAsInt() {
        throw new IllegalStateException("Error");
      }

      @Override
      public long getAsLong() {
        throw new IllegalStateException("Error");
      }

      @Override
      public Object getAsObject() {
        return this;
      }

      @Override
      public short getAsShort() {
        throw new IllegalStateException("Error");
      }

      @Override
      public String getStringValue() {
        return toString();
      }

      @Override
      public BaseType getType() {
        return DBComponent.this;
      }

      @Override
      public void set(ComputedValue other) {
        throw new IllegalStateException("Error");
      }
      
      public List<String> print(Statement st) throws SQLException {
        ResultSet rs = st.executeQuery(
            "SELECT * " +
            "FROM " + tableName +
            " WHERE data_id = " + id);
        
        List<String> aux = new LinkedList<String>();
        
        while(rs.next()) {
          for(String field : getAllFields()) {
            String f = field + ": ";
            
            JavaType type = getField(field).type;
            if(type instanceof PrimitiveTypeRef) {
              switch(((PrimitiveTypeRef)type).type) {
              case BOOLEAN:
                f += rs.getBoolean(field);
                break;
              case CHAR:
                f += rs.getInt(field);
                break;
              case BYTE:
                f += rs.getByte(field);
                break;
              case SHORT:
                f += rs.getShort(field);
                break;
              case INT:
                f += rs.getInt(field);
                break;
              case LONG:
                f += rs.getLong(field);
                break;
              case FLOAT:
                f += rs.getFloat(field);
                break;
              case DOUBLE:
                f += rs.getDouble(field);
                break;
              default:
                throw new IllegalArgumentException("Component " + getBinaryName()
                    + " field " + field + " type not suported.");
              }
            } else if(type instanceof QuadrigaEntity) {
              f += "Entity " + rs.getInt(field);
            } else {
              f += rs.getObject(field);
            }
            aux.add(f);
          }
        }
        return aux;
      }
    }
    
  }
}
