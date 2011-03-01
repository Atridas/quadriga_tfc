package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class ThrowStatementNode extends StatementNode {

  public final ExpressionNode toThrow;
  
  public ThrowStatementNode(ExpressionNode toThrow, CodeZone cz) {
    super(cz);
    this.toThrow = toThrow;
  }

  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      treeStringRepresentation = Utils.treeStringRepresentation("throw", 
                                  toThrow.treeStringRepresentation());
    }
    return treeStringRepresentation;
  }

}
