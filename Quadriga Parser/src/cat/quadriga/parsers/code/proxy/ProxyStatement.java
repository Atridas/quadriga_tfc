package cat.quadriga.parsers.code.proxy;

import java.util.List;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.printers.MegaPrinter;
import cat.quadriga.parsers.code.printers.PrintInfo;
import cat.quadriga.parsers.code.statements.StatementNodeClass;

public class ProxyStatement extends StatementNodeClass {

  private final String operation;
  private final String[] operands;
  
  public ProxyStatement(List<PrintInfo> in) {
    super(new CodeZoneClass(0,0,0,0,""));
    
    operation = ">> Proxy Statement: <<";
    operands = MegaPrinter.getInstance().print(in).split("\n");
  }

  @Override
  public String[] getOperands() {
    return operands;
  }

  @Override
  public String getOperation() {
    return operation;
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
