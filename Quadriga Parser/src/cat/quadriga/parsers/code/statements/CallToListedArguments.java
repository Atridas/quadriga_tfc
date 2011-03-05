package cat.quadriga.parsers.code.statements;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class CallToListedArguments extends StatementNodeClass implements CallToArguments {
  
  public final List<ExpressionNode> arguments;

  public CallToListedArguments(List<ExpressionNode> arguments, CodeZone cz) {
    super(cz);
    this.arguments = Collections.unmodifiableList(new Vector<ExpressionNode>(arguments));
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

}
