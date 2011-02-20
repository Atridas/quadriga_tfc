package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;

public abstract class ExpressionNode extends CodeZone {
  
  private String treeStringRepresentation = null;
  
  public ExpressionNode(int beginLine, int beginColumn, int endLine, int endColumn) {
    super(beginLine,  beginColumn,  endLine,  endColumn);
  }
  public ExpressionNode(CodeZone cz) {
    super(cz);
  }

  public final String treeStringRepresentation() {
    if(treeStringRepresentation != null) {
      return treeStringRepresentation;
    }
  
    String operation = getOperation();
    String operands[] = getOperands();
  
    return "Op: " + Utils.treeStringRepresentation(operation, operands);
  }

  public abstract String   getOperation();
  public abstract String[] getOperands();
	
  @Override
  public String toString() {
    return treeStringRepresentation();
  }
}
