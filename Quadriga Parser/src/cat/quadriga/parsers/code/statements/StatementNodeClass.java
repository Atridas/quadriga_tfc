package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;

public abstract class StatementNodeClass extends CodeZoneClass implements StatementNode {

  public StatementNodeClass(CodeZone cz) {
    super(cz);
  }
  
  public String toString() {
    return treeStringRepresentation();
  }
  
  

  @Override
  public abstract StatementNodeClass getLinkedVersion(SymbolTable symbolTable, 
      ErrorLog errorLog);
}
