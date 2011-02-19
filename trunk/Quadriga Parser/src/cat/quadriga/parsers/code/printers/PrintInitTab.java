package cat.quadriga.parsers.code.printers;

public class PrintInitTab implements PrintInfo {
  private static PrintInitTab instance;
  
  private PrintInitTab() {}
  
  public static PrintInitTab getInstance() {
    if(instance == null) {
      instance = new PrintInitTab();
    }
    return instance;
  }
  
  public String toString() {
    return "<init tab>";
  }
}
