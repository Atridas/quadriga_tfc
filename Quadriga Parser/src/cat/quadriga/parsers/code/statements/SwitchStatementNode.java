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
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;

public class SwitchStatementNode extends StatementNodeClass {
  
  public final ExpressionNode input;
  public final List<CaseNode> cases;
  public final List<LocalVariableSymbol> localVariables;

  public SwitchStatementNode(ExpressionNode input, List<CaseNode> cases, List<LocalVariableSymbol> localVariables, CodeZone cz) {
    super(cz);
    this.input = input;
    this.cases = Collections.unmodifiableList(new ArrayList<CaseNode>(cases));
    this.localVariables = Collections.unmodifiableList(new ArrayList<LocalVariableSymbol>(localVariables));
  }

  @Override
  public String[] getOperands() {
    List<String> args = new LinkedList<String>();
    args.add(input.treeStringRepresentation());
    
    if(localVariables.size() > 0) {
      List<String> vars = new LinkedList<String>();
      for(LocalVariableSymbol var : localVariables) {
        vars.add(var.toString());
      }
      args.add(Utils.treeStringRepresentation("Local Variables", vars.toArray(new String[vars.size()])));
    }
    
    for(CaseNode cas : cases) {
      args.add(cas.toString());
    }
    return args.toArray(new String[args.size()]);
  }

  @Override
  public String getOperation() {
    return "switch";
  }

  @Override
  public StatementNodeClass getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    errorLog.insertError("Not yet implemented [" + this.getClass().getCanonicalName() + "]", this);
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

  public final static class CaseNode {
    public final ExpressionNode cas;
    public final List<StatementNode> statements;
    
    public CaseNode(ExpressionNode cas, List<StatementNode> statements) {
      this.cas = cas;
      this.statements = Collections.unmodifiableList(new ArrayList<StatementNode>(statements));
    }
    
    public String toString() {
      List<String> args = new LinkedList<String>();
      if(cas != null) {
        args.add(cas.treeStringRepresentation());
      }
      for(StatementNode statement : statements) {
        args.add(statement.treeStringRepresentation());
      }
      String[] aux = args.toArray(new String[args.size()]);
      String operator;
      if(cas == null) {
        operator = "default";
      } else {
        operator = "case";
      }
      return Utils.treeStringRepresentation(operator, aux);
    }
  }
}
