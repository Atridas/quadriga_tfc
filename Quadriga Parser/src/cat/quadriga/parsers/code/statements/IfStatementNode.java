package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class IfStatementNode extends StatementNode {
  
  private final String treeStringRepresentation;
  
  public final ExpressionNode conditionExpression;
  
  public final StatementNode ifCode, elseCode;

  public IfStatementNode( Token ifToken, ExpressionNode conditionExpression, 
                          StatementNode ifCode, StatementNode elseCode,
                          ErrorLog errorLog) {
    super(ifToken.beginLine, 
          ifToken.beginColumn, 
          (elseCode == null) ? ifCode.endLine   : elseCode.endLine, 
          (elseCode == null) ? ifCode.endColumn : elseCode.endColumn);
    
    //TODO comprovar tipus!
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

  @Override
  public String treeStringRepresentation() {
    return treeStringRepresentation;
  }

}
