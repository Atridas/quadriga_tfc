package cat.quadriga.parsers;

import cat.quadriga.parsers.code.symbols.SymbolTable;

public class Quadriga {

  public static void main(String[] args) {
    QuadrigaSimple quadrigaSimple = new QuadrigaSimple(args[0]);
    SymbolTable symbolTable = quadrigaSimple.symbolTable;
    
    try {
      System.out.println("Parsing " + args[0]);
      quadrigaSimple.QuadrigaUnit();
      System.out.println(quadrigaSimple.errorLog.print());
      for(int i = 1; i < args.length; i++) {
        System.out.println("Parsing " + args[i]);
        quadrigaSimple = new QuadrigaSimple(args[i]);
        quadrigaSimple.symbolTable.copyGlobals(symbolTable);
        quadrigaSimple.QuadrigaUnit();
        System.out.println(quadrigaSimple.errorLog.print());
        symbolTable = quadrigaSimple.symbolTable;
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
    System.out.println(quadrigaSimple.symbolTable.treeStringRepresentation());
  }
}
