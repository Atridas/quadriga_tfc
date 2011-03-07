package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;

public class TypeSymbol extends BaseSymbol {

  public final BaseType type;
  private final String[] alias;
  
  public TypeSymbol(BaseType type) {
    super(getSimpleName(type));
    
    this.type = type;
    String aux[] = name.split("\\.");
    if(aux.length > 1) {
      this.alias = new String[1];
      this.alias[0] = aux[aux.length - 1];
    } else {
      this.alias = new String[0];
    }
  }
  
  private static String getSimpleName(BaseType type) {
    if(type instanceof ClassOrInterfaceTypeRef) {
      String aux = type.getBinaryName().replace('/', '.');
      aux = aux.substring(1, aux.length()-1);
      return aux;
    }
    return type.getBinaryName();
  }
  
  public BaseType getType() {
    return type;
  }
  
  public String[] getAlias() {
    return alias;
  }
  
  @Override
  public String createTreeStringRepresentation() {
    return Utils.treeStringRepresentation("Symbol Type", type.treeStringRepresentation());
  }
}
