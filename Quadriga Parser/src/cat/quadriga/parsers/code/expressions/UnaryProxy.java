package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;

public class UnaryProxy extends UnaryExpressionNode {

  public UnaryProxy(ExpressionNode operator, Token firstToken, Token lastToken) {
    super(operator,
        firstToken.beginLine,
        firstToken.beginColumn,
        lastToken.endLine,
        lastToken.endColumn);
  }
  
  @Override
  public String getOperation() {
    return ">> unary proxy <<";
  }
}
