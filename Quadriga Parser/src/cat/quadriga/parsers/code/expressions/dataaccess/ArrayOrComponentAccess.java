package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.types.ArrayType;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;

public final class ArrayOrComponentAccess extends ExpressionNodeClass implements DataAccess {

  public ExpressionNode array;
  public ExpressionNode access;
  
  public ArrayOrComponentAccess(ExpressionNode array, ExpressionNode access, Token t) {
    super(new CodeZoneClass(array, t));
    this.array = array;
    this.access = access;
  }

  @Override
  public String[] getOperands() {
    String[] aux = { array.treeStringRepresentation(), access.treeStringRepresentation() };
    return aux;
  }

  @Override
  public String getOperation() {
    if(array.getType() instanceof QuadrigaEntity) {
      if(access.getType() == ClassOrInterfaceTypeRef.getFromClass(String.class)) {
        return "Child Access";
      } else {
        if(access instanceof TypeDataAccess) {
          BaseType type = ((TypeDataAccess)access).type;
          if(type instanceof QuadrigaComponent) {
            return "Component Access";
          }
        }
      }
      return "Unknown Array Access";
    }
    return "Array Access";
  }

  @Override
  public BaseType getType() {
    if(array.getType() instanceof ArrayType) {
      return ((ArrayType)array.getType()).base;
    }
    if(array.getType() instanceof QuadrigaEntity) {
      if(access.getType() == ClassOrInterfaceTypeRef.getFromClass(String.class)) {
        return QuadrigaEntity.baseEntity;
      } else {
        if(access instanceof TypeDataAccess) {
          BaseType type = ((TypeDataAccess)access).type;
          if(type instanceof QuadrigaComponent) {
            return type;
          }
        }
      }
    }
    return UnknownType.empty;
  }

  @Override
  public ArrayOrComponentAccess getLinkedVersion(SymbolTable symbolTable,
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
  public boolean isAssignable() {
    return true; //TODO revisar?
  }

  @Override
  public boolean isReadable() {
    return true;
  }

  @Override
  public WriteAccess getWriteVersion() {
    return new WriteVersion();
  }
  
  private class WriteVersion extends ExpressionNodeClass implements WriteAccess {

    public WriteVersion() {
      super(ArrayOrComponentAccess.this);
    }

    @Override
    public DataAccess getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }

    @Override
    public BaseType getType() {
      return ArrayOrComponentAccess.this.getType();
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
      return ArrayOrComponentAccess.this.getOperands();
    }

    @Override
    public String getOperation() {
      return ArrayOrComponentAccess.this.getOperation();
    }

    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    
  }

}
