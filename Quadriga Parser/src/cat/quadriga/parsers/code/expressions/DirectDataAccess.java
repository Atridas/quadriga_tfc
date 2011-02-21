package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;

public abstract class DirectDataAccess extends ExpressionNode implements DataAccess {

  public DirectDataAccess(int beginLine, int beginColumn, int endLine,
      int endColumn) {
    super(beginLine, beginColumn, endLine, endColumn);
  }
  
  public DirectDataAccess(CodeZone cz) {
    super(cz);
  }
}
