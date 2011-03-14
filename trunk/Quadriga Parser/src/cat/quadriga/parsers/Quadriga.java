package cat.quadriga.parsers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.RuntimeMain;
import cat.quadriga.runtime.qvm.DataBaseEntitySystem;

public class Quadriga {

  public static void main(String[] args) throws SQLException {
    DataBaseEntitySystem ces = new DataBaseEntitySystem();
    try {
    
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
      
      
      
      RuntimeEnvironment runtime = new RuntimeEnvironment();
      runtime.entitySystem = ces;
      runtime.symbolTable  = symbolTable;
      
      RuntimeMain rm = (RuntimeMain)((TypeSymbol)symbolTable.findSymbol("riskppt3d.demo.DemoMain")).type;
      
      rm.execute(runtime);
      
      /*
      Entity joan     = ces.createEntity("joan",     "el primer", null,     runtime);
      Entity segon    = ces.createEntity(null,       "el segon",  joan,     runtime);
      Entity sigfried = ces.createEntity("sigfried", "el tercer", joan,     runtime);
      Entity macbeth  = ces.createEntity("macbeth",  null,        sigfried, runtime);
      
      //RuntimeComponent rc = (RuntimeComponent)((TypeSymbol)symbolTable.findSymbol("riskppt3d.planeta.DadesComponent")).type;
      RuntimeComponent rc = (RuntimeComponent)((TypeSymbol)symbolTable.findSymbol("cat.quadriga.base.Transform")).type;
      
      rc = ces.createComponent(rc, null,runtime);
      
      Map<String,ComputedValue> compArgs = new HashMap<String, ComputedValue>();
      ComponentInstance ci = rc.createInstance(compArgs,runtime);
      ces.addComponent(joan, ci,runtime);
      
      //compArgs.put("radi", new LiteralData.FloatLiteral(15,CodeZoneClass.runtime));
      ComponentInstance ci2 = rc.createInstance(compArgs,runtime);
      ces.addComponent(segon, ci2,runtime);
      ci2.copy(ci);
  
      compArgs.put("position", new JavaReference(new Vector3f(1, 2, 3)));
      compArgs.put("scale", new LiteralData.FloatLiteral(22,CodeZoneClass.runtime));
      rc.createInstance(compArgs,runtime);
      
      System.out.println(ces.printAllTables());
      
      */
      

      //RuntimeComponent transform = (RuntimeComponent)((TypeSymbol)symbolTable.findSymbol("cat.quadriga.base.Transform")).type;
      //RuntimeComponent planeta = (RuntimeComponent)((TypeSymbol)symbolTable.findSymbol("riskppt3d.planeta.DadesComponent")).type;
      
      //List<QuadrigaComponent> components = new LinkedList<QuadrigaComponent>();
      //components.add(transform);
      //components.add(planeta);
      
      //runtime.entitySystem.getAllEntitiesWithComponents(components, runtime);
      
    } finally {
      System.out.println(ces.printAllEntities());
    }
  }
}
