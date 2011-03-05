package cat.quadriga.parsers.code.statements;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class CallToNamedArguments extends StatementNodeClass implements CallToArguments {
  public final Map<String,ExpressionNode> arguments;

  public CallToNamedArguments(Map<String,ExpressionNode> arguments, CodeZone cz) { 
    super(cz);
    this.arguments = Collections.unmodifiableMap(new HashMap<String,ExpressionNode>(arguments));
  }

  private String[] getOperands() {
    List<String> aux = new LinkedList<String>();
    for(Entry<String, ExpressionNode> entry : arguments.entrySet()) {
      aux.add(
               Utils.treeStringRepresentation(
                   "quadriga argument", 
                   entry.getKey(),
                   entry.getValue().treeStringRepresentation()
                   )
             );
    }
    
    return aux.toArray(new String[aux.size()]);
  }

  private String getOperation() {
    if(arguments.size() == 0) {
      return "Zero Arguments";
    } else {
      return "Named Arguments";
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
