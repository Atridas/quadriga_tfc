package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.UnknownType;

public class ThisSymbol extends LocalVariableSymbol {

  public ThisSymbol(BaseType type) {
    super(0, type, "this");
  }

  public ThisSymbol() {
    super(0, UnknownType.empty, "this");
  }

}
