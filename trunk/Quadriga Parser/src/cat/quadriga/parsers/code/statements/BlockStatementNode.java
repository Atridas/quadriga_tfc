package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.TreeRepresentable;

public abstract class BlockStatementNode extends CodeZoneClass implements TreeRepresentable {

  public BlockStatementNode(int beginLine, int beginColumn, int endLine, int endColumn) {
    super(beginLine,  beginColumn,  endLine,  endColumn);
  }
  public BlockStatementNode(CodeZone cz) {
    super(cz);
  }
  
  public String toString() {
    return treeStringRepresentation();
  }

}
