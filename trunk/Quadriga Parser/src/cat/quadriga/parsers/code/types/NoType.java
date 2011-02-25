package cat.quadriga.parsers.code.types;

public class NoType extends BaseType {
  
  public static NoType instance = new NoType();

  private NoType() {
    super("No type");
  }

}
