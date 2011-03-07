package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;

public class ThrowStatementNode extends StatementNodeClass {

  public final ExpressionNode toThrow;
  
  public ThrowStatementNode(ExpressionNode toThrow, CodeZone cz) {
    super(cz);
    this.toThrow = toThrow;
  }

  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      treeStringRepresentation = Utils.treeStringRepresentation("throw", 
                                  toThrow.treeStringRepresentation());
    }
    return treeStringRepresentation;
  }
  @Override
  public StatementNodeClass getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(isCorrectlyLinked()) {
      return this;
    }
    ExpressionNode aux = toThrow.getLinkedVersion(symbolTable, errorLog);
    if(aux == null) {
      return null;
    } else {
      return new ThrowStatementNode(aux, this);
    }
  }
  @Override
  public boolean isCorrectlyLinked() {
    return toThrow.isCorrectlyLinked();
  }

}
