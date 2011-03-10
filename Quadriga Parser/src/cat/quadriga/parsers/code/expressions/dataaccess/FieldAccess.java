package cat.quadriga.parsers.code.expressions.dataaccess;

import java.lang.reflect.Field;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.types.BaseType;

public final class FieldAccess extends MemberAccess {
  
  public final Field field;
  public final BaseType type;
  
  public final ExpressionNode reference;

  public FieldAccess(Field field, CodeZone cz) {
    super(field.getName(), field.getDeclaringClass(), cz);
    this.field = field;
    this.type = Utils.createType(field.getType());
    reference = null;
  }

  public FieldAccess(ExpressionNode reference, Field field, CodeZone cz) {
    super(field.getName(), field.getDeclaringClass(), cz);
    this.field = field;
    this.type = Utils.createType(field.getType());
    this.reference = reference;
  }
  
  public boolean isStatic() {
    return 0 < (field.getModifiers() & Utils.STATIC);
  }
  
  @Override
  public String getOperation() {
    if(isStatic())
      return "Static Field:";
    else 
      return "Field:";
  }
  
  @Override
  public String[] getOperands() {
    if(reference == null) {
      String[] aux = { clazz.getCanonicalName() + " -> " + staticMember }; 
      return aux;
    } else {
      String[] aux = { clazz.getCanonicalName() + " -> " + staticMember,
                       reference.treeStringRepresentation()}; 
      return aux;
    }
  }

  @Override
  public BaseType getType() {
    return type;
  }

  private boolean linked = false;
  private FieldAccess linkedVersion = null;
  @Override
  public FieldAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode newRef;
      if(reference == null) {
        if(!isStatic()) {
          errorLog.insertError("El camp no és estàtic",this);
          return null;
        }
        newRef = null;
      } else if(reference.isCorrectlyLinked()) {
        newRef = reference;        
      } else {
        newRef = reference.getLinkedVersion(symbolTable, errorLog);
        if(newRef == null) {
          return null;
        }
      }
      
      linkedVersion = new FieldAccess(newRef, field, this);
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
  public WriteAccess getWriteVersion() {
    return new WriteVersion();
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    // TODO Auto-generated method stub
    return null;
  }
  
  private class WriteVersion extends ExpressionNodeClass implements WriteAccess {

    public WriteVersion() {
      super(FieldAccess.this);
    }

    @Override
    public DataAccess getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }

    @Override
    public BaseType getType() {
      return FieldAccess.this.getType();
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
      return FieldAccess.this.getOperands();
    }

    @Override
    public String getOperation() {
      return FieldAccess.this.getOperation();
    }

    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }

    @Override
    public LiteralData getCompileTimeConstant() {
      return null;
    }
    
  }

}
