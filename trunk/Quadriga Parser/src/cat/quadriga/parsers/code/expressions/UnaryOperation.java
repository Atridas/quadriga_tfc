package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.ReferenceTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class UnaryOperation extends UnaryExpressionNode {

  public final Operator operator;
  public UnaryOperation( Operator operator,
                         ExpressionNode operant,
                         CodeZone cz) 
  {
    super(operant, cz);
    this.operator = operator;
  }
  
  public UnaryOperation( Operator operator,
      ExpressionNode operant,
      Token t) 
  {
    this(operator, operant, 
        (operator.isPost())? new CodeZoneClass(operant, t) :
                         new CodeZoneClass(t, operant));
  }
  
  @Override
  public String getOperation() {
    return operator.toString();
  }

  public static enum Operator {
    NEGATE("-", false),
    BIT_COMP("~", false),
    NOT("!", false),
    PRE_INC("++X", false),
    PRE_DEC("--X", false),
    POST_INC("X++", true),
    POST_DEC("X--", true),
    IS_NULL("isnull",false);
    
    private String representation;
    private boolean post;
    private Operator(String r, boolean p) {
      representation = r;
      post = p;
    }
    @Override
    public String toString() {
      return representation;
    }
    
    public boolean isPost() {
      return post;
    }
  }

  @Override
  public BaseType getType() {
    switch(operator) {
    case NOT:
    case IS_NULL:
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.BOOLEAN);
    case BIT_COMP:
    case NEGATE:
    case PRE_INC:
    case PRE_DEC:
    case POST_INC:
    case POST_DEC:
      return operand.getType();
    default:
      return UnknownType.empty;
    }
  }

  private boolean linked = false;
  private UnaryOperation linkedVersion = null;
  @Override
  public UnaryOperation getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode newOperand;
      if(operand.isCorrectlyLinked()) {
        newOperand = operand;
      } else {
        newOperand = operand.getLinkedVersion(symbolTable, errorLog);
        if(newOperand == null) {
          return null;
        }
      }
      BaseType bt = newOperand.getType();
      switch(operator) {
      case BIT_COMP:
        if(bt instanceof PrimitiveTypeRef) {
          PrimitiveTypeRef prim = (PrimitiveTypeRef)bt;
          switch(prim.type) {
          case BYTE:
          case CHAR:
          case INT:
          case LONG:
            break;
          default:
            errorLog.insertError("Operator '~' not valid", this);
            return null;
          }
        } else {
          errorLog.insertError("Operator '~' not valid", this);
          return null;
        }
        break;
      case NOT:
        if(bt instanceof PrimitiveTypeRef) {
          PrimitiveTypeRef prim = (PrimitiveTypeRef)bt;
          switch(prim.type) {
          case BOOLEAN:
            break;
          default:
            errorLog.insertError("Operator '!' not valid", this);
            return null;
          }
        } else {
          errorLog.insertError("Operator '!' not valid", this);
          return null;
        }
        break;
      case NEGATE:
        if(!bt.isMathematicallyOperable()) {
          errorLog.insertError("Operator '" + operator.representation + "' not valid", this);
          return null;
        }
        break;
      case PRE_INC:
      case PRE_DEC:
      case POST_INC:
      case POST_DEC:
        if(!bt.isMathematicallyOperable()) {
          errorLog.insertError("Operator '" + operator.representation + "' not valid", this);
          return null;
        }
        if(operand instanceof DataAccess) {
          DataAccess da = (DataAccess)operand;
          if(da.isAssignable()) {
            operand = da.getWriteVersion(symbolTable);
            assert(operand != null);
          } else {
            errorLog.insertError("A l'operand no s'hi pot escriure",operand);
            return null;
          }
        } else {
          errorLog.insertError("A l'operand no és un accés a dades",operand);
          return null;
        }
        break;
      case IS_NULL:
        if(!(bt instanceof ReferenceTypeRef)) {
          errorLog.insertError("Need a reference operand", operand);
          return null;
        }
        break;
      default:
        errorLog.insertError("Operator '" + operator.representation + "' not recognized", this);
        return null;
      }
      
      linkedVersion = new UnaryOperation(operator, newOperand, this);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion; 
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    LiteralData lit = operand.getCompileTimeConstant();
    if(lit == null)
      return null;
    return lit.unaryOp(operator);
  }
  

  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    try {
      ComputedValue cv = operand.compute(runtime);
      DataAccess da;
      LiteralData lit;
      switch(operator) {
      case NOT:
        return new LiteralData.BooleanLiteral(
            !cv.getAsBool(), this);
      case IS_NULL:
        if(cv instanceof Entity) {
          return new LiteralData.BooleanLiteral(false, this);
        } else {
          return new LiteralData.BooleanLiteral(
              cv.getAsObject() == null, this);
        }
      case PRE_INC:
        da = (DataAccess)operand;
        lit = (LiteralData) cv;
        lit = lit.executeMathematicalOp(new LiteralData.IntegerLiteral(1), MathematicOperation.Operator.ADD);
        da.getWriteVersion(runtime.symbolTable).setValue(lit, runtime);
        return lit;
      case PRE_DEC:
        da = (DataAccess)operand;
        lit = (LiteralData) cv;
        lit = lit.executeMathematicalOp(new LiteralData.IntegerLiteral(1), MathematicOperation.Operator.SUB);
        da.getWriteVersion(runtime.symbolTable).setValue(lit, runtime);
        return lit;
      case POST_INC:
        da = (DataAccess)operand;
        lit = (LiteralData) cv;
        lit = lit.executeMathematicalOp(new LiteralData.IntegerLiteral(1), MathematicOperation.Operator.ADD);
        da.getWriteVersion(runtime.symbolTable).setValue(lit, runtime);
        return cv;
      case POST_DEC:
        da = (DataAccess)operand;
        lit = (LiteralData) cv;
        lit = lit.executeMathematicalOp(new LiteralData.IntegerLiteral(1), MathematicOperation.Operator.SUB);
        da.getWriteVersion(runtime.symbolTable).setValue(lit, runtime);
        return cv;
      case BIT_COMP:
      case NEGATE:
      default:
        throw new RuntimeException("Not yet implemented");
      }
    } catch (Exception e) {
      throw new RuntimeException("Error in " 
          + beginLine + ":" + beginColumn + " "
          + endLine + ":" + endColumn + " " + file, e);
    }
  }
}
