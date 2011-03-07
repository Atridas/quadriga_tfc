package cat.quadriga.parsers;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;

public class Quadriga {

  public static void main(String[] args) {
    QuadrigaSimple quadrigaSimple = new QuadrigaSimple(args[0]);
    SymbolTable symbolTable = quadrigaSimple.symbolTable;
    ErrorLog errorLog = quadrigaSimple.errorLog;
    try {
      System.out.println("Parsing " + args[0]);
      quadrigaSimple.QuadrigaUnit();
      for(int i = 1; i < args.length; i++) {
        System.out.println("Parsing " + args[i]);
        quadrigaSimple = new QuadrigaSimple(args[i]);
        quadrigaSimple.symbolTable.copyGlobals(symbolTable);
        quadrigaSimple.errorLog = errorLog;
        quadrigaSimple.QuadrigaUnit();
        symbolTable = quadrigaSimple.symbolTable;
        errorLog = quadrigaSimple.errorLog;
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
    
    quadrigaSimple.symbolTable.link(quadrigaSimple.errorLog);
    System.out.println(quadrigaSimple.symbolTable.treeStringRepresentation());

    System.out.println(quadrigaSimple.errorLog.print());
  }
}
