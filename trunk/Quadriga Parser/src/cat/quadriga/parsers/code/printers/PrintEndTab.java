package cat.quadriga.parsers.code.printers;

public final class PrintEndTab implements PrintInfo {
  private static PrintEndTab instance;
  
  private PrintEndTab() {}
  
  public static PrintEndTab getInstance() {
    if(instance == null) {
      instance = new PrintEndTab();
    }
    return instance;
  }
  
  public String toString() {
    return "<end tab>";
  }
}
