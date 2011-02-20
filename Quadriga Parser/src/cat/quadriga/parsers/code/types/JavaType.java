package cat.quadriga.parsers.code.types;

public abstract class JavaType extends BaseType {
  
  private final Class<?> classObject;
  
  public JavaType(Class<?> c, String binaryName) {
    super(binaryName);
    classObject = c;
  }
  
  public final Class<?> getClassObject() {
    return classObject;
  }
  
}
