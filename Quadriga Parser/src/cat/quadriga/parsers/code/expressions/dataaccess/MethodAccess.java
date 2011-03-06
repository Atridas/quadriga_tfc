package cat.quadriga.parsers.code.expressions.dataaccess;

import java.lang.reflect.Method;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NoType;

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

  @Override
  public MethodAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }
}
