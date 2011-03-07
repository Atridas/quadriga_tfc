package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.DirectDataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.WriteAccess;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent.ComponentField;

public final class ComponentFieldAccess extends DirectDataAccess {
  
  public final String field;
  public final QuadrigaComponent component;
  
  public final ExpressionNode reference;

  public ComponentFieldAccess(ExpressionNode reference, String field, CodeZone cz) {
    super(cz);
    this.field = field;
    this.component = (QuadrigaComponent)reference.getType();
    this.reference = reference;
  }
  
  public boolean isStatic() {
    return false;
  }
  
  @Override
  public String getOperation() {
    ComponentField cf = component.getField(field);
    if(cf == null) {
      return ">> Wrong Component Field: <<";
    }
    return "Component Field:";
  }
  
  @Override
  public String[] getOperands() {
    String[] aux = { component.getBinaryName() + " -> " + field,
                     reference.treeStringRepresentation()}; 
    return aux;
  }

  @Override
  public BaseType getType() {
    ComponentField cf = component.getField(field);
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

  @Override
  public ComponentFieldAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public WriteAccess getWriteVersion() {
    return new WriteVersion();
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
    public WriteAccess getWriteVersion() {
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
    
  }

}
