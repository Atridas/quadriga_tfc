package cat.quadriga.parsers.code.symbols;

import cat.quadriga.parsers.code.types.BaseType;

public class LocalVariableSymbol extends BaseSymbol {
  
  public BaseType type;
  public int modifiers;
  public int position;

  public LocalVariableSymbol(int modifiers, BaseType type, String name, int position) {
    super(name);
    this.type = type;
    this.modifiers = modifiers;
    this.position = position;
  }
  
  @Override
  public String createTreeStringRepresentation() {
    return "Symbol Var [ "+ name +" ] Type [ " + type.toString() + " ]";//TODO modifiers
  }
  
  public String toString() {
    return "Local var \"" + name + "\" {" + type + "}";
  }
}
