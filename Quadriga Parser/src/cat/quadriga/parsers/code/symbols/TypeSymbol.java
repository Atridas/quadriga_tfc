package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ReferenceTypeRef;

public class TypeSymbol extends BaseSymbol {

  public final BaseType type;
  private final String[] alias;
  
  public TypeSymbol(ReferenceTypeRef type) {
    super(type.getClass().getCanonicalName());
    
    this.type = type;
    String aux[] = name.split(".");
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
    return "Symbol Type [" + type.toString() + "]";
  }
}
