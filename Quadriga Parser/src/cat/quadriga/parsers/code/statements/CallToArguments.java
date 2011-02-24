package cat.quadriga.parsers.code.statements;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class CallToArguments extends StatementNode {
  
  //TODO això s'ha de reformular quan es faci quadriga-like
  public final List<ExpressionNode> arguments;

  public CallToArguments(List<ExpressionNode> arguments, CodeZone cz) {
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
    return "Arguments";
  }

  
  
  @Override
  public String treeStringRepresentation() {
    //TODO optimitzar un xic
    return Utils.treeStringRepresentation(getOperation(), getOperands());
  }

}
