package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class AssertStatementNode extends StatementNode {
  
  public final ExpressionNode assertion, message;

  public AssertStatementNode(ExpressionNode assertion, ExpressionNode message, CodeZone cz) {
    super(cz);
    this.assertion = assertion;
    this.message = message;
  }

  
  private String treeStringRepresentation = null;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation != null)
      return treeStringRepresentation;
    if(message == null) {
      treeStringRepresentation = Utils.treeStringRepresentation("assert", 
                                  assertion.treeStringRepresentation());
    } else {
      treeStringRepresentation = Utils.treeStringRepresentation("assert", 
                                  assertion.treeStringRepresentation(),
                                  message.treeStringRepresentation());
    }
    return treeStringRepresentation;
  }

}
