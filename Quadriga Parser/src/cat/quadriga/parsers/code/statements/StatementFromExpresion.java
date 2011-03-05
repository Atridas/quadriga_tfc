package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class StatementFromExpresion extends StatementNodeClass {

  public final ExpressionNode expression;
  
  public StatementFromExpresion(ExpressionNode expression) {
    super(expression);

    this.expression = expression;
  }

  @Override
  public String treeStringRepresentation() {
    return "St: " + Utils.treeStringRepresentation(expression.getOperation(), 
                                                   expression.getOperands());
  }

}
