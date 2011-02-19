package cat.quadriga.parsers.code;

public class StatementFromExpresion extends StatementNode {

  private final ExpressionNode expression;
  
  public StatementFromExpresion(ExpressionNode expression) {
    super(expression.getBeginLine(), expression.getBeginColumn(), expression.getEndLine(), expression.getEndColumn());

    this.expression = expression;
  }

  @Override
  public String treeStringRepresentation() {
    return "St: " + Utils.treeStringRepresentation(expression.getOperation(), 
                                                          expression.getOperands());
  }

}
