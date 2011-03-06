package cat.quadriga.parsers.code.symbols;

public class LabelSymbol extends BaseSymbol {

  public LabelSymbol(String label) {
    super(label);
  }

  @Override
  public String createTreeStringRepresentation() {
    return "Symbol Label [" + name + "]";
  }
  
  
}
