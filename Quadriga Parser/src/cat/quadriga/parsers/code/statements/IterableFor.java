package cat.quadriga.parsers.code.statements;


import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.dataaccess.LocalVarAccess;

public class IterableFor extends StatementNode implements BucleInterface {
  
  public final LocalVarAccess iterator;
  public final ExpressionNode iterable;
  public final StatementNode execution;

  public IterableFor(LocalVarAccess iterator, ExpressionNode iterable, StatementNode execution, CodeZone cz) {
    super(cz);
    this.iterator = iterator;
    this.iterable = iterable;
    this.execution = execution;
  }

  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      treeStringRepresentation = Utils.treeStringRepresentation("for iteration", 
                                    "iterator: " + iterator.var.name + " {" + iterator.var.type + "}",
                                    iterable.treeStringRepresentation(),
                                    execution.treeStringRepresentation());
    }
    return treeStringRepresentation;
  }

}
