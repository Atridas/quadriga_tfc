package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.statements.CallToNamedArguments;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.qdg.Component;

public class ComponentAllocation extends ExpressionNodeClass {
  
  public final Component            component;
  public final CallToNamedArguments arguments;

  public ComponentAllocation(Component component, CallToNamedArguments arguments, CodeZone cz) {
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

}
