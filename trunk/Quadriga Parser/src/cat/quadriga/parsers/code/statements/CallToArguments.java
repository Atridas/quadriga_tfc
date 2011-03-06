package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;

public interface CallToArguments extends StatementNode {
  public CallToArguments getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog);
}
