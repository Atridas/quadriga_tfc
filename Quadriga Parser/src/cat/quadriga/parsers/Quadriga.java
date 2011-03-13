package cat.quadriga.parsers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.runtime.ComponentInstance;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeComponent;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.qvm.DataBaseEntitySystem;

public class Quadriga {

  public static void main(String[] args) throws SQLException {
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
    
    
    
    DataBaseEntitySystem ces = new DataBaseEntitySystem();
    RuntimeEnvironment runtime = new RuntimeEnvironment();
    runtime.entitySystem = ces;
    runtime.symbolTable  = symbolTable;
    
    Entity joan     = ces.createEntity("joan",     "el primer", null,     runtime);
    Entity segon    = ces.createEntity(null,       "el segon",  joan,     runtime);
    Entity sigfried = ces.createEntity("sigfried", "el tercer", joan,     runtime);
    Entity macbeth  = ces.createEntity("macbeth",  null,        sigfried, runtime);
    
    RuntimeComponent rc = (RuntimeComponent)((TypeSymbol)symbolTable.findSymbol("riskppt3d.planeta.DadesComponent")).type;
    //RuntimeComponent rc = (RuntimeComponent)((TypeSymbol)symbolTable.findSymbol("cat.quadriga.base.Transform")).type;
    
    rc = ces.createComponent(rc, null,runtime);
    
    Map<String,ComputedValue> compArgs = new HashMap<String, ComputedValue>();
    ComponentInstance ci = rc.createInstance(compArgs,runtime);
    ces.addComponent(joan, ci,runtime);
    
    compArgs.put("radi", new LiteralData.FloatLiteral(15,CodeZoneClass.runtime));
    ComponentInstance ci2 = rc.createInstance(compArgs,runtime);
    ces.addComponent(segon, ci2,runtime);
    ci2.copy(ci);
    
    compArgs.put("radi", new LiteralData.FloatLiteral(22,CodeZoneClass.runtime));
    rc.createInstance(compArgs,runtime);
    
    System.out.println(ces.printAllTables());
  }
}
