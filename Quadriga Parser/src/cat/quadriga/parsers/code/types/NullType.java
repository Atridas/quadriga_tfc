package cat.quadriga.parsers.code.types;

public final class NullType extends ReferenceTypeRef {

  public static NullType instance = new NullType();
  
  private NullType() {
    super(Object.class, "Null type");
  }
}
