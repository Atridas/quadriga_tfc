package cat.quadriga.parsers.code.types;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.JavaReference;

public class ClassOrInterfaceTypeRef extends ReferenceTypeRef {
  
  public Map<? extends String, ? super String> aux;

  protected ClassOrInterfaceTypeRef(Class<?> c) {
    super(c, "L" + c.getCanonicalName().replace('.', '/') + ";");
  }

  private static Map<Class<?>, ClassOrInterfaceTypeRef> map = new HashMap<Class<?>, ClassOrInterfaceTypeRef>();
  public static synchronized ClassOrInterfaceTypeRef getFromClass(Class<?> c) {
    ClassOrInterfaceTypeRef res = map.get(c);
    if(res == null) {
      res = new ClassOrInterfaceTypeRef(c);
      map.put(c, res);
    }
    return res;
  }
  @Override
  public ClassOrInterfaceTypeRef getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    return this;
  }
  @Override
  public boolean isValid() {
    return true;
  }
  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    if(rightOperand instanceof ClassOrInterfaceTypeRef) {
      return classObject.isAssignableFrom(((ClassOrInterfaceTypeRef)rightOperand).classObject);
    } else if(rightOperand instanceof NullType) {
      return true;
    }
    return false;
  }

  @Override
  public ComputedValue getDefaultValue() {
    return new JavaReference(null);
  }
  @Override
  public boolean isSerializable() {
    for(Class<?> c : classObject.getInterfaces()) {
      if(c.equals(Serializable.class)) {
        return true;
      }
    }
    return false;
  }
}
