package cat.quadriga.parsers;

public class Quadriga {

  public static void main(String[] args) {
    QuadrigaSimple quadrigaSimple = new QuadrigaSimple(args[0]);
    
    try {
      quadrigaSimple.QuadrigaUnit();
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
