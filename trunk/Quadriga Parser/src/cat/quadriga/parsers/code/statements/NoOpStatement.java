package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.runtime.RuntimeEnvironment;

public class NoOpStatement extends StatementNodeClass {

  public NoOpStatement(CodeZone cz) {
    super(cz);
  }
  
  public NoOpStatement() {
    super(new CodeZoneClass(0,0,0,0,""));
  }

  @Override
  public String[] getOperands() {
    String[] aux = {};
    return aux;
  }

  @Override
  public String getOperation() {
    return "No Operation";
  }

  @Override
  public NoOpStatement getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    return this;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return true;
  }
  
  @Override
  public void execute(RuntimeEnvironment runtime) {
    // Nà
  }

}
