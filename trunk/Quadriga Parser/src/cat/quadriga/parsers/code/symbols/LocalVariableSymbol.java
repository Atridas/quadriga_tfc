package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.types.BaseType;

public class LocalVariableSymbol extends BaseSymbol {
  
  public final BaseType type;
  public final int modifiers;

  public LocalVariableSymbol(int modifiers, BaseType type, String name) {
    super(name);
    this.type = type;
    this.modifiers = modifiers;
  }
  
  @Override
  protected String createTreeStringRepresentation() {
    return "Symbol Var [ "+ name +" ] Type [ " + type.toString() + " ]";//TODO modifiers
  }
}
