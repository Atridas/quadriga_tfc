package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;

public class TypeSymbol extends BaseSymbol {

  public final BaseType type;
  private final String[] alias;
  
  public TypeSymbol(BaseType type) {
    super(type.getBinaryName());
    
    this.type = type;
    String aux[] = name.split("\\.");
    if(aux.length > 1) {
      this.alias = new String[1];
      this.alias[0] = aux[aux.length - 1];
    } else {
      this.alias = new String[0];
    }
  }
  
  public BaseType getType() {
    return type;
  }
  
  public String[] getAlias() {
    return alias;
  }
  
  @Override
  protected String createTreeStringRepresentation() {
    return Utils.treeStringRepresentation("Symbol Type", type.treeStringRepresentation());
  }
}
