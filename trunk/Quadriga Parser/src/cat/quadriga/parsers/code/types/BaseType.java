package cat.quadriga.parsers.code.types;

public abstract class BaseType {

  private final String binaryName;
  
  public BaseType(String binaryName) {
    this.binaryName = binaryName;
  }
  
  public final String getBinaryName() {
    return binaryName;
  }
  
  public boolean isValid() {
    return true;
  }
  
  public String toString() {
    return binaryName;
  }
  
  public abstract boolean isMathematicallyOperable();
  
  public abstract BaseType getMathematicResultType(BaseType other);
}
