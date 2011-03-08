package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
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
  public String[] getOperands() {
    String[] aux = {execution.treeStringRepresentation(),
                    condition.treeStringRepresentation()};
    return aux;
  }

  @Override
  public String getOperation() {
    return "do";
  }

  private boolean linked = false;
  private DoStatementNode linkedVersion = null;
  @Override
  public DoStatementNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode newCondition;
      if(condition.isCorrectlyLinked()) {
        newCondition = condition;
      } else {
        newCondition = condition.getLinkedVersion(symbolTable, errorLog);
      }
      
      BucleOrSwitchInterface prev = symbolTable.closestBucleOrSwitch;
      symbolTable.closestBucleOrSwitch = this;
      
      StatementNode newExecution;
      if(condition.isCorrectlyLinked()) {
        newExecution = execution;
      } else {
        newExecution = execution.getLinkedVersion(symbolTable, errorLog);
      }

      symbolTable.closestBucleOrSwitch = prev;
      
      if(execution != null && condition != null) {
        linkedVersion = new DoStatementNode(newExecution, newCondition, this);
        linkedVersion.linkedVersion = linkedVersion;
        linkedVersion.linked = true;
      }
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

}

  