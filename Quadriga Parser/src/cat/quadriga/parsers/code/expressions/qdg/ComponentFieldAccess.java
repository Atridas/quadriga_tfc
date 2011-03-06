package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.dataaccess.DirectDataAccess;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent.ComponentField;

public class ComponentFieldAccess extends DirectDataAccess {
  
  public final String field;
  public final QuadrigaComponent component;
  
  public final ExpressionNode reference;

  public ComponentFieldAccess(ExpressionNode reference, String field, CodeZone cz) {
    super(cz);
    this.field = field;
    this.component = (QuadrigaComponent)reference.getType();
    this.reference = reference;
  }
  
  public boolean isStatic() {
    return false;
  }
  
  @Override
  public String getOperation() {
    ComponentField cf = component.getField(field);
    if(cf == null) {
      return ">> Wrong Component Field: <<";
    }
    return "Component Field:";
  }
  
  @Override
  public String[] getOperands() {
    String[] aux = { component.getBinaryName() + " -> " + field,
                     reference.treeStringRepresentation()}; 
    return aux;
  }

  @Override
  public BaseType getType() {
    ComponentField cf = component.getField(field);
    if(cf == null) {
      return UnknownType.empty;
    }
    return cf.type;
  }

  @Override
  public boolean isAssignable() {
    //TODO fer-ho depenent de la entitat?
    return true;
  }

  @Override
  public boolean isReadable() {
    //TODO fer-ho depenent de la entitat?
    return true;
  }

}
