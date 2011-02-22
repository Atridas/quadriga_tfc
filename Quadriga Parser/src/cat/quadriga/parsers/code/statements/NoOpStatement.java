package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;

public class NoOpStatement extends StatementNode {

  public NoOpStatement(CodeZone cz) {
    super(cz);
  }
  
  public NoOpStatement() {
    super(new CodeZoneClass(0,0,0,0));
  }

  @Override
  public String treeStringRepresentation() {
    return "St: No operation";
  }

}
