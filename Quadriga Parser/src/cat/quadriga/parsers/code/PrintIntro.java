package cat.quadriga.parsers.code;

public class PrintIntro implements PrintInfo {
  private static PrintIntro instance;
  
  private PrintIntro() {}
  
  public static PrintIntro getInstance() {
    if(instance == null) {
      instance = new PrintIntro();
    }
    return instance;
  }
}
