package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.TreeRepresentable;

public abstract class BaseSymbol implements TreeRepresentable {

  public final String name;
  
  public BaseSymbol(String n) {
    name = n;
  }

  private static final String[] alias = new String[0];
  public String[] getAlias() {
    return alias;
  }
  
  private String treeStringRepresentation;
  @Override
  public final String treeStringRepresentation() {
    if(treeStringRepresentation != null)
      return treeStringRepresentation;
    return treeStringRepresentation = createTreeStringRepresentation();
  }
  
  public abstract String createTreeStringRepresentation();
  

  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
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
    BaseSymbol other = (BaseSymbol) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
}
