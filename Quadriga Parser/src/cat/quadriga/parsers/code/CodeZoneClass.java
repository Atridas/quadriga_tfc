package cat.quadriga.parsers.code;

public class CodeZoneClass implements CodeZone {
  public final int beginLine;
  public final int beginColumn;
  public final int endLine;
  public final int endColumn;
  
  public CodeZoneClass(int beginLine, int beginColumn, int endLine, int endColumn) {
    this.beginLine = beginLine;
    this.beginColumn = beginColumn;
    this.endLine = endLine;
    this.endColumn = endColumn;
  }
  
  public CodeZoneClass(CodeZone cd) {
    this.beginLine = cd.beginLine();
    this.beginColumn = cd.beginColumn();
    this.endLine = cd.endLine();
    this.endColumn = cd.endColumn();
  }

  @Override
  public final int beginColumn() {
    return beginLine;
  }

  @Override
  public final int beginLine() {
    return beginLine;
  }

  @Override
  public final int endColumn() {
    return endColumn;
  }

  @Override
  public final int endLine() {
    return endLine;
  }
}
