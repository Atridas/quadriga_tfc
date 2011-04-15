package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.UnknownType;

public class ThisSymbol extends LocalVariableSymbol {

  public ThisSymbol(BaseType type) {
    super(0, type, "this", 0);
  }

  public ThisSymbol() {
    super(0, UnknownType.empty, "this", 0);
  }
  
  @Override
  public boolean equals(Object other) {
    return other instanceof ThisSymbol;
  }
  
  @Override
  public int hashCode() {
    return 782634722;
  }

}
