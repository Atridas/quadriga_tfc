package cat.quadriga.parsers.code;

public class PrintInitTab implements PrintInfo {
  private static PrintInitTab instance;
  
  private PrintInitTab() {}
  
  public static PrintInitTab getInstance() {
    if(instance == null) {
      instance = new PrintInitTab();
    }
    return instance;
  }
}
