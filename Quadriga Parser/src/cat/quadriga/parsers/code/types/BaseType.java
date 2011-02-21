package cat.quadriga.parsers.code.types;

public class BaseType {

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
}
