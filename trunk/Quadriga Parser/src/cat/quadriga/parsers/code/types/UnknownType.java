package cat.quadriga.parsers.code.types;

public class UnknownType extends BaseTypeClass {

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

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return this;
  }
}
