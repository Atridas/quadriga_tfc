package cat.quadriga.parsers.code.expressions;

import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.types.ArrayType;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;

public final class ArrayAllocationExpressionNode extends ExpressionNodeClass {

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

  private ArrayAllocationExpressionNode linkedVersion = null;
  @Override
  public ArrayAllocationExpressionNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linkedVersion == null) {
      BaseType newBase;
      ExpressionNode[] newLengths = new ExpressionNode[lengths.length];
      
      if(base.isValid()) {
        newBase = base; 
      } else {
        newBase = base.getValid(symbolTable, errorLog);
        if(newBase == null) {
          return null;
        }
      }
      
      for(int i = 0; i < lengths.length; i++) {
        ExpressionNode len = lengths[i];
        if(!len.isCorrectlyLinked()) {
          len = len.getLinkedVersion(symbolTable, errorLog);
          if(len == null) {
            return null;
          }
        }
        if(len.getType() != PrimitiveTypeRef.getFromName("int") &&
           len.getType() != ClassOrInterfaceTypeRef.getFromClass(Integer.class)) {
          errorLog.insertError("S'ha trobat un " + len.getType().getBinaryName() + " quan es buscava un enter", lengths[i]);
          return null;
        }
        newLengths[i] = len;
      }
      
      linkedVersion = new ArrayAllocationExpressionNode(newBase, newLengths, dimensions, this);
      if(!linkedVersion.arrayType.isValid()) {
        errorLog.insertError("No es pot crear un array de " + base.getBinaryName(), this);
        return null;
      }
      linkedVersion.linkedVersion = linkedVersion;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linkedVersion != null;
  }

}
