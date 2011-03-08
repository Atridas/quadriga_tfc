package cat.quadriga.parsers.code.statements;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class CallToNamedArguments extends StatementNodeClass implements CallToArguments {
  public final Map<String,ExpressionNode> arguments;

  public CallToNamedArguments(Map<String,ExpressionNode> arguments, CodeZone cz) { 
    super(cz);
    this.arguments = Collections.unmodifiableMap(new HashMap<String,ExpressionNode>(arguments));
  }
  
  public CallToNamedArguments(CallToNamedArguments origin, String name, ExpressionNode arg, CodeZone cz) { 
    super(cz);
    Map<String,ExpressionNode> aux = new HashMap<String,ExpressionNode>(origin.arguments);
    aux.put(name, arg);
    this.arguments = Collections.unmodifiableMap(aux);
  }
  
  public CallToNamedArguments(String name, ExpressionNode arg, CodeZone cz) { 
    super(cz);
    Map<String,ExpressionNode> aux = new HashMap<String,ExpressionNode>();
    aux.put(name, arg);
    this.arguments = Collections.unmodifiableMap(aux);
  }

  public String[] getOperands() {
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

  public String getOperation() {
    if(arguments.size() == 0) {
      return "Zero Arguments";
    } else {
      return "Named Arguments";
    }
  }
  
  private boolean linked = false;
  private CallToNamedArguments linkedVersion = null;
  @Override
  public CallToNamedArguments getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog) {
    if(linked) {
      return this;
    } if(linkedVersion == null) {
      Map<String,ExpressionNode> linkedArgs = new HashMap<String,ExpressionNode>(arguments.size());
      for(Entry<String,ExpressionNode> entry : arguments.entrySet()) {
        ExpressionNode arg = entry.getValue();
        if(arg.isCorrectlyLinked()) {
          linkedArgs.put(entry.getKey(),arg);
        } else {
          ExpressionNode aux = arg.getLinkedVersion(symbolTable, errorLog);
          if(aux == null) {
            return null;
          }
          linkedArgs.put(entry.getKey(),aux);
        }
      }
      linkedVersion = new CallToNamedArguments(linkedArgs, this);
      linkedVersion.linked = true;
      linkedVersion.linkedVersion = linkedVersion;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }
}
