package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;

public abstract class BlockStatementNode extends CodeZone {

  public BlockStatementNode(int beginLine, int beginColumn, int endLine, int endColumn) {
    super(beginLine,  beginColumn,  endLine,  endColumn);
  }
  public BlockStatementNode(CodeZone cz) {
    super(cz);
  }

  public abstract String treeStringRepresentation();
  
  public String toString() {
    return treeStringRepresentation();
  }

}
