package cat.quadriga.parsers.code.types;

import java.util.Map;
import java.util.HashMap;

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
}
