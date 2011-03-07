package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class AssertStatementNode extends StatementNodeClass {
  
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
