package cat.quadriga.parsers.code.types;

public abstract class BaseType {

  private final String binaryName;
  private final String instanceableName;
  
  public BaseType(String binaryName) {
    this.binaryName = binaryName;
    int aux0 = binaryName.indexOf('<');
    String aux1 = (aux0 >= 0)?binaryName.substring(0, aux0) : binaryName;
    this.instanceableName = aux1.replace('/', '.');
  }
  
  public final String getBinaryName() {
    return binaryName;
  }
  
  public final String getInstanceableName() {
    return instanceableName;
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
