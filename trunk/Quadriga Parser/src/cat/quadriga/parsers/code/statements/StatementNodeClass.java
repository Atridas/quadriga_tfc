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
  
  

  //TODO borrar això i implementar-ho on toca
  @Override
  public StatementNodeClass getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }
}
