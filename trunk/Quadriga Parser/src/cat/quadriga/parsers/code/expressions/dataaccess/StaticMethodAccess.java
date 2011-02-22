package cat.quadriga.parsers.code.expressions.dataaccess;

import java.lang.reflect.Method;

import cat.quadriga.parsers.code.CodeZone;

public class StaticMethodAccess extends StaticAccess {
  
  private final Method[] methods;//TODO

  public StaticMethodAccess(Method[] methods, CodeZone cz) {
    super(methods[0].getName(), methods[0].getDeclaringClass(), cz);
    this.methods = methods.clone();
  }
  
  public Method getMethod(int i) {
    return methods[i];
  }
  
  @Override
  public String getOperation() {
    return "Static Method:";
  }
}
