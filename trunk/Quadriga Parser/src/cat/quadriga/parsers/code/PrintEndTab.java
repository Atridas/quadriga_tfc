package cat.quadriga.parsers.code;

public class PrintEndTab implements PrintInfo {
  private static PrintEndTab instance;
  
  private PrintEndTab() {}
  
  public static PrintEndTab getInstance() {
    if(instance == null) {
      instance = new PrintEndTab();
    }
    return instance;
  }
}
