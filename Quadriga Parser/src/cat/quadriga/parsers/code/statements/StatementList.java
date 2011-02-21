package cat.quadriga.parsers.code.statements;

import java.util.Collection;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;

public class StatementList extends StatementNode {
  
  private final StatementNode[] nodes;
  
  public StatementList(StatementNode[] nodes) {
    super(getFromArray(nodes));
    
    this.nodes = new StatementNode[nodes.length];
    
    for(int i = 0; i < nodes.length; i++) {
      this.nodes[i] = nodes[i];
    }
  }
  
  private static CodeZone getFromArray(StatementNode[] nodes) {
    if(nodes == null || nodes.length == 0) {
      return new CodeZone(0,0,0,0);
    } else {
      return new CodeZone(nodes[0].beginLine, nodes[0].beginColumn, 
          nodes[nodes.length-1].endLine, nodes[nodes.length-1].endColumn);
    }
  }
  
  public StatementList(Collection<StatementNode> nodes) {
    this(nodes.toArray(new StatementNode[nodes.size()]));
  }
  
  public StatementNode[] getNodes() {
    return nodes.clone();
  }

  private String treeStringRepresentation = null;
  
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation != null) {
      return treeStringRepresentation;
    }
    
    String aux[] = new String[nodes.length];
    for(int i = 0; i < nodes.length; i++) {
      aux[i] = nodes[i].treeStringRepresentation();
    }
    
    treeStringRepresentation = Utils.treeStringRepresentation("Statements:", aux);
    
    return treeStringRepresentation;
  }

}
