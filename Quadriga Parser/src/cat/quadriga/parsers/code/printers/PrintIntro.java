package cat.quadriga.parsers.code.printers;

public class PrintIntro implements PrintInfo {
  private static PrintIntro instance;
  
  private PrintIntro() {}
  
  public static PrintIntro getInstance() {
    if(instance == null) {
      instance = new PrintIntro();
    }
    return instance;
  }
  
  public String toString() {
    return "<\\n>";
  }
}
