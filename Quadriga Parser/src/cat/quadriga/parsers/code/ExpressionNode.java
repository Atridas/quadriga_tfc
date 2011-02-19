package cat.quadriga.parsers.code;

public abstract class ExpressionNode {
  
  private String treeStringRepresentation = null;
  
  private final int beginLine;
  private final int beginColumn;
  private final int endLine;
  private final int endColumn;
  
  public ExpressionNode(int beginLine, int beginColumn, int endLine, int endColumn) {
    this.beginLine = beginLine;
    this.beginColumn = beginColumn;
    this.endLine = endLine;
    this.endColumn = endColumn;
  }

  public final String treeStringRepresentation() {
    if(treeStringRepresentation != null) {
      return treeStringRepresentation;
    }
  
    String operation = getOperation();
    String operands[] = getOperands();
  
    return "Op: " + Utils.treeStringRepresentation(operation, operands);
  }

  protected abstract String   getOperation();
  protected abstract String[] getOperands();
	
  @Override
  public String toString() {
    return treeStringRepresentation();
  }


  public int getBeginLine() {
    return beginLine;
  }
  public int getBeginColumn() {
    return beginColumn;
  }
  public int getEndLine() {
    return endLine;
  }
  public int getEndColumn() {
    return endColumn;
  }
}