package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class SynchronizedStatementNode extends StatementNodeClass {

  public final ExpressionNode monitor;
  public final BlockCode block;

  public SynchronizedStatementNode(ExpressionNode monitor, BlockCode block, CodeZone cz) {
    super(cz);
    this.monitor = monitor;
    this.block = block;
  }
  
  @Override
  public String[] getOperands() {
    String[] aux = {
        monitor.treeStringRepresentation(), 
        block.treeStringRepresentation()
        };
    return aux;
  }
  
  @Override
  public String getOperation() {
    return "synchronized";
  }
  
  @Override
  public StatementNodeClass getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    errorLog.insertError("Not yet implemented [" + this.getClass().getCanonicalName() + "]", this);
    return null;
  }
  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

}
