package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.Linkable;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.TreeRepresentable;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeEnvironment;

public interface ExpressionNode extends CodeZone, TreeRepresentable, Linkable {
  String   getOperation();
  String[] getOperands();
  BaseType getType();
  @Override
  ExpressionNode getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog);
  
  LiteralData getCompileTimeConstant();
  
  ComputedValue compute(RuntimeEnvironment runtime);
}
