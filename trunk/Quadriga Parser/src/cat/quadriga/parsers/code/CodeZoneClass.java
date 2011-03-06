package cat.quadriga.parsers.code;

import cat.quadriga.parsers.Token;

public class CodeZoneClass implements CodeZone {
  public final int beginLine;
  public final int beginColumn;
  public final int endLine;
  public final int endColumn;
  public final String file;
  
  public CodeZoneClass(int beginLine, int beginColumn, int endLine, int endColumn, String file) {
    this.beginLine = beginLine;
    this.beginColumn = beginColumn;
    this.endLine = endLine;
    this.endColumn = endColumn;
    this.file = file;
  }
  
  public CodeZoneClass(CodeZone cd) {
    this.beginLine   = cd.beginLine();
    this.beginColumn = cd.beginColumn();
    this.endLine     = cd.endLine();
    this.endColumn   = cd.endColumn();
    this.file        = cd.file();
  }
  
  public CodeZoneClass(CodeZone cd, CodeZone cd2) {
    this.beginLine   = cd.beginLine();
    this.beginColumn = cd.beginColumn();
    this.endLine     = cd2.endLine();
    this.endColumn   = cd2.endColumn();
    this.file        = cd.file();
  }
  
  public CodeZoneClass(Token t, String file) {
    this.beginLine   = t.beginLine;
    this.beginColumn = t.beginColumn;
    this.endLine     = t.endLine;
    this.endColumn   = t.endColumn;
    this.file        = file;
  }
  
  public CodeZoneClass(Token t, Token t2, String file) {
    this.beginLine   = t.beginLine;
    this.beginColumn = t.beginColumn;
    this.endLine     = t2.endLine;
    this.endColumn   = t2.endColumn;
    this.file        = file;
  }
  
  public CodeZoneClass(CodeZone cz, Token t) {
    this.beginLine   = cz.beginLine();
    this.beginColumn = cz.beginColumn();
    this.endLine     = t.endLine;
    this.endColumn   = t.endColumn;
    this.file        = cz.file();
  }
  
  public CodeZoneClass(Token t, CodeZone cz) {
    this.beginLine   = t.beginLine;
    this.beginColumn = t.beginColumn;
    this.endLine     = cz.endLine();
    this.endColumn   = cz.endColumn();
    this.file        = cz.file();
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

  @Override
  public final String file() {
    return file;
  }
}
