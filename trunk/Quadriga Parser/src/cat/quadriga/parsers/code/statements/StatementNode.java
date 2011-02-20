package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;

public abstract class StatementNode extends BlockStatementNode {
  

  public StatementNode(int beginLine, int beginColumn, int endLine, int endColumn) {
    super(beginLine,  beginColumn,  endLine,  endColumn);
  }
  public StatementNode(CodeZone cz) {
    super(cz);
  }
}
