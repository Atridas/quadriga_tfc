package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
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
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class ArrayOrComponentAccess extends ExpressionNodeClass implements DataAccess {

  public ExpressionNode array;
  public ExpressionNode access;
  
  public ArrayOrComponentAccess(ExpressionNode array, ExpressionNode access, Token t) {
    this(array, access, new CodeZoneClass(array, t));
  }
  
  public ArrayOrComponentAccess(ExpressionNode array, ExpressionNode access, CodeZone cz) {
    super(cz);
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

  private boolean linked = false;
  private ArrayOrComponentAccess linkedVersion = null;
  @Override
  public ArrayOrComponentAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode arr;
      if(array.isCorrectlyLinked()) {
        arr = array;
      } else {
        arr = array.getLinkedVersion(symbolTable, errorLog);
        if(arr == null) {
          return null;
        }
      }
      ExpressionNode acc;
      if(access.isCorrectlyLinked()) {
        acc = access;
      } else {
        acc = access.getLinkedVersion(symbolTable, errorLog);
        if(acc == null) {
          return null;
        }
      }
      

      linkedVersion = new ArrayOrComponentAccess(arr, acc, this); 
      if(linkedVersion.getType() instanceof UnknownType) {
        linkedVersion = null;
        errorLog.insertError("Accés [ ] invàlid",this);
        return null;
      }
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

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
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

    @Override
    public LiteralData getCompileTimeConstant() {
      return null;
    }

    @Override
    public void setValue(ComputedValue value, RuntimeEnvironment runtime) {
      throw new IllegalStateException("Not yet implemented " + this.getClass().getCanonicalName());
    }
    
  }

}
