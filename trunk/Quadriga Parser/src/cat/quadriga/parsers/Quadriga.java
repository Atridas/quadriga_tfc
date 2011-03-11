package cat.quadriga.parsers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeComponent;

public class Quadriga {

  public static void main(String[] args) throws SQLException {
    /*
    Connection testConnection = DriverManager.getConnection("jdbc:hsqldb:mem:localES","SA","");
    
    Statement st = testConnection.createStatement();
    
    st.execute("CREATE TABLE proves (a INT, b INT)");

    st.execute("INSERT INTO proves VALUES (3,4)");
    st.execute("INSERT INTO proves VALUES (5,6)");
    
    

    
    PreparedStatement ps = testConnection.prepareStatement("INSERT INTO proves VALUES (?,?)");

    ps.setInt(1, 100);
    ps.setInt(2, 200);
    ps.addBatch();
    ps.setInt(1, 500);
    ps.setInt(2, 700);
    ps.addBatch();
    ps.executeBatch();
    
    st.execute("SELECT * FROM proves");
    
    ResultSet rs = st.getResultSet();
    
    while(rs.next()) {
      System.out.println("Fila: " + rs.getInt("a") + ", " + rs.getInt("b"));
    }
    
    st.execute("CREATE TABLE p2 (vertex OTHER)");
    
    testConnection.setAutoCommit(false);
    
    ps = testConnection.prepareStatement("INSERT INTO p2 VALUES (?)");
    
    ps.setObject(1, new Vector3f(1,2,3));
    ps.execute();
    
    testConnection.commit();
    
    ps = testConnection.prepareStatement("SELECT vertex FROM p2");
    rs = ps.executeQuery();
    
    testConnection.commit();
    
    while(rs.next()) {
      Object o = rs.getObject("vertex");
      System.out.println(o);
    }
    */
    
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
      
      
      RuntimeComponent rc = (RuntimeComponent)((TypeSymbol)symbolTable.findSymbol("riskppt3d.planeta.DadesComponent")).type;
      
      Map<String,ComputedValue> compArgs = new HashMap<String, ComputedValue>();
      System.out.println(rc.createObject(compArgs));
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
