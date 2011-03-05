package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class ReturnStatementNode extends StatementNodeClass {
  
  public final ExpressionNode returnExpression;

  public ReturnStatementNode(ExpressionNode returnExpression, CodeZone cz) {
    super(cz);
    this.returnExpression = returnExpression;
  }

  public ReturnStatementNode(CodeZone cz) {
    super(cz);
    this.returnExpression = null;
  }

  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      if(returnExpression == null) {
        treeStringRepresentation = Utils.treeStringRepresentation("return");
      } else {
        treeStringRepresentation = Utils.treeStringRepresentation("return",
                                          returnExpression.treeStringRepresentation());
      }
    }
    return treeStringRepresentation;
  }

}
