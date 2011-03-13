package cat.quadriga.parsers.code.expressions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.types.ArrayType;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeEnvironment;

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
      ArrayAllocationExpressionNode newalloc;
      if(allocation.isCorrectlyLinked()) {
        newalloc = allocation;
      } else {
        newalloc = allocation.getLinkedVersion(symbolTable, errorLog);
        if(newalloc == null) {
          newalloc = allocFromInits();
          if(newalloc == null) {
            return null;
          }
          newalloc = newalloc.getLinkedVersion(symbolTable, errorLog);
          if(newalloc == null) {
            return null;
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

  
  private ArrayAllocationExpressionNode allocFromInits() {
    int size = inits.size();
    BaseType type = null;
    if(size == 0) {
      type = ClassOrInterfaceTypeRef.getFromClass(Object.class);
    }
    for(ExpressionNode xn : inits) {
      BaseType newType = xn.getType();
      if(type == null) {
        type = newType;
      } if(!type.isAssignableFrom(newType)) {
        if(newType.isAssignableFrom(type)) {
          type = newType;
        } else {
          return null;
        }
      }
    }
    ExpressionNode[] sizes = {new LiteralData.IntegerLiteral(size)}; 
    return new ArrayAllocationExpressionNode(
        type, 
        sizes, 
        1, 
        this);
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }
  
  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    ComputedValue cv = allocation.compute(runtime);
    Object array = cv.getAsObject();
    
    BaseType type = ((ArrayType)allocation.getType()).base;
    
    int i = 0;
    for(ExpressionNode init : inits) {
      if(type instanceof PrimitiveTypeRef) {
        switch(((PrimitiveTypeRef)type).type) {
        case BOOLEAN:
          Array.setBoolean(array, i, init.compute(runtime).getAsBool());
          break;
        case BYTE:
          Array.setByte(array, i, init.compute(runtime).getAsByte());
          break;
        case CHAR:
          Array.setChar(array, i, init.compute(runtime).getAsChar());
          break;
        case DOUBLE:
          Array.setDouble(array, i, init.compute(runtime).getAsDouble());
          break;
        case FLOAT:
          Array.setFloat(array, i, init.compute(runtime).getAsFloat());
          break;
        case INT:
          Array.setInt(array, i, init.compute(runtime).getAsInt());
          break;
        case LONG:
          Array.setLong(array, i, init.compute(runtime).getAsLong());
          break;
        case SHORT:
          Array.setShort(array, i, init.compute(runtime).getAsShort());
          break;
        default :
          throw new IllegalStateException();
        }
      } else {
        Array.set(array, i, init.compute(runtime).getAsObject());
      }
      
      ++i;
    }
    return cv;
  }
}
