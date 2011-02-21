package cat.quadriga.parsers.code.symbols;

public class LabelSymbol extends BaseSymbol {

  public LabelSymbol(String label) {
    super(label);
  }

  @Override
  protected String createTreeStringRepresentation() {
    return "Symbol Label [" + name + "]";
  }
  
  
}
