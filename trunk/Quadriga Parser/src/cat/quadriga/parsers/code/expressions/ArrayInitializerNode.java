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
    super(new CodeZoneClass(allocation, (inits.length>0)?inits[inits.length-1]:allocation));

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

  private boolean linked = false;
  private ArrayInitializerNode linkedVersion = null;
  @Override
  public ArrayInitializerNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ArrayAllocationExpressionNode newalloc;
      if(allocation.isCorrectlyLinked()) {
        newalloc = allocation;
      } else {
        newalloc = allocation.getLinkedVersion(symbolTable, errorLog);
        if(newalloc == null) {
          return null;
        }
      }
      
      List<ExpressionNode> nInits = new ArrayList<ExpressionNode>();
      for(ExpressionNode init : inits) {
        if(init.isCorrectlyLinked()) {
          nInits.add(init);
        } else {
          init = init.getLinkedVersion(symbolTable, errorLog);
          if(init == null) {
            return null;
          } else {
            nInits.add(init);
          }
        }
      }
      
      linkedVersion = new ArrayInitializerNode(newalloc,nInits.toArray(new ExpressionNode[nInits.size()]));
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

}
