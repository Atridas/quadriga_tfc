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
  
  protected abstract String createTreeStringRepresentation();
  
  
}
