package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;

public class UnaryProxy extends UnaryExpressionNode {
  
  private final String operation;

  public UnaryProxy(ExpressionNode operator, Token firstToken, Token lastToken) {
    super(operator,
        firstToken.beginLine,
        firstToken.beginColumn,
        lastToken.endLine,
        lastToken.endColumn);
    operation = ">> unary proxy <<";
  }

  public UnaryProxy(ExpressionNode operator) {
    super(operator, 0, 0, 0, 0);
    operation = ">> unary proxy <<";
  }

  public UnaryProxy(String operation, ExpressionNode operator, Token firstToken, Token lastToken) {
    super(operator,
        firstToken.beginLine,
        firstToken.beginColumn,
        lastToken.endLine,
        lastToken.endColumn);
    this.operation = operation;
  }

  public UnaryProxy(String operation, ExpressionNode operator, int beginLine, int beginColumn, int endLine, int endColumn) {
    super(operator,
        beginLine,
        beginColumn,
        endLine,
        endColumn);
    this.operation = operation;
  }

  public UnaryProxy(String operation, ExpressionNode operator) {
    super(operator, 0, 0, 0, 0);
    this.operation = operation;
  }
  
  @Override
  public String getOperation() {
    return operation;
  }
}
