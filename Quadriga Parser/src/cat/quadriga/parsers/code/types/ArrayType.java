package cat.quadriga.parsers.code.types;

public class ArrayType extends ReferenceTypeRef {
  
  public final BaseType base;
  
  public ArrayType(BaseType base) {
    super(createArrayClass(base), "[" + base.getBinaryName());
    
    this.base = base;
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
