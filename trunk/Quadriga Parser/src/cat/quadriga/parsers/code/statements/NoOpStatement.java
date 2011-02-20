package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;

public class NoOpStatement extends StatementNode {

  public NoOpStatement(int beginLine, int beginColumn, int endLine,
      int endColumn) {
    super(beginLine, beginColumn, endLine, endColumn);
  }

  public NoOpStatement(CodeZone cz) {
    super(cz);
  }

  @Override
  public String treeStringRepresentation() {
    return "St: No operation";
  }

}
