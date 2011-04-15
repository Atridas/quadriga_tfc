package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.expressions.dataaccess.TypeDataAccess;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.ReferenceTypeRef;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class BooleanOperation extends BinaryExpressionNode {

  public final Operator operator;
  public BooleanOperation( Operator operator,
                              ExpressionNode operant1, 
                              ExpressionNode operant2) {
    super(operant1,  operant2);
    this.operator = operator;
  }

  public BooleanOperation( Operator operator,
                              ExpressionNode operant1, 
                              ExpressionNode operant2,
                              boolean linked) {
    super(operant1,  operant2);
    this.operator = operator;
    this.linked = linked;
  }
  
  @Override
  public String getOperation() {
    return operator.toString();
  }

  public static enum Operator {
    LT("<"),  GT(">"),
    LE("<="), GE(">="),
    EQ("=="), NEQ("!="),
    INSTANCEOF("instanceof");
    
    private String representation;
    private Operator(String r) {
      representation = r;
    }
    @Override
    public String toString() {
      return representation;
    }
  }

  @Override
  public BaseType getType() {
    return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.BOOLEAN);
  }
  
  private boolean linked = false;
  @Override
  public ExpressionNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) return this;
    linked = true;
    
    ExpressionNode aux;
    if(!leftOperand.isCorrectlyLinked()) {
      aux = leftOperand.getLinkedVersion(symbolTable, errorLog);
      if(aux == null) {
        linked = false;
      } else {
        leftOperand = aux;
      }
    }
    if(!rightOperand.isCorrectlyLinked()) {
      aux = rightOperand.getLinkedVersion(symbolTable, errorLog);
      if(aux == null) {
        linked = false;
      } else {
        rightOperand = aux;
      }
    }
    
    
    switch(operator) {
    case INSTANCEOF:
      if(!(leftOperand.getType() instanceof ClassOrInterfaceTypeRef)) {
        errorLog.insertError("Left hand is not a Class",this);
        linked = false;
      } else if(rightOperand instanceof TypeDataAccess) {
        errorLog.insertError("Right hand is not a Type",this);
        linked = false;
      }
      break;
    case EQ:
      if(leftOperand instanceof LiteralData.NullLiteral) {
        return new UnaryOperation(UnaryOperation.Operator.IS_NULL,rightOperand,this).getLinkedVersion(symbolTable, errorLog);
      } else if(rightOperand instanceof LiteralData.NullLiteral) {
        return new UnaryOperation(UnaryOperation.Operator.IS_NULL,leftOperand,this).getLinkedVersion(symbolTable, errorLog);
      }
    case NEQ:
      if(leftOperand instanceof LiteralData.NullLiteral) {
        aux = new UnaryOperation(UnaryOperation.Operator.IS_NULL,rightOperand,this);
        return new UnaryOperation(UnaryOperation.Operator.NOT,aux,this).getLinkedVersion(symbolTable, errorLog);
      } else if(rightOperand instanceof LiteralData.NullLiteral) {
        aux = new UnaryOperation(UnaryOperation.Operator.IS_NULL,leftOperand,this);
        return new UnaryOperation(UnaryOperation.Operator.NOT,aux,this).getLinkedVersion(symbolTable, errorLog);
      }
      if(leftOperand.getType() instanceof ReferenceTypeRef && rightOperand.getType() instanceof ReferenceTypeRef) {
        break;
      }
    case LT:
    case GT:
    case LE:
    case GE:
      if(!leftOperand.getType().isMathematicallyOperable()) {
        errorLog.insertError("Left hand is not comparable",this);
        linked = false;
      } else if(!rightOperand.getType().isMathematicallyOperable()) {
        errorLog.insertError("Right hand is not comparable",this);
        linked = false;
      }
    }
    //linkedVersion = new BooleanOperation(operator, left, right);
    
    if(linked) return this;
    else       return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    LiteralData left  = leftOperand .getCompileTimeConstant();
    LiteralData right = rightOperand.getCompileTimeConstant();
    if(left == null || right == null) {
      return null;
    }
    
    return left.executeBooleanOp(right, operator);
  }
  
  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    assert isCorrectlyLinked();
    
    try {
      ComputedValue left  = leftOperand .compute(runtime);
      ComputedValue right = rightOperand.compute(runtime);
      
      if(left instanceof LiteralData) {
        if(right instanceof LiteralData) {
          return ((LiteralData)left).executeBooleanOp((LiteralData)right, operator);
        } else {
          return new LiteralData.BooleanLiteral(false, this);
        }
      } else if(left instanceof Entity) {
        if(right instanceof Entity) {
          return new LiteralData.BooleanLiteral(
              ((Entity)left).getGUID() == ((Entity)right).getGUID(),
              this);
        } else {
          return new LiteralData.BooleanLiteral(false, this);
        }
      } else {
        switch(operator) {
        case EQ:
          return new LiteralData.BooleanLiteral(
              left.getAsObject() == right.getAsObject(),
              this);
        case NEQ:
          return new LiteralData.BooleanLiteral(
              left.getAsObject() != right.getAsObject(),
              this);
        case LT:
        case GT:
        case LE:
        case GE:
        case INSTANCEOF:
        default:
          throw new IllegalStateException("Not yet implemented");
        }
      }
    } catch (Exception e) {
      throw new RuntimeException("Error in " 
          + beginLine + ":" + beginColumn + " "
          + endLine + ":" + endColumn + " " + file, e);
    }
  }
}
