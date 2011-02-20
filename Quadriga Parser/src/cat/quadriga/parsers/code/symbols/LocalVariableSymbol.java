package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.types.BaseType;

public class LocalVariableSymbol extends BaseSymbol {
  
  public final BaseType type;

  public LocalVariableSymbol(BaseType type, String name) {
    super(name);
    this.type = type;
  }
}
