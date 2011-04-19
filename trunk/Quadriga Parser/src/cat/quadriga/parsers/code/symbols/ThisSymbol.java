package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.UnknownType;

public class ThisSymbol extends LocalVariableSymbol {

  public ThisSymbol(BaseType type, CodeZone cz) {
    super(0, type, "this", 0, cz);
  }

  public ThisSymbol() {
    super(0, UnknownType.empty, "this", 0, CodeZoneClass.linking);
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
