package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.expressions.dataaccess.UnaryDataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.WriteAccess;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaField;
import cat.quadriga.runtime.ComponentInstance;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class ComponentFieldAccess extends UnaryDataAccess {
  
  public final String field;
  public final QuadrigaComponent component;

  public ComponentFieldAccess(ExpressionNode reference, String field, CodeZone cz) {
    super(reference,cz);
    this.field = field;
    this.component = (QuadrigaComponent)reference.getType();
  }
  
  public boolean isStatic() {
    return false;
  }
  
  @Override
  public String getOperation() {
    QuadrigaField cf = component.getField(field);
    if(cf == null) {
      return ">> Wrong Component Field: <<";
    }
    return "Component Field:";
  }
  
  @Override
  public String[] getOperands() {
    String[] aux = { component.getBinaryName() + " -> " + field,
                     operand.treeStringRepresentation()}; 
    return aux;
  }

  @Override
  public BaseType getType() {
    QuadrigaField cf = component.getField(field);
    if(cf == null) {
      return UnknownType.empty;
    }
    return cf.type;
  }

  @Override
  public boolean isAssignable() {
    //TODO fer-ho depenent de la entitat?
    return true;
  }

  @Override
  public boolean isReadable() {
    //TODO fer-ho depenent de la entitat?
    return true;
  }

  private boolean linked = false;
  private ComponentFieldAccess linkedVersion = null;
  @Override
  public ComponentFieldAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      QuadrigaComponent validC;
      if(component.isValid()) {
        validC = component;
      } else {
        BaseSymbol symbol = symbolTable.findSymbol(component.getBinaryName());
        if( symbol != null 
            && symbol instanceof TypeSymbol
            && ((TypeSymbol)symbol).type instanceof QuadrigaComponent)
        {
          validC = (QuadrigaComponent)((TypeSymbol)symbol).type;
          if(!validC.isValid()) {
            validC = validC.getValid(symbolTable, errorLog);
            if(validC == null) {
              return null;
            }
            symbolTable.addGlobalSymbol(new TypeSymbol(validC));
          }
        } else {
          errorLog.insertError("Error while finding the component" + component.getBinaryName(),this);
          return null;
        }
      }
      ExpressionNode op;
      if(operand.isCorrectlyLinked()) {
        op = operand;
      } else {
        op = operand.getLinkedVersion(symbolTable, errorLog);
        if(op == null) {
          return null;
        }
      }
      
      QuadrigaField field = validC.getField(this.field);
      if(field == null) {
        errorLog.insertError("Component " + validC.getBinaryName() + " has no " + this.field,this);
        return null;
      }

      symbolTable.accesses.add(component);
      if(!(getType() instanceof PrimitiveTypeRef)) {
        symbolTable.writes.add(component);
      }
      
      linkedVersion = new ComponentFieldAccess(op, this.field, this);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

  @Override
  public WriteAccess getWriteVersion(SymbolTable symbolTable) {
    symbolTable.writes.add(component);
    return new WriteVersion();
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }
  
  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    
    ComponentInstance ci = (ComponentInstance) operand.compute(runtime);
    
    ComputedValue cv = ci.getFieldValue(field);
    
    if(cv instanceof Entity) {
      runtime.addToCache((Entity)cv);
    }
    
    return cv;
  }
  
  private class WriteVersion extends ExpressionNodeClass implements WriteAccess {

    public WriteVersion() {
      super(ComponentFieldAccess.this);
    }

    @Override
    public DataAccess getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }

    @Override
    public BaseType getType() {
      return ComponentFieldAccess.this.getType();
    }

    @Override
    public WriteAccess getWriteVersion(SymbolTable symbolTable) {
      return this;
    }

    @Override
    public boolean isAssignable() {
      return true;
    }

    @Override
    public boolean isReadable() {
      return true;
    }

    @Override
    public String[] getOperands() {
      return ComponentFieldAccess.this.getOperands();
    }

    @Override
    public String getOperation() {
      return ComponentFieldAccess.this.getOperation();
    }

    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }

    @Override
    public LiteralData getCompileTimeConstant() {
      return null;
    }

    @Override
    public void setValue(ComputedValue value, RuntimeEnvironment runtime) {
      ComponentInstance ci = (ComponentInstance) operand.compute(runtime);
        
      ci.setFieldValue(field,value);
    }
    
  }

}
