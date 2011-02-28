package cat.quadriga.parsers.code.expressions;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.types.BaseType;

public class ArrayInitializerNode extends ExpressionNodeClass {

  public final ArrayAllocationExpressionNode allocation;
  public final List<ExpressionNode> inits;
  
  public ArrayInitializerNode(ArrayAllocationExpressionNode allocation, ExpressionNode... inits) {
    super(new CodeZoneClass(allocation, inits[inits.length-1]));

    this.allocation = allocation;
    
    List<ExpressionNode> aux = new Vector<ExpressionNode>(inits.length);
    for(int i = 0; i < inits.length; i++) {
      aux.add(inits[i]);
    }
    
    this.inits = Collections.unmodifiableList(aux);
    
  }

  @Override
  public String[] getOperands() {
    String[] aux = new String[inits.size() + 1];
    aux[0] = allocation.treeStringRepresentation();
    int i = 1;
    for(ExpressionNode init : inits) {
      aux[i] = init.treeStringRepresentation();
      i++;
    }
    return aux;
  }

  @Override
  public String getOperation() {
    return "Array initialization";
  }

  @Override
  public BaseType getType() {
    return allocation.getType();
  }

}
