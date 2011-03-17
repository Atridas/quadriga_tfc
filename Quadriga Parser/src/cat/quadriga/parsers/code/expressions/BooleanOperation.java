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
    this.linked = true;
    if(linked) {
      linkedVersion = this;
    }
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
  private ExpressionNode linkedVersion = null;
  @Override
  public ExpressionNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode left, right;
      if(leftOperand.isCorrectlyLinked()) {
        left = leftOperand;
      } else {
        left = leftOperand.getLinkedVersion(symbolTable, errorLog);
        if(left == null) {
          return null;
        }
      }
      if(rightOperand.isCorrectlyLinked()) {
        right = rightOperand;
      } else {
        right = rightOperand.getLinkedVersion(symbolTable, errorLog);
        if(right == null) {
          return null;
        }
      }
      switch(operator) {
      case INSTANCEOF:
        if(!(left.getType() instanceof ClassOrInterfaceTypeRef)) {
          errorLog.insertError("Left hand is not a Class",this);
          return null;
        } else if(right instanceof TypeDataAccess) {
          errorLog.insertError("Right hand is not a Type",this);
          return null;
        }
        break;
      case EQ:
        if(left instanceof LiteralData.NullLiteral) {
          linkedVersion = new UnaryOperation(UnaryOperation.Operator.IS_NULL,right,this).getLinkedVersion(symbolTable, errorLog);
          return linkedVersion;
        } else if(right instanceof LiteralData.NullLiteral) {
          linkedVersion = new UnaryOperation(UnaryOperation.Operator.IS_NULL,left,this).getLinkedVersion(symbolTable, errorLog);
          return linkedVersion;
        }
      case NEQ:
        if(left instanceof LiteralData.NullLiteral) {
          linkedVersion = new UnaryOperation(UnaryOperation.Operator.IS_NULL,right,this);
          linkedVersion = new UnaryOperation(UnaryOperation.Operator.NOT,linkedVersion,this).getLinkedVersion(symbolTable, errorLog);
          return linkedVersion;
        } else if(right instanceof LiteralData.NullLiteral) {
          linkedVersion = new UnaryOperation(UnaryOperation.Operator.IS_NULL,left,this);
          linkedVersion = new UnaryOperation(UnaryOperation.Operator.NOT,linkedVersion,this).getLinkedVersion(symbolTable, errorLog);
          return linkedVersion;
        }
        if(left.getType() instanceof ReferenceTypeRef && right.getType() instanceof ReferenceTypeRef) {
          break;
        }
      case LT:
      case GT:
      case LE:
      case GE:
        if(!left.getType().isMathematicallyOperable()) {
          errorLog.insertError("Left hand is not comparable",this);
          return null;
        } else if(!right.getType().isMathematicallyOperable()) {
          errorLog.insertError("Right hand is not comparable",this);
          return null;
        }
      }
      linkedVersion = new BooleanOperation(operator, left, right);
    }
    return linkedVersion;
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
