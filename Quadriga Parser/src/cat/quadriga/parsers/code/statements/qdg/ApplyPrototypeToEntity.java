package cat.quadriga.parsers.code.statements.qdg;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.CallToNamedArguments;
import cat.quadriga.parsers.code.statements.StatementNodeClass;
import cat.quadriga.parsers.code.types.qdg.Component;
import cat.quadriga.parsers.code.types.qdg.Prototype;

public class ApplyPrototypeToEntity extends StatementNodeClass {
  
  public final ExpressionNode entity;
  public final Prototype base;
  public final CallToNamedArguments arguments;
  public final Map<Component, CallToNamedArguments> componentArguments;
  

  public ApplyPrototypeToEntity(
      ExpressionNode entity,
      Prototype base, 
      CallToNamedArguments arguments, 
      Map<Component, CallToNamedArguments> componentArguments,
      CodeZone cz) {
    super(cz);
    this.entity = entity;
    this.base = base;
    this.arguments = arguments;
    this.componentArguments = componentArguments;
  }

  @Override
  public String treeStringRepresentation() {
    List<String> aux = new LinkedList<String>();
    aux.add(entity.treeStringRepresentation());
    aux.add(base.treeStringRepresentation());
    aux.add(arguments.treeStringRepresentation());
    for(Entry<Component, CallToNamedArguments> entry : componentArguments.entrySet()) {
      aux.add(
          Utils.treeStringRepresentation("Component redefinition", 
              entry.getKey().getBinaryName(),
              entry.getValue().treeStringRepresentation())
          );
    }
    return Utils.treeStringRepresentation("Apply Prototype to Entity",aux);
  }

}
