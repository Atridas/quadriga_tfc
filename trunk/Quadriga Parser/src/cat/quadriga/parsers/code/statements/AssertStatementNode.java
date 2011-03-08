package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class AssertStatementNode extends StatementNodeClass {
  
  public final ExpressionNode assertion, message;

  public AssertStatementNode(ExpressionNode assertion, ExpressionNode message, CodeZone cz) {
    super(cz);
    this.assertion = assertion;
    this.message = message;
  }



  @Override
  public String[] getOperands() {
    
    if(message == null) {
      String[] aux = { assertion.treeStringRepresentation() };
      return aux;
    } else {
      String[] aux = { assertion.treeStringRepresentation(),
                       message.treeStringRepresentation() };
      return aux;
    }
  }


  @Override
  public String getOperation() {
    return "assert";
  }
  
  private boolean linked = false;
  private AssertStatementNode linkedVersion = null;
  @Override
  public AssertStatementNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } if (linkedVersion == null) {
      ExpressionNode asser, messg;
      if(assertion.isCorrectlyLinked()) {
        asser = assertion;
      } else {
        asser = assertion.getLinkedVersion(symbolTable, errorLog);
      }
      if(message.isCorrectlyLinked()) {
        messg = message;
      } else {
        messg = message.getLinkedVersion(symbolTable, errorLog);
      }
      if(asser != null && messg != null) {
        linkedVersion = new AssertStatementNode(asser, messg, this);
        linkedVersion.linkedVersion = this;
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
