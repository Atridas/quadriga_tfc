package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class SynchronizedStatementNode extends StatementNode {

  public final ExpressionNode monitor;
  public final BlockCode block;

  public SynchronizedStatementNode(ExpressionNode monitor, BlockCode block, CodeZone cz) {
    super(cz);
    this.monitor = monitor;
    this.block = block;
  }
  
  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      treeStringRepresentation = Utils.treeStringRepresentation("synchronized",
                                    monitor.treeStringRepresentation(),
                                    block.treeStringRepresentation());
    }
    return treeStringRepresentation;
  }

}
