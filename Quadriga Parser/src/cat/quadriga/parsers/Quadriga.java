package cat.quadriga.parsers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;

public class Quadriga {

  public static void main(String[] args) {
    QuadrigaSimple quadrigaSimple = new QuadrigaSimple(args[0]);
    SymbolTable symbolTable = quadrigaSimple.symbolTable;
    ErrorLog errorLog = quadrigaSimple.errorLog;
    errorLog.writeClasses = true;
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
    
    if(!quadrigaSimple.symbolTable.link(quadrigaSimple.errorLog)) {
      System.out.println("Errors While Linking");
    }
    
    try {
      OutputStream os = new FileOutputStream("output tree.txt");
      os.write(quadrigaSimple.symbolTable.treeStringRepresentation().getBytes("UTF-8"));
      
      os.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    System.out.println(quadrigaSimple.errorLog.print());
  }
}
