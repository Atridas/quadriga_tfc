package cat.quadriga.parsers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.RuntimeMain;
import cat.quadriga.runtime.qvm.DataBaseEntitySystem;

public class Quadriga {

  public static void main(String[] args) throws SQLException {
    DataBaseEntitySystem ces = new DataBaseEntitySystem();
    
    String firstFile = args[0].substring(0,args[0].lastIndexOf('.')).replace('.', '/') + ".qdg";
    
    
    QuadrigaSimple quadrigaSimple = new QuadrigaSimple(firstFile);
    SymbolTable symbolTable = quadrigaSimple.symbolTable;
    ErrorLog errorLog = quadrigaSimple.errorLog;
    errorLog.writeClasses = true;
    try {
      System.out.println("Parsing " + args[0]);
      quadrigaSimple.QuadrigaUnit();
      
      Set<String> parsedPackages = new HashSet<String>();
      parsedPackages.add(args[0]);
      Set<String> dependencies = quadrigaSimple.dependencies;
      dependencies.removeAll(parsedPackages);
      
      while(dependencies.size() > 0) {
        String parse = dependencies.iterator().next();
        parsedPackages.add(parse);
        
        System.out.println("Parsing " + parse);
        quadrigaSimple = new QuadrigaSimple(parse.replace('.', '/') + ".qdg");
        quadrigaSimple.symbolTable.copyGlobals(symbolTable);
        quadrigaSimple.errorLog = errorLog;
        quadrigaSimple.QuadrigaUnit();
        symbolTable = quadrigaSimple.symbolTable;
        errorLog = quadrigaSimple.errorLog;
        
        dependencies.addAll(quadrigaSimple.dependencies);
        dependencies.removeAll(parsedPackages);
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
    
    if(!quadrigaSimple.symbolTable.link(quadrigaSimple.errorLog)) {
      System.out.println("Errors While Linking");
    } else {
      System.out.println("No errors");
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
    
    
    
    RuntimeEnvironment runtime = new RuntimeEnvironment();
    runtime.entitySystem = ces;
    runtime.symbolTable  = symbolTable;
    
    RuntimeMain rm = (RuntimeMain)((TypeSymbol)symbolTable.findSymbol(args[0])).type;
    
    rm.execute(runtime);
    
    System.out.println(runtime.entitySystem.toString());
  }
}
