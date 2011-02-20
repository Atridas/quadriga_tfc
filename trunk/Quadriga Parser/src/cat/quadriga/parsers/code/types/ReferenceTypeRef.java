package cat.quadriga.parsers.code.types;

public class ReferenceTypeRef extends JavaType {

  public ReferenceTypeRef(Class<?> c, String binaryName) {
    super(c, "L" + c.getCanonicalName() + ";");
  }
}
