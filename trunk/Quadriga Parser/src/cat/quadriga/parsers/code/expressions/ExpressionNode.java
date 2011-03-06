package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.Linkable;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.TreeRepresentable;
import cat.quadriga.parsers.code.types.BaseType;

public interface ExpressionNode extends CodeZone, TreeRepresentable, Linkable {
  String   getOperation();
  String[] getOperands();
  BaseType getType();
  @Override
  ExpressionNode getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog);
}
