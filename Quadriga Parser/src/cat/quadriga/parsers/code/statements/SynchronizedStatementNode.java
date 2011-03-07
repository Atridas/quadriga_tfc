package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class SynchronizedStatementNode extends StatementNodeClass {

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
  @Override
  public StatementNodeClass getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }
  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

}
