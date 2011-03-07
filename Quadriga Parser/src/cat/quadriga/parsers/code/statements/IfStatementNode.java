package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class IfStatementNode extends StatementNodeClass {
  
  private final String treeStringRepresentation;
  
  public final ExpressionNode conditionExpression;
  
  public final StatementNode ifCode, elseCode;

  public IfStatementNode( ExpressionNode conditionExpression, 
                          StatementNode ifCode, StatementNode elseCode, CodeZone cz) {
    super( cz );
    
    this.conditionExpression = conditionExpression;
    this.ifCode = ifCode;
    this.elseCode = elseCode;
    
    String[] conditionString = {conditionExpression.treeStringRepresentation()};
    String[] ifString        = {ifCode.treeStringRepresentation()};
    
    String operandsString[];
    if(elseCode == null) {
      String aux[] = {Utils.treeStringRepresentation("Condition:", conditionString),
                      Utils.treeStringRepresentation("If Code:", ifString),
                     };
      operandsString = aux;
    } else {
      String[] elseString      = {elseCode.treeStringRepresentation()};
      
      String aux[] = {Utils.treeStringRepresentation("Condition:", conditionString),
                      Utils.treeStringRepresentation("If Code:", ifString),
                      Utils.treeStringRepresentation("Else Code:", elseString)
                     };
      operandsString = aux;
    }
    
    treeStringRepresentation = Utils.treeStringRepresentation("If Statement:",
                                                              operandsString);
  }
  
  public IfStatementNode( Token ifToken, ExpressionNode conditionExpression, 
      StatementNode ifCode, StatementNode elseCode) {
    this( 
        conditionExpression,
        ifCode,
        elseCode,
        new CodeZoneClass(ifToken, (elseCode == null) ? ifCode : elseCode) 
        );
  }

  @Override
  public String treeStringRepresentation() {
    return treeStringRepresentation;
  }

  private boolean linked = false;
  private IfStatementNode linkedVersion = null;
  @Override
  public IfStatementNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode newCondition;
      if(conditionExpression.isCorrectlyLinked()) {
        newCondition = conditionExpression;
      } else {
        newCondition = conditionExpression.getLinkedVersion(symbolTable, errorLog);
        if(newCondition == null) {
          return null;
        }
      }
      StatementNode newIf;
      if(ifCode.isCorrectlyLinked()) {
        newIf = ifCode;
      } else {
        newIf = ifCode.getLinkedVersion(symbolTable, errorLog);
        if(newIf == null) {
          return null;
        }
      }
      StatementNode newElse;
      if(elseCode == null || elseCode.isCorrectlyLinked()) {
        newElse = elseCode;
      } else {
        newElse = elseCode.getLinkedVersion(symbolTable, errorLog);
        if(newIf == null) {
          return null;
        }
      }
      
      linkedVersion = new IfStatementNode(newCondition, newIf, newElse, this);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

}
