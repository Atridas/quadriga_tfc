package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.BreakException;
import cat.quadriga.parsers.code.BreakOrContinueException;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.runtime.RuntimeEnvironment;

public class WhileStatementNode extends StatementNodeClass implements BucleInterface {

  public final ExpressionNode condition;
  
  public final StatementNode execution;
  
  public WhileStatementNode(ExpressionNode condition, StatementNode execution, CodeZone cz) {
    super(cz);
    this.condition = condition;
    this.execution = execution;
  }

  @Override
  public String[] getOperands() {
    String[] aux = {
        condition.treeStringRepresentation(),
        execution.treeStringRepresentation()};
    return aux;
  }

  @Override
  public String getOperation() {
    return "while";
  }

  private boolean linked = false;
  private WhileStatementNode linkedVersion = null;
  @Override
  public WhileStatementNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode newCondition;
      if(condition.isCorrectlyLinked()) {
        newCondition = condition;
      } else {
        newCondition = condition.getLinkedVersion(symbolTable, errorLog);
        if(newCondition == null) {
          return null;
        }
      }


      if(!PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.BOOLEAN).isAssignableFrom( 
          newCondition.getType())) {
        errorLog.insertError("If condition must be boolean", newCondition);
        return null;
      }
      
      BucleOrSwitchInterface prev = symbolTable.closestBucleOrSwitch;
      symbolTable.closestBucleOrSwitch = this;
      
      StatementNode newExecution;
      if(condition.isCorrectlyLinked()) {
        newExecution = execution;
      } else {
        newExecution = execution.getLinkedVersion(symbolTable, errorLog);
        if(newExecution == null) {
          return null;
        }
      }

      symbolTable.closestBucleOrSwitch = prev;
      
      if(execution != null && condition != null) {
        linkedVersion = new WhileStatementNode(newCondition, newExecution, this);
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

  @Override
  public void execute(RuntimeEnvironment runtime) throws BreakOrContinueException {
    try {
      assert isCorrectlyLinked();
      
      runtime.newLocalContext();
      
      try {
        while(condition.compute(runtime).getAsBool()) {
          execution.execute(runtime);
        }
      } catch (BreakException e) {
        if(e.tobreak != this) {
          runtime.deleteLocalContext();
          throw e;
        }
      }
      
      runtime.deleteLocalContext();
    } catch (BreakOrContinueException e) {
      throw e;
    } catch (Exception e) {
      throw new RuntimeException("Error in " 
          + beginLine + ":" + beginColumn + " "
          + endLine + ":" + endColumn + " " + file, e);
    }
  }

}
