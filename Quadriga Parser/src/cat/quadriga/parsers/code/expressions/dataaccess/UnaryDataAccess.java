package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.UnaryExpressionNode;

public abstract class UnaryDataAccess extends UnaryExpressionNode implements DataAccess {

  public UnaryDataAccess(ExpressionNode operand, int beginLine,
      int beginColumn, int endLine, int endColumn) {
    super(operand, beginLine, beginColumn, endLine, endColumn);
  }

}
