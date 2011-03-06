package cat.quadriga.parsers.code.expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.BaseType;

public final class ArrayInitializerNode extends ExpressionNodeClass {

  public final ArrayAllocationExpressionNode allocation;
  public final List<ExpressionNode> inits;
  
  public ArrayInitializerNode(ArrayAllocationExpressionNode allocation, ExpressionNode... inits) {
    super(new CodeZoneClass(allocation, inits[inits.length-1]));

    this.allocation = allocation;
    
    List<ExpressionNode> aux = new ArrayList<ExpressionNode>(inits.length);
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

  @Override
  public ArrayInitializerNode getLinkedVersion(SymbolTable symbolTable,
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
