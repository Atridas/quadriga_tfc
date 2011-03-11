package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;

public abstract class StatementNodeClass extends CodeZoneClass implements StatementNode {

  public StatementNodeClass(CodeZone cz) {
    super(cz);
  }
  
  public String toString() {
    return treeStringRepresentation();
  }

  private static SymbolTable symbolTable = new SymbolTable();
  private static ErrorLog    errorLog    = new ErrorLog();
  public final String treeStringRepresentation() {
    String operation = getOperation();
    String operands[] = getOperands();
    
    String linkedStatus = ""; 
  
    if(!isCorrectlyLinked()) {
      StatementNodeClass enc = getLinkedVersion(symbolTable, errorLog);
      if(enc != null) {
        linkedStatus += " <+>";
      } else {
        linkedStatus += " <->";
      }
    } else {
      linkedStatus += " <+>";
    }
    
    return "St: " + Utils.treeStringRepresentation(operation + linkedStatus, operands);
  }
  

  @Override
  public abstract StatementNodeClass getLinkedVersion(SymbolTable symbolTable, 
      ErrorLog errorLog);
  
  @Override
  public void execute(SymbolTable symbolTable) {
    //TODO
    throw new IllegalStateException("Not yet implemented");
  }
}
