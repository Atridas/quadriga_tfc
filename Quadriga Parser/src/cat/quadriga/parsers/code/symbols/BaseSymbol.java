package cat.quadriga.parsers.code.symbols;

public abstract class BaseSymbol {

  public final String name;
  
  public BaseSymbol(String n) {
    name = n;
  }
  
  private static final String[] alias = new String[0];
  public String[] getAlias() {
    return alias;
  }
}
