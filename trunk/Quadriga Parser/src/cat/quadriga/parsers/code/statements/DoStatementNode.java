package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class DoStatementNode extends StatementNodeClass implements BucleInterface {

  public final ExpressionNode condition;
  public final StatementNode execution;
  
  public DoStatementNode(StatementNode execution, ExpressionNode condition, CodeZone cz) {
    super(cz);
    this.condition = condition;
    this.execution = execution;
  }

  @Override
  public String treeStringRepresentation() {
    return Utils.treeStringRepresentation("do", 
                  execution.treeStringRepresentation(),
                  condition.treeStringRepresentation());
  }

}
