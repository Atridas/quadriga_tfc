package cat.quadriga.parsers.code.statements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.runtime.RuntimeEnvironment;

public class CallToListedArguments extends StatementNodeClass implements CallToArguments {
  
  public final List<ExpressionNode> arguments;

  public CallToListedArguments(List<ExpressionNode> arguments, CodeZone cz) {
    super(cz);
    this.arguments = Collections.unmodifiableList(new ArrayList<ExpressionNode>(arguments));
  }

  public String[] getOperands() {
    List<String> aux = new LinkedList<String>();
    for(ExpressionNode node : arguments) {
      aux.add(node.treeStringRepresentation());
    }
    return aux.toArray(new String[aux.size()]);
  }

  public String getOperation() {
    if(arguments.size() == 0) {
      return "Zero Arguments";
    } else {
      return "Arguments";
    }
  }
  
  private boolean linked = false;
  private CallToListedArguments linkedVersion = null;
  @Override
  public CallToListedArguments getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog) {
    if(linked) {
      return this;
    } if(linkedVersion == null) {
      List<ExpressionNode> linkedArgs = new ArrayList<ExpressionNode>(arguments.size());
      for(ExpressionNode arg : arguments) {
        if(arg.isCorrectlyLinked()) {
          linkedArgs.add(arg);
        } else {
          ExpressionNode aux = arg.getLinkedVersion(symbolTable, errorLog);
          if(aux == null) {
            return null;
          }
          linkedArgs.add(aux);
        }
      }
      linkedVersion = new CallToListedArguments(linkedArgs, this);
      linkedVersion.linked = true;
      linkedVersion.linkedVersion = linkedVersion;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }
  
  
  @Override
  public void execute(RuntimeEnvironment runtime) {
    assert isCorrectlyLinked();
    
    for(ExpressionNode argument : arguments) {
      runtime.stack.add(argument.compute(runtime));
    }
  }

}
