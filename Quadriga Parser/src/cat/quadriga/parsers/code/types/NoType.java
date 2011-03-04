package cat.quadriga.parsers.code.types;

public class NoType extends BaseTypeClass {
  
  public static NoType instance = new NoType();

  private NoType() {
    super("No type");
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return UnknownType.empty;
  }

  @Override
  public boolean equals(Object obj) {
    return obj == this;
  }
  
}
