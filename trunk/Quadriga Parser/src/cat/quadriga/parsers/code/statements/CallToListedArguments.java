package cat.quadriga.parsers.code.statements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class CallToListedArguments extends StatementNodeClass implements CallToArguments {
  
  public final List<ExpressionNode> arguments;

  public CallToListedArguments(List<ExpressionNode> arguments, CodeZone cz) {
    super(cz);
    this.arguments = Collections.unmodifiableList(new ArrayList<ExpressionNode>(arguments));
  }

  private String[] getOperands() {
    List<String> aux = new LinkedList<String>();
    for(ExpressionNode node : arguments) {
      aux.add(node.treeStringRepresentation());
    }
    return aux.toArray(new String[aux.size()]);
  }

  private String getOperation() {
    if(arguments.size() == 0) {
      return "Zero Arguments";
    } else {
      return "Arguments";
    }
  }

  
  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      treeStringRepresentation = Utils.treeStringRepresentation(getOperation(), getOperands());
    }
    return treeStringRepresentation;
  }
  
  @Override
  public CallToListedArguments getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

}
