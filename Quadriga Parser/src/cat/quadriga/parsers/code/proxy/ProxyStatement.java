package cat.quadriga.parsers.code.proxy;

import java.util.List;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.printers.MegaPrinter;
import cat.quadriga.parsers.code.printers.PrintInfo;
import cat.quadriga.parsers.code.statements.StatementNodeClass;

public class ProxyStatement extends StatementNodeClass {

  private String treeStringRepresentation;
  
  public ProxyStatement(List<PrintInfo> in) {
    super(new CodeZoneClass(0,0,0,0,""));
    
    treeStringRepresentation = 
      Utils.treeStringRepresentation(">> Proxy Statement: ",
          MegaPrinter.getInstance().print(in).split("\n")
                                    ) + "\n<<";
  }

  @Override
  public String treeStringRepresentation() {
    return treeStringRepresentation;
  }

  @Override
  public StatementNodeClass getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    errorLog.insertError("Can not link this.", this);
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return false;
  }

}
