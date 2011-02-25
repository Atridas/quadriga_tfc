package cat.quadriga.parsers.code.expressions;

import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.types.ArrayType;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;

public class ArrayAllocationExpressionNode extends ExpressionNodeClass {

  public final BaseType arrayType;
  public final BaseType base;
  public final int dimensions;
  private final ExpressionNode[] lengths;
  
  public ArrayAllocationExpressionNode(BaseType type, ExpressionNode[] lengths, int totalDimensions, CodeZone cz) {
    super(cz);
    
    assert lengths.length > 0;
    
    this.base = type;
    this.dimensions = totalDimensions;
    this.lengths = new ExpressionNode[lengths.length];
    
    BaseType aux = type;
    for(int i = 0; i < lengths.length; i++) {
      aux = new ArrayType(aux);
      this.lengths[i] = lengths[i];
    }
    arrayType = aux;
  }

  @Override
  public String[] getOperands() {
    List<String> aux = new LinkedList<String>();
    aux.add(base.toString());
    for(int i = 0; i < lengths.length; i++) {
      aux.add(lengths[i].treeStringRepresentation());
    }
    
    String saux = "";
    for(int i = lengths.length; i < dimensions; i++) {
      saux += "[]";
    }
    if(saux.length() > 0)
      aux.add(saux);
    
    return aux.toArray(new String[aux.size()]);
  }

  @Override
  public String getOperation() {
    if(base instanceof PrimitiveTypeRef) {
      return "new primitive array";
    } else {
      return "new array";
    }
  }

  @Override
  public BaseType getType() {
    return arrayType;
  }

}
