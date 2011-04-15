package cat.quadriga.parsers.code.statements;

import java.util.Collection;

import cat.quadriga.parsers.code.BreakOrContinueException;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.runtime.RuntimeEnvironment;

public class StatementList extends StatementNodeClass {
  
  private final StatementNode[] nodes;
  
  public StatementList(StatementNode... nodes) {
    super(getFromArray(nodes));
    
    this.nodes = new StatementNode[nodes.length];
    
    for(int i = 0; i < nodes.length; i++) {
      this.nodes[i] = nodes[i];
    }
  }
  
  private static CodeZone getFromArray(StatementNode[] nodes) {
    if(nodes == null || nodes.length == 0) {
      return new CodeZoneClass(0,0,0,0,"");
    } else {
      return new CodeZoneClass(nodes[0], nodes[nodes.length-1]);
    }
  }
  
  public StatementList(Collection<StatementNode> nodes) {
    this(nodes.toArray(new StatementNode[nodes.size()]));
  }
  
  public StatementNode[] getNodes() {
    return nodes.clone();
  }

  
  @Override
  public String[] getOperands() {
    
    String aux[] = new String[nodes.length];
    for(int i = 0; i < nodes.length; i++) {
      aux[i] = nodes[i].treeStringRepresentation();
    }
    
    return aux;
  }

  @Override
  public String getOperation() {
    return "Statements:";
  }
  
  private boolean linked = false;
  private StatementList linkedVersion = null;
  @Override
  public StatementList getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } if (linkedVersion == null) {
      StatementNode[] statements = new StatementNode[nodes.length];
      
      for(int i = 0; i < nodes.length; i++) {
        StatementNode statement = nodes[i];
        if(statement.isCorrectlyLinked()) {
          statements[i] = statement;
        } else {
          statements[i] = statement.getLinkedVersion(symbolTable, errorLog);
          if(statements[i] == null) {
            return null;
          }
        }
      }
      
      linkedVersion = new StatementList(statements);
      linkedVersion.linkedVersion = this;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }
  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }
  
  @Override
  public void execute(RuntimeEnvironment runtime) throws BreakOrContinueException {
    assert isCorrectlyLinked();
    
    for(StatementNode statement : nodes) {
      statement.execute(runtime);
    }
  }
}
