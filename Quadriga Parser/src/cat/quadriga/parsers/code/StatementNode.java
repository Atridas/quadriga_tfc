package cat.quadriga.parsers.code;

public abstract class StatementNode {
  
  private final int beginLine;
  private final int beginColumn;
  private final int endLine;
  private final int endColumn;
  
  public StatementNode(int beginLine, int beginColumn, int endLine, int endColumn) {
    this.beginLine = beginLine;
    this.beginColumn = beginColumn;
    this.endLine = endLine;
    this.endColumn = endColumn;
  }

  public abstract String treeStringRepresentation();
  
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
