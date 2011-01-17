package cat.quadriga.parsers.code;

public class PrintWhiteSpace implements PrintInfo {
  private static PrintWhiteSpace instance;
  
  private PrintWhiteSpace() {}
  
  public static PrintWhiteSpace getInstance() {
    if(instance == null) {
      instance = new PrintWhiteSpace();
    }
    return instance;
  }
  
  public String toString() {
    return "< >";
  }
}
