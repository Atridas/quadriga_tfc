package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class WhileStatementNode extends StatementNode implements BucleInterface {

  public final ExpressionNode condition;
  
  public final StatementNode execution;
  
  public WhileStatementNode(ExpressionNode condition, StatementNode execution, CodeZone cz) {
    super(cz);
    this.condition = condition;
    this.execution = execution;
  }

  @Override
  public String treeStringRepresentation() {
    return Utils.treeStringRepresentation("while", 
                  condition.treeStringRepresentation(),
                  execution.treeStringRepresentation());
  }

}
