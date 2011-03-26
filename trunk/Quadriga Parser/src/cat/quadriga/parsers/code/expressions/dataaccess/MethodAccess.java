package cat.quadriga.parsers.code.expressions.dataaccess;

import java.lang.reflect.Method;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NoType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;

public final class MethodAccess extends MemberAccess {
  
  private final Method[] methods;
  
  public final ExpressionNode reference;

  public MethodAccess(Method[] methods, CodeZone cz) {
    super(methods[0].getName(), methods[0].getDeclaringClass(), cz);
    this.methods = methods.clone();
    reference = null;
  }

  public MethodAccess(ExpressionNode reference, Method[] methods, CodeZone cz) {
    super(methods[0].getName(), methods[0].getDeclaringClass(), cz);
    this.methods = methods.clone();
    this.reference = reference;
  }

  @Override
  public boolean isAssignable() {
    return false;
  }
  
  public Method getMethods(int i) {
    return methods[i];
  }
  
  public int getNumMethods() {
    return methods.length;
  }
  
  @Override
  public String getOperation() {
    if(reference == null) {
      return "Static Method:";
    } else {
      return "Method:";
    }
  }
  
  @Override
  public String[] getOperands() {
    if(reference == null) {
      String[] aux = { clazz.getCanonicalName() + " -> " + staticMember}; 
      return aux;
    } else {
      String[] aux = { clazz.getCanonicalName() + " -> " + staticMember,
                       reference.treeStringRepresentation()}; 
      return aux;
    }
  }

  @Override
  public BaseType getType() {
    return NoType.instance;
  }

  private boolean linked;
  private MethodAccess linkedVersion;
  @Override
  public MethodAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(isCorrectlyLinked()) {
      return this;
    } else if(linkedVersion == null) {
    
      ExpressionNode expression = reference.getLinkedVersion(symbolTable, errorLog);
      if(expression == null) {
        return null;
      }
      if(expression.getType() instanceof QuadrigaComponent) {
        errorLog.insertError("No es pot cridar un metode a un membre d'un component", this);
        return null;
      }
      linkedVersion = new MethodAccess(expression, methods, this);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
      return reference == null || linked;
  }

  @Override
  public WriteAccess getWriteVersion(SymbolTable symbolTable) {
    return null;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }
}
