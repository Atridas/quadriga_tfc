package cat.quadriga.parsers.code;

import cat.quadriga.parsers.Token;

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
  
  public CodeZoneClass(CodeZone cd, CodeZone cd2) {
    this.beginLine = cd.beginLine();
    this.beginColumn = cd.beginColumn();
    this.endLine = cd2.endLine();
    this.endColumn = cd2.endColumn();
  }
  
  public CodeZoneClass(Token t) {
    this.beginLine = t.beginLine;
    this.beginColumn = t.beginColumn;
    this.endLine = t.endLine;
    this.endColumn = t.endColumn;
  }
  
  public CodeZoneClass(Token t, Token t2) {
    this.beginLine = t.beginLine;
    this.beginColumn = t.beginColumn;
    this.endLine = t2.endLine;
    this.endColumn = t2.endColumn;
  }
  
  public CodeZoneClass(CodeZone cz, Token t) {
    this.beginLine = cz.beginLine();
    this.beginColumn = cz.beginColumn();
    this.endLine = t.endLine;
    this.endColumn = t.endColumn;
  }
  
  public CodeZoneClass(Token t, CodeZone cz) {
    this.beginLine = t.beginLine;
    this.beginColumn = t.beginColumn;
    this.endLine = cz.endLine();
    this.endColumn = cz.endColumn();
  }

  @Override
  public final int beginColumn() {
    return beginColumn;
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
