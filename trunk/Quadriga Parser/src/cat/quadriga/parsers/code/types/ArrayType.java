package cat.quadriga.parsers.code.types;

public class ArrayType extends ReferenceTypeRef {
  
  public ArrayType(BaseType base) {
    super(createArrayClass(base), "[" + base.getBinaryName());
  }
  
  private static Class<?> createArrayClass(BaseType base) {
    
    String arrayClassName = "[" + base.getBinaryName();
    
    try {
      return Class.forName(arrayClassName);
    } catch (ClassNotFoundException e) {
      throw new IllegalArgumentException("No es pot instanciar la classe " + arrayClassName);
    }
  }
  

}
