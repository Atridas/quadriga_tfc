package cat.quadriga.parsers.code.types;

public class UnknownType extends BaseType {

  public static final UnknownType empty = new UnknownType();

  private UnknownType() {
    super("#unknown#");
  }
  
  public UnknownType(String name) {
    super("#unknown " + name + " #");
  }

  public boolean isValid() {
    return false;
  }
}
