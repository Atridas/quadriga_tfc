package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.statements.CallToNamedArguments;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;

public final class ComponentAllocation extends ExpressionNodeClass {
  
  public final QuadrigaComponent            component;
  public final CallToNamedArguments arguments;

  public ComponentAllocation(QuadrigaComponent component, CallToNamedArguments arguments, CodeZone cz) {
    super(cz);
    this.component = component;
    this.arguments = arguments;
  }

  @Override
  public String[] getOperands() {
    String[] aux = {component.treeStringRepresentation(), 
                    arguments.treeStringRepresentation()};
    return aux;
  }

  @Override
  public String getOperation() {
    return "Component Allocation";
  }

  @Override
  public BaseType getType() {
    return component;
  }

  @Override
  public ComponentAllocation getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

}
