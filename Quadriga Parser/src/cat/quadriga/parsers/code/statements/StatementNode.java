package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.Linkable;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.TreeRepresentable;

public interface StatementNode extends TreeRepresentable, CodeZone, Linkable {
  @Override
  StatementNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog);
  String   getOperation();
  String[] getOperands();
  
  void execute(SymbolTable symbolTable);
}
