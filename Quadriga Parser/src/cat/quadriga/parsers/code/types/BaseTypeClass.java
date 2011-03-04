package cat.quadriga.parsers.code.types;

public abstract class BaseTypeClass implements BaseType {
  private final String binaryName;
  private final String instanceableName;
  
  public BaseTypeClass(String binaryName) {
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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result
        + ((binaryName == null) ? 0 : binaryName.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    BaseTypeClass other = (BaseTypeClass) obj;
    if (binaryName == null) {
      if (other.binaryName != null)
        return false;
    } else if (!binaryName.equals(other.binaryName))
      return false;
    return true;
  }
}
