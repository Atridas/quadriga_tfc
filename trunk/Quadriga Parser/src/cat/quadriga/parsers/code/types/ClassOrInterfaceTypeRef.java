package cat.quadriga.parsers.code.types;

public class ClassOrInterfaceTypeRef extends ReferenceTypeRef {

  public ClassOrInterfaceTypeRef(Class<?> c) {
    super(c, "L" + c.getCanonicalName() + ";");
  }

}
