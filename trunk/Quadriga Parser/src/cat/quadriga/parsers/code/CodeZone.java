package cat.quadriga.parsers.code;

public class CodeZone {
  public final int beginLine;
  public final int beginColumn;
  public final int endLine;
  public final int endColumn;
  
  public CodeZone(int beginLine, int beginColumn, int endLine, int endColumn) {
    this.beginLine = beginLine;
    this.beginColumn = beginColumn;
    this.endLine = endLine;
    this.endColumn = endColumn;
  }
  
  public CodeZone(CodeZone cd) {
    this.beginLine = cd.beginLine;
    this.beginColumn = cd.beginColumn;
    this.endLine = cd.endLine;
    this.endColumn = cd.endColumn;
  }
}
