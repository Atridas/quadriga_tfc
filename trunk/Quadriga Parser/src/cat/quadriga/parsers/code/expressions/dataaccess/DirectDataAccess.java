package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;

public abstract class DirectDataAccess extends ExpressionNodeClass implements DataAccess {

  public DirectDataAccess(int beginLine, int beginColumn, int endLine,
      int endColumn) {
    super(beginLine, beginColumn, endLine, endColumn);
  }
  
  public DirectDataAccess(CodeZone cz) {
    super(cz);
  }
  
  @Override
  public String[] getOperands() {
    return new String[0];
  }
}
