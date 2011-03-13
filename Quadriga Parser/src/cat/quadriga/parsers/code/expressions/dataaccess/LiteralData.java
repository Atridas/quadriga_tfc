package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.BooleanOperation;
import cat.quadriga.parsers.code.expressions.MathematicOperation;
import cat.quadriga.parsers.code.expressions.UnaryOperation;
import cat.quadriga.parsers.code.expressions.UnaryOperation.Operator;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.NullType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeEnvironment;

public abstract class LiteralData extends DirectDataAccess implements ComputedValue {

  public LiteralData(Token t, String file) {
    super(new CodeZoneClass(t,file));
  }
  
  public LiteralData(CodeZone cz) {
    super(cz);
  }

  @Override
  public String getOperation() {
    return "Literal";
  }

  @Override
  public boolean isAssignable() {
    return false;
  }

  @Override
  public boolean isReadable() {
    return true;
  }
  
  public abstract Object getValue();
  
  @Override
  public WriteAccess getWriteVersion() {
    return null;
  }
  
  @Override
  public abstract LiteralData getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog);

  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    return this;
  }
  
  public LiteralData executeBooleanOp(LiteralData other, BooleanOperation.Operator operator) {
    if(this instanceof IntegerLiteral) {
      IntegerLiteral me = (IntegerLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.booleanOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.booleanOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.booleanOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.booleanOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.booleanOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    } else if(this instanceof LongLiteral) {
      LongLiteral me = (LongLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.booleanOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.booleanOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.booleanOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.booleanOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.booleanOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    } else if(this instanceof FloatLiteral) {
      FloatLiteral me = (FloatLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.booleanOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.booleanOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.booleanOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.booleanOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.booleanOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    } else if(this instanceof DoubleLiteral) {
      DoubleLiteral me = (DoubleLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.booleanOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.booleanOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.booleanOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.booleanOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.booleanOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    } else if(this instanceof CharacterLiteral) {
      CharacterLiteral me = (CharacterLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.booleanOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.booleanOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.booleanOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.booleanOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.booleanOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    } else if(this instanceof BooleanLiteral) {
      BooleanLiteral me = (BooleanLiteral)this;
      if(other instanceof BooleanLiteral) {
        return me.booleanOp((BooleanLiteral)other, operator);
      } else {
        return null;
      }
    }
    return null;
  }
  
  
  public LiteralData executeMathematicalOp(LiteralData other, MathematicOperation.Operator operator) {
    if(this instanceof IntegerLiteral) {
      IntegerLiteral me = (IntegerLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.mathematicOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.mathematicOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.mathematicOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.mathematicOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.mathematicOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    } else if(this instanceof LongLiteral) {
      LongLiteral me = (LongLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.mathematicOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.mathematicOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.mathematicOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.mathematicOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.mathematicOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    } else if(this instanceof FloatLiteral) {
      FloatLiteral me = (FloatLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.mathematicOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.mathematicOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.mathematicOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.mathematicOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.mathematicOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    } else if(this instanceof DoubleLiteral) {
      DoubleLiteral me = (DoubleLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.mathematicOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.mathematicOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.mathematicOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.mathematicOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.mathematicOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    } else if(this instanceof CharacterLiteral) {
      CharacterLiteral me = (CharacterLiteral)this;
      if(other instanceof IntegerLiteral) {
        return me.mathematicOp((IntegerLiteral)other, operator);
      } else if(other instanceof CharacterLiteral) {
        return me.mathematicOp((CharacterLiteral)other, operator);
      } else if(other instanceof DoubleLiteral) {
        return me.mathematicOp((DoubleLiteral)other, operator);
      } else if(other instanceof FloatLiteral) {
        return me.mathematicOp((FloatLiteral)other, operator);
      } else if(other instanceof LongLiteral) {
        return me.mathematicOp((LongLiteral)other, operator);
      } else {
        return null;
      }
    }
    return null;
  }
  
  public abstract LiteralData unaryOp(UnaryOperation.Operator operator);
  
  public static final class IntegerLiteral extends LiteralData {
    public int i;
    public IntegerLiteral(Token t, String file) {
      super(t, file);
      i = Integer.decode(t.image);
    }
    public IntegerLiteral(int i) {
      super(CodeZoneClass.compiling);
      this.i = i;
    }
    public IntegerLiteral(int i, CodeZone cz) {
      super(cz);
      this.i = i;
    }
    @Override
    public Integer getValue() {
      return new Integer(i);
    }
    @Override
    public String[] getOperands() {
      String[] aux = {"Integer: " + i};
      return aux;
    }
    @Override
    public BaseType getType() {
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.INT);
    }
    @Override
    public IntegerLiteral getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }
    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    @Override
    public LiteralData getCompileTimeConstant() {
      return this;
    }
    @Override
    public String getStringValue() {
      return (new StringBuilder()).append(i).toString();
    }

    @Override
    public void set(ComputedValue other) {
      if(other instanceof IntegerLiteral) {
        i = ((IntegerLiteral) other).i;
      } else if(other instanceof CharacterLiteral) {
        i = ((CharacterLiteral) other).c;
      }
    }
    
    public LiteralData booleanOp(IntegerLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = i == other.i;
        break;
      case NEQ:
        result = i != other.i;
        break;
      case GE:
        result = i >= other.i;
        break;
      case LE:
        result = i <= other.i;
        break;
      case LT:
        result = i < other.i;
        break;
      case GT:
        result = i > other.i;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true,this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(CharacterLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = i == other.c;
        break;
      case NEQ:
        result = i != other.c;
        break;
      case GE:
        result = i >= other.c;
        break;
      case LE:
        result = i <= other.c;
        break;
      case LT:
        result = i < other.c;
        break;
      case GT:
        result = i > other.c;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(DoubleLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = i == other.d;
        break;
      case NEQ:
        result = i != other.d;
        break;
      case GE:
        result = i >= other.d;
        break;
      case LE:
        result = i <= other.d;
        break;
      case LT:
        result = i < other.d;
        break;
      case GT:
        result = i > other.d;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(FloatLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = i == other.f;
        break;
      case NEQ:
        result = i != other.f;
        break;
      case GE:
        result = i >= other.f;
        break;
      case LE:
        result = i <= other.f;
        break;
      case LT:
        result = i < other.f;
        break;
      case GT:
        result = i > other.f;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(LongLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = i == other.l;
        break;
      case NEQ:
        result = i != other.l;
        break;
      case GE:
        result = i >= other.l;
        break;
      case LE:
        result = i <= other.l;
        break;
      case LT:
        result = i < other.l;
        break;
      case GT:
        result = i > other.l;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData mathematicOp(IntegerLiteral other, MathematicOperation.Operator operator) {
      int result;
      
      switch(operator) {
      case ADD:
        result = i + other.i;
        break;
      case SUB:
        result = i - other.i;
        break;
      case MUL:
        result = i * other.i;
        break;
      case DIV:
        result = i / other.i;
        break;
      case MOD:
        result = i % other.i;
        break;
      case BIT_AND:
        result = i & other.i;
        break;
      case BIT_OR:
        result = i | other.i;
        break;
      case BIT_XOR:
        result = i ^ other.i;
        break;
      case LEFT_SHIFT:
        result = i << other.i;
        break;
      case RIGHT_SHIFT:
        result = i >> other.i;
        break;
      case RIGHT_UNSIGNED_SHIFT:
        result = i >>> other.i;
        break;
      default:
        return null;
      }
      return new IntegerLiteral(result, this);
    }
    
    public LiteralData mathematicOp(CharacterLiteral other, MathematicOperation.Operator operator) {
      int result;
      
      switch(operator) {
      case ADD:
        result = i + other.c;
        break;
      case SUB:
        result = i - other.c;
        break;
      case MUL:
        result = i * other.c;
        break;
      case DIV:
        result = i / other.c;
        break;
      case MOD:
        result = i % other.c;
        break;
      case BIT_AND:
        result = i & other.c;
        break;
      case BIT_OR:
        result = i | other.c;
        break;
      case BIT_XOR:
        result = i ^ other.c;
        break;
      case LEFT_SHIFT:
        result = i << other.c;
        break;
      case RIGHT_SHIFT:
        result = i >> other.c;
        break;
      case RIGHT_UNSIGNED_SHIFT:
        result = i >>> other.c;
        break;
      default:
        return null;
      }
      return new IntegerLiteral(result, this);
    }
    
    public LiteralData mathematicOp(DoubleLiteral other, MathematicOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case ADD:
        result = i + other.d;
        break;
      case SUB:
        result = i - other.d;
        break;
      case MUL:
        result = i * other.d;
        break;
      case DIV:
        result = i / other.d;
        break;
      case MOD:
        result = i % other.d;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public LiteralData mathematicOp(FloatLiteral other, MathematicOperation.Operator operator) {
      float result;
      
      switch(operator) {
      case ADD:
        result = i + other.f;
        break;
      case SUB:
        result = i - other.f;
        break;
      case MUL:
        result = i * other.f;
        break;
      case DIV:
        result = i / other.f;
        break;
      case MOD:
        result = i % other.f;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new FloatLiteral(result, this);
    }
    
    public LiteralData mathematicOp(LongLiteral other, MathematicOperation.Operator operator) {
      long result;
      
      switch(operator) {
      case ADD:
        result = i + other.l;
        break;
      case SUB:
        result = i - other.l;
        break;
      case MUL:
        result = i * other.l;
        break;
      case DIV:
        result = i / other.l;
        break;
      case MOD:
        result = i % other.l;
        break;
      case BIT_AND:
        result = i & other.l;
        break;
      case BIT_OR:
        result = i | other.l;
        break;
      case BIT_XOR:
        result = i ^ other.l;
        break;
      case LEFT_SHIFT:
        result = i << other.l;
        break;
      case RIGHT_SHIFT:
        result = i >> other.l;
        break;
      case RIGHT_UNSIGNED_SHIFT:
        result = i >>> other.l;
        break;
      default:
        return null;
      }
      return new LongLiteral(result, this);
    }
    
    public LiteralData unaryOp(UnaryOperation.Operator operator) {
      int result;
      
      switch(operator) {
      case BIT_COMP:
        result = ~i;
        break;
      case NEGATE:
        result = -i;
        break;
      case POST_DEC:
      case PRE_DEC:
        result = i-1;
        break;
      case POST_INC:
      case PRE_INC:
        result = i+1;
        break;
      default:
        return null;
      }
      return new IntegerLiteral(result, this);
    }
    
    public boolean getAsBool() {
      throw new IllegalStateException();
    }
    public char getAsChar() {
      throw new IllegalStateException();
    }
    public byte getAsByte() {
      throw new IllegalStateException();
    }
    public short getAsShort() {
      throw new IllegalStateException();
    }
    public int getAsInt() {
      return i;
    }
    public long getAsLong() {
      return i;
    }
    public float getAsFloat() {
      return i;
    }
    public double getAsDouble() {
      return i;
    }
    public Object getAsObject() {
      return new Integer(i);
    }
  }
  
  public static final class LongLiteral extends LiteralData {
    public long l;
    public LongLiteral(Token t, String file) {
      super(t,file);
      l = Long.decode(t.image);
    }
    public LongLiteral(long l, CodeZone cz) {
      super(cz);
      this.l = l;
    }
    @Override
    public Long getValue() {
      return new Long(l);
    }
    @Override
    public String[] getOperands() {
      String[] aux = {"Long: " + l};
      return aux;
    }
    @Override
    public BaseType getType() {
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.LONG);
    }
    @Override
    public LongLiteral getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }
    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    @Override
    public LiteralData getCompileTimeConstant() {
      return this;
    }
    @Override
    public String getStringValue() {
      return (new StringBuilder()).append(l).toString();
    }

    @Override
    public void set(ComputedValue other) {
      if(other instanceof LongLiteral) {
        l = ((LongLiteral) other).l;
      } else if(other instanceof IntegerLiteral) {
        l = ((IntegerLiteral) other).i;
      } else if(other instanceof CharacterLiteral) {
        l = ((CharacterLiteral) other).c;
      }
    }
    
    public LiteralData booleanOp(IntegerLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = l == other.i;
        break;
      case NEQ:
        result = l != other.i;
        break;
      case GE:
        result = l >= other.i;
        break;
      case LE:
        result = l <= other.i;
        break;
      case LT:
        result = l < other.i;
        break;
      case GT:
        result = l > other.i;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(CharacterLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = l == other.c;
        break;
      case NEQ:
        result = l != other.c;
        break;
      case GE:
        result = l >= other.c;
        break;
      case LE:
        result = l <= other.c;
        break;
      case LT:
        result = l < other.c;
        break;
      case GT:
        result = l > other.c;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(DoubleLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = l == other.d;
        break;
      case NEQ:
        result = l != other.d;
        break;
      case GE:
        result = l >= other.d;
        break;
      case LE:
        result = l <= other.d;
        break;
      case LT:
        result = l < other.d;
        break;
      case GT:
        result = l > other.d;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(LongLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = l == other.l;
        break;
      case NEQ:
        result = l != other.l;
        break;
      case GE:
        result = l >= other.l;
        break;
      case LE:
        result = l <= other.l;
        break;
      case LT:
        result = l < other.l;
        break;
      case GT:
        result = l > other.l;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(FloatLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = l == other.f;
        break;
      case NEQ:
        result = l != other.f;
        break;
      case GE:
        result = l >= other.f;
        break;
      case LE:
        result = l <= other.f;
        break;
      case LT:
        result = l < other.f;
        break;
      case GT:
        result = l > other.f;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData mathematicOp(IntegerLiteral other, MathematicOperation.Operator operator) {
      long result;
      
      switch(operator) {
      case ADD:
        result = l + other.i;
        break;
      case SUB:
        result = l - other.i;
        break;
      case MUL:
        result = l * other.i;
        break;
      case DIV:
        result = l / other.i;
        break;
      case MOD:
        result = l % other.i;
        break;
      case BIT_AND:
        result = l & other.i;
        break;
      case BIT_OR:
        result = l | other.i;
        break;
      case BIT_XOR:
        result = l ^ other.i;
        break;
      case LEFT_SHIFT:
        result = l << other.i;
        break;
      case RIGHT_SHIFT:
        result = l >> other.i;
        break;
      case RIGHT_UNSIGNED_SHIFT:
        result = l >>> other.i;
        break;
      default:
        return null;
      }
      return new LongLiteral(result, this);
    }
    
    public LiteralData mathematicOp(CharacterLiteral other, MathematicOperation.Operator operator) {
      long result;
      
      switch(operator) {
      case ADD:
        result = l + other.c;
        break;
      case SUB:
        result = l - other.c;
        break;
      case MUL:
        result = l * other.c;
        break;
      case DIV:
        result = l / other.c;
        break;
      case MOD:
        result = l % other.c;
        break;
      case BIT_AND:
        result = l & other.c;
        break;
      case BIT_OR:
        result = l | other.c;
        break;
      case BIT_XOR:
        result = l ^ other.c;
        break;
      case LEFT_SHIFT:
        result = l << other.c;
        break;
      case RIGHT_SHIFT:
        result = l >> other.c;
        break;
      case RIGHT_UNSIGNED_SHIFT:
        result = l >>> other.c;
        break;
      default:
        return null;
      }
      return new LongLiteral(result, this);
    }
    
    public LiteralData mathematicOp(DoubleLiteral other, MathematicOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case ADD:
        result = l + other.d;
        break;
      case SUB:
        result = l - other.d;
        break;
      case MUL:
        result = l * other.d;
        break;
      case DIV:
        result = l / other.d;
        break;
      case MOD:
        result = l % other.d;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public LiteralData mathematicOp(FloatLiteral other, MathematicOperation.Operator operator) {
      float result;
      
      switch(operator) {
      case ADD:
        result = l + other.f;
        break;
      case SUB:
        result = l - other.f;
        break;
      case MUL:
        result = l * other.f;
        break;
      case DIV:
        result = l / other.f;
        break;
      case MOD:
        result = l % other.f;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new FloatLiteral(result, this);
    }
    
    public LiteralData mathematicOp(LongLiteral other, MathematicOperation.Operator operator) {
      long result;
      
      switch(operator) {
      case ADD:
        result = l + other.l;
        break;
      case SUB:
        result = l - other.l;
        break;
      case MUL:
        result = l * other.l;
        break;
      case DIV:
        result = l / other.l;
        break;
      case MOD:
        result = l % other.l;
        break;
      case BIT_AND:
        result = l & other.l;
        break;
      case BIT_OR:
        result = l | other.l;
        break;
      case BIT_XOR:
        result = l ^ other.l;
        break;
      case LEFT_SHIFT:
        result = l << other.l;
        break;
      case RIGHT_SHIFT:
        result = l >> other.l;
        break;
      case RIGHT_UNSIGNED_SHIFT:
        result = l >>> other.l;
        break;
      default:
        return null;
      }
      return new LongLiteral(result, this);
    }
    
    public LiteralData unaryOp(UnaryOperation.Operator operator) {
      long result;
      
      switch(operator) {
      case BIT_COMP:
        result = ~l;
        break;
      case NEGATE:
        result = -l;
        break;
      case POST_DEC:
      case PRE_DEC:
        result = l-1;
        break;
      case POST_INC:
      case PRE_INC:
        result = l+1;
        break;
      default:
        return null;
      }
      return new LongLiteral(result, this);
    }
    
    public boolean getAsBool() {
      throw new IllegalStateException();
    }
    public char getAsChar() {
      throw new IllegalStateException();
    }
    public byte getAsByte() {
      throw new IllegalStateException();
    }
    public short getAsShort() {
      throw new IllegalStateException();
    }
    public int getAsInt() {
      throw new IllegalStateException();
    }
    public long getAsLong() {
      return l;
    }
    public float getAsFloat() {
      return l;
    }
    public double getAsDouble() {
      return l;
    }
    public Object getAsObject() {
      return new Long(l);
    }
  }
  
  public static final class FloatLiteral extends LiteralData {
    public float f;
    public FloatLiteral(Token t, String file) {
      super(t, file);
      f = Float.parseFloat(t.image);
    }
    public FloatLiteral(float f, CodeZone cz) {
      super(cz);
      this.f = f;
    }
    @Override
    public Float getValue() {
      return new Float(f);
    }
    @Override
    public String[] getOperands() {
      String[] aux = {"Float: " + f};
      return aux;
    }
    @Override
    public BaseType getType() {
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.FLOAT);
    }
    @Override
    public FloatLiteral getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }
    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    @Override
    public LiteralData getCompileTimeConstant() {
      return this;
    }
    @Override
    public String getStringValue() {
      return (new StringBuilder()).append(f).toString();
    }

    @Override
    public void set(ComputedValue other) {
      if(other instanceof FloatLiteral) {
        f = ((FloatLiteral) other).f;
      } else if(other instanceof LongLiteral) {
        f = ((LongLiteral) other).l;
      } else if(other instanceof IntegerLiteral) {
        f = ((IntegerLiteral) other).i;
      } else if(other instanceof CharacterLiteral) {
        f = ((CharacterLiteral) other).c;
      }
    }
    
    public LiteralData booleanOp(IntegerLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = f == other.i;
        break;
      case NEQ:
        result = f != other.i;
        break;
      case GE:
        result = f >= other.i;
        break;
      case LE:
        result = f <= other.i;
        break;
      case LT:
        result = f < other.i;
        break;
      case GT:
        result = f > other.i;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(CharacterLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = f == other.c;
        break;
      case NEQ:
        result = f != other.c;
        break;
      case GE:
        result = f >= other.c;
        break;
      case LE:
        result = f <= other.c;
        break;
      case LT:
        result = f < other.c;
        break;
      case GT:
        result = f > other.c;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(DoubleLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = f == other.d;
        break;
      case NEQ:
        result = f != other.d;
        break;
      case GE:
        result = f >= other.d;
        break;
      case LE:
        result = f <= other.d;
        break;
      case LT:
        result = f < other.d;
        break;
      case GT:
        result = f > other.d;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(FloatLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = f == other.f;
        break;
      case NEQ:
        result = f != other.f;
        break;
      case GE:
        result = f >= other.f;
        break;
      case LE:
        result = f <= other.f;
        break;
      case LT:
        result = f < other.f;
        break;
      case GT:
        result = f > other.f;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(LongLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = f == other.l;
        break;
      case NEQ:
        result = f != other.l;
        break;
      case GE:
        result = f >= other.l;
        break;
      case LE:
        result = f <= other.l;
        break;
      case LT:
        result = f < other.l;
        break;
      case GT:
        result = f > other.l;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData mathematicOp(IntegerLiteral other, MathematicOperation.Operator operator) {
      float result;
      
      switch(operator) {
      case ADD:
        result = f + other.i;
        break;
      case SUB:
        result = f - other.i;
        break;
      case MUL:
        result = f * other.i;
        break;
      case DIV:
        result = f / other.i;
        break;
      case MOD:
        result = f % other.i;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new FloatLiteral(result, this);
    }
    
    public LiteralData mathematicOp(CharacterLiteral other, MathematicOperation.Operator operator) {
      float result;
      
      switch(operator) {
      case ADD:
        result = f + other.c;
        break;
      case SUB:
        result = f - other.c;
        break;
      case MUL:
        result = f * other.c;
        break;
      case DIV:
        result = f / other.c;
        break;
      case MOD:
        result = f % other.c;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new FloatLiteral(result, this);
    }
    
    public LiteralData mathematicOp(DoubleLiteral other, MathematicOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case ADD:
        result = f + other.d;
        break;
      case SUB:
        result = f - other.d;
        break;
      case MUL:
        result = f * other.d;
        break;
      case DIV:
        result = f / other.d;
        break;
      case MOD:
        result = f % other.d;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public LiteralData mathematicOp(FloatLiteral other, MathematicOperation.Operator operator) {
      float result;
      
      switch(operator) {
      case ADD:
        result = f + other.f;
        break;
      case SUB:
        result = f - other.f;
        break;
      case MUL:
        result = f * other.f;
        break;
      case DIV:
        result = f / other.f;
        break;
      case MOD:
        result = f % other.f;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new FloatLiteral(result, this);
    }
    
    public LiteralData mathematicOp(LongLiteral other, MathematicOperation.Operator operator) {
      float result;
      
      switch(operator) {
      case ADD:
        result = f + other.l;
        break;
      case SUB:
        result = f - other.l;
        break;
      case MUL:
        result = f * other.l;
        break;
      case DIV:
        result = f / other.l;
        break;
      case MOD:
        result = f % other.l;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new FloatLiteral(result, this);
    }
    
    public LiteralData unaryOp(UnaryOperation.Operator operator) {
      float result;
      
      switch(operator) {
      case NEGATE:
        result = -f;
        break;
      case POST_DEC:
      case PRE_DEC:
        result = f-1;
        break;
      case POST_INC:
      case PRE_INC:
        result = f+1;
        break;
      default:
        return null;
      }
      return new FloatLiteral(result, this);
    }
    
    public boolean getAsBool() {
      throw new IllegalStateException();
    }
    public char getAsChar() {
      throw new IllegalStateException();
    }
    public byte getAsByte() {
      throw new IllegalStateException();
    }
    public short getAsShort() {
      throw new IllegalStateException();
    }
    public int getAsInt() {
      throw new IllegalStateException();
    }
    public long getAsLong() {
      throw new IllegalStateException();
    }
    public float getAsFloat() {
      return f;
    }
    public double getAsDouble() {
      return f;
    }
    public Object getAsObject() {
      return new Float(f);
    }
  }
  
  public static final class DoubleLiteral extends LiteralData {
    public double d;
    public DoubleLiteral(Token t, String file) {
      super(t, file);
      d = Double.parseDouble(t.image);
    }
    public DoubleLiteral(double d, CodeZone cz) {
      super(cz);
      this.d = d;
    }
    @Override
    public Double getValue() {
      return new Double(d);
    }
    @Override
    public String[] getOperands() {
      String[] aux = {"Double: " + d};
      return aux;
    }
    @Override
    public BaseType getType() {
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.DOUBLE);
    }
    @Override
    public DoubleLiteral getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }
    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    @Override
    public LiteralData getCompileTimeConstant() {
      return this;
    }
    
    @Override
    public String getStringValue() {
      return (new StringBuilder()).append(d).toString();
    }

    @Override
    public void set(ComputedValue other) {
      if(other instanceof DoubleLiteral) {
        d = ((DoubleLiteral) other).d;
      } else if(other instanceof FloatLiteral) {
        d = ((FloatLiteral) other).f;
      } else if(other instanceof LongLiteral) {
        d = ((LongLiteral) other).l;
      } else if(other instanceof IntegerLiteral) {
        d = ((IntegerLiteral) other).i;
      } else if(other instanceof CharacterLiteral) {
        d = ((CharacterLiteral) other).c;
      }
    }

    public LiteralData booleanOp(IntegerLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = d == other.i;
        break;
      case NEQ:
        result = d != other.i;
        break;
      case GE:
        result = d >= other.i;
        break;
      case LE:
        result = d <= other.i;
        break;
      case LT:
        result = d < other.i;
        break;
      case GT:
        result = d > other.i;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(CharacterLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = d == other.c;
        break;
      case NEQ:
        result = d != other.c;
        break;
      case GE:
        result = d >= other.c;
        break;
      case LE:
        result = d <= other.c;
        break;
      case LT:
        result = d < other.c;
        break;
      case GT:
        result = d > other.c;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(DoubleLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = d == other.d;
        break;
      case NEQ:
        result = d != other.d;
        break;
      case GE:
        result = d >= other.d;
        break;
      case LE:
        result = d <= other.d;
        break;
      case LT:
        result = d < other.d;
        break;
      case GT:
        result = d > other.d;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(FloatLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = d == other.f;
        break;
      case NEQ:
        result = d != other.f;
        break;
      case GE:
        result = d >= other.f;
        break;
      case LE:
        result = d <= other.f;
        break;
      case LT:
        result = d < other.f;
        break;
      case GT:
        result = d > other.f;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(LongLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = d == other.l;
        break;
      case NEQ:
        result = d != other.l;
        break;
      case GE:
        result = d >= other.l;
        break;
      case LE:
        result = d <= other.l;
        break;
      case LT:
        result = d < other.l;
        break;
      case GT:
        result = d > other.l;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData mathematicOp(IntegerLiteral other, MathematicOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case ADD:
        result = d + other.i;
        break;
      case SUB:
        result = d - other.i;
        break;
      case MUL:
        result = d * other.i;
        break;
      case DIV:
        result = d / other.i;
        break;
      case MOD:
        result = d % other.i;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public LiteralData mathematicOp(CharacterLiteral other, MathematicOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case ADD:
        result = d + other.c;
        break;
      case SUB:
        result = d - other.c;
        break;
      case MUL:
        result = d * other.c;
        break;
      case DIV:
        result = d / other.c;
        break;
      case MOD:
        result = d % other.c;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public LiteralData mathematicOp(DoubleLiteral other, MathematicOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case ADD:
        result = d + other.d;
        break;
      case SUB:
        result = d - other.d;
        break;
      case MUL:
        result = d * other.d;
        break;
      case DIV:
        result = d / other.d;
        break;
      case MOD:
        result = d % other.d;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public LiteralData mathematicOp(FloatLiteral other, MathematicOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case ADD:
        result = d + other.f;
        break;
      case SUB:
        result = d - other.f;
        break;
      case MUL:
        result = d * other.f;
        break;
      case DIV:
        result = d / other.f;
        break;
      case MOD:
        result = d % other.f;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public LiteralData mathematicOp(LongLiteral other, MathematicOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case ADD:
        result = d + other.l;
        break;
      case SUB:
        result = d - other.l;
        break;
      case MUL:
        result = d * other.l;
        break;
      case DIV:
        result = d / other.l;
        break;
      case MOD:
        result = d % other.l;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public LiteralData unaryOp(UnaryOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case NEGATE:
        result = -d;
        break;
      case POST_DEC:
      case PRE_DEC:
        result = d-1;
        break;
      case POST_INC:
      case PRE_INC:
        result = d+1;
        break;
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public boolean getAsBool() {
      throw new IllegalStateException();
    }
    public char getAsChar() {
      throw new IllegalStateException();
    }
    public byte getAsByte() {
      throw new IllegalStateException();
    }
    public short getAsShort() {
      throw new IllegalStateException();
    }
    public int getAsInt() {
      throw new IllegalStateException();
    }
    public long getAsLong() {
      throw new IllegalStateException();
    }
    public float getAsFloat() {
      throw new IllegalStateException();
    }
    public double getAsDouble() {
      return d;
    }
    public Object getAsObject() {
      return new Double(d);
    }
  }
  
  public static final class CharacterLiteral extends LiteralData {
    public char c;
    public CharacterLiteral(Token t, String file) {
      super(t, file);
      c = Utils.convertImageToChar(t.image);
    }
    public CharacterLiteral(char c, CodeZone cz) {
      super(cz);
      this.c = c;
    }

    @Override
    public Character getValue() {
      return new Character(c);
    }
    @Override
    //["n","t","b","r","f",||||||"\\","'","\""]
    public String[] getOperands() {
      if(c == '\n') {
        String[] aux = {"Character: '\\n'"};
        return aux;
      } else if(c == '\t') {
        String[] aux = {"Character: '\\t'"};
        return aux;
      } else if(c == '\b') {
        String[] aux = {"Character: '\\b'"};
        return aux;
      } else if(c == '\r') {
        String[] aux = {"Character: '\\r'"};
        return aux;
      } else if(c == '\f') {
        String[] aux = {"Character: '\\f'"};
        return aux;
      }
      String[] aux = {"Character: '" + c + "'"};
      return aux;
    }
    @Override
    public BaseType getType() {
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.CHAR);
    }
    @Override
    public CharacterLiteral getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }
    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    @Override
    public LiteralData getCompileTimeConstant() {
      return this;
    }
    
    @Override
    public String getStringValue() {
      return "'" + c + "'";
    }

    @Override
    public void set(ComputedValue other) {
      if(other instanceof CharacterLiteral) {
        c = ((CharacterLiteral) other).c;
      }
    }
    
    public LiteralData booleanOp(IntegerLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = c == other.i;
        break;
      case NEQ:
        result = c != other.i;
        break;
      case GE:
        result = c >= other.i;
        break;
      case LE:
        result = c <= other.i;
        break;
      case LT:
        result = c < other.i;
        break;
      case GT:
        result = c > other.i;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(CharacterLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = c == other.c;
        break;
      case NEQ:
        result = c != other.c;
        break;
      case GE:
        result = c >= other.c;
        break;
      case LE:
        result = c <= other.c;
        break;
      case LT:
        result = c < other.c;
        break;
      case GT:
        result = c > other.c;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(DoubleLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = c == other.d;
        break;
      case NEQ:
        result = c != other.d;
        break;
      case GE:
        result = c >= other.d;
        break;
      case LE:
        result = c <= other.d;
        break;
      case LT:
        result = c < other.d;
        break;
      case GT:
        result = c > other.d;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(FloatLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = c == other.f;
        break;
      case NEQ:
        result = c != other.f;
        break;
      case GE:
        result = c >= other.f;
        break;
      case LE:
        result = c <= other.f;
        break;
      case LT:
        result = c < other.f;
        break;
      case GT:
        result = c > other.f;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData booleanOp(LongLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = c == other.l;
        break;
      case NEQ:
        result = c != other.l;
        break;
      case GE:
        result = c >= other.l;
        break;
      case LE:
        result = c <= other.l;
        break;
      case LT:
        result = c < other.l;
        break;
      case GT:
        result = c > other.l;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true, this);
      } else {
        return new BooleanLiteral(false, this);
      }
    }
    
    public LiteralData mathematicOp(IntegerLiteral other, MathematicOperation.Operator operator) {
      int result;
      
      switch(operator) {
      case ADD:
        result = c + other.i;
        break;
      case SUB:
        result = c - other.i;
        break;
      case MUL:
        result = c * other.i;
        break;
      case DIV:
        result = c / other.i;
        break;
      case MOD:
        result = c % other.i;
        break;
      case BIT_AND:
        result = c & other.i;
        break;
      case BIT_OR:
        result = c | other.i;
        break;
      case BIT_XOR:
        result = c ^ other.i;
        break;
      case LEFT_SHIFT:
        result = c << other.i;
        break;
      case RIGHT_SHIFT:
        result = c >> other.i;
        break;
      case RIGHT_UNSIGNED_SHIFT:
        result = c >>> other.i;
        break;
      default:
        return null;
      }
      return new IntegerLiteral(result, this);
    }
    
    public LiteralData mathematicOp(CharacterLiteral other, MathematicOperation.Operator operator) {
      int result;
      
      switch(operator) {
      case ADD:
        result = c + other.c;
        break;
      case SUB:
        result = c - other.c;
        break;
      case MUL:
        result = c * other.c;
        break;
      case DIV:
        result = c / other.c;
        break;
      case MOD:
        result = c % other.c;
        break;
      case BIT_AND:
        result = c & other.c;
        break;
      case BIT_OR:
        result = c | other.c;
        break;
      case BIT_XOR:
        result = c ^ other.c;
        break;
      case LEFT_SHIFT:
        result = c << other.c;
        break;
      case RIGHT_SHIFT:
        result = c >> other.c;
        break;
      case RIGHT_UNSIGNED_SHIFT:
        result = c >>> other.c;
        break;
      default:
        return null;
      }
      return new IntegerLiteral(result, this);
    }
    
    public LiteralData mathematicOp(DoubleLiteral other, MathematicOperation.Operator operator) {
      double result;
      
      switch(operator) {
      case ADD:
        result = c + other.d;
        break;
      case SUB:
        result = c - other.d;
        break;
      case MUL:
        result = c * other.d;
        break;
      case DIV:
        result = c / other.d;
        break;
      case MOD:
        result = c % other.d;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new DoubleLiteral(result, this);
    }
    
    public LiteralData mathematicOp(FloatLiteral other, MathematicOperation.Operator operator) {
      float result;
      
      switch(operator) {
      case ADD:
        result = c + other.f;
        break;
      case SUB:
        result = c - other.f;
        break;
      case MUL:
        result = c * other.f;
        break;
      case DIV:
        result = c / other.f;
        break;
      case MOD:
        result = c % other.f;
        break;
      case BIT_AND:
      case BIT_OR:
      case BIT_XOR:
      case LEFT_SHIFT:
      case RIGHT_SHIFT:
      case RIGHT_UNSIGNED_SHIFT:
      default:
        return null;
      }
      return new FloatLiteral(result, this);
    }
    
    public LiteralData mathematicOp(LongLiteral other, MathematicOperation.Operator operator) {
      long result;
      
      switch(operator) {
      case ADD:
        result = c + other.l;
        break;
      case SUB:
        result = c - other.l;
        break;
      case MUL:
        result = c * other.l;
        break;
      case DIV:
        result = c / other.l;
        break;
      case MOD:
        result = c % other.l;
        break;
      case BIT_AND:
        result = c & other.l;
        break;
      case BIT_OR:
        result = c | other.l;
        break;
      case BIT_XOR:
        result = c ^ other.l;
        break;
      case LEFT_SHIFT:
        result = c << other.l;
        break;
      case RIGHT_SHIFT:
        result = c >> other.l;
        break;
      case RIGHT_UNSIGNED_SHIFT:
        result = c >>> other.l;
        break;
      default:
        return null;
      }
      return new LongLiteral(result, this);
    }
    
    public LiteralData unaryOp(UnaryOperation.Operator operator) {
      int result;
      
      switch(operator) {
      case BIT_COMP:
        result = ~c;
        break;
      case NEGATE:
        result = -c;
        break;
      case POST_DEC:
      case PRE_DEC:
        result = c-1;
        break;
      case POST_INC:
      case PRE_INC:
        result = c+1;
        break;
      default:
        return null;
      }
      return new IntegerLiteral(result, this);
    }
    
    public boolean getAsBool() {
      throw new IllegalStateException();
    }
    public char getAsChar() {
      return c;
    }
    public byte getAsByte() {
      throw new IllegalStateException();
    }
    public short getAsShort() {
      throw new IllegalStateException();
    }
    public int getAsInt() {
      return c;
    }
    public long getAsLong() {
      return c;
    }
    public float getAsFloat() {
      return c;
    }
    public double getAsDouble() {
      return c;
    }
    public Object getAsObject() {
      return new Character(c);
    }
  }
  
  //["n","t","b","r","f","\\","'","\""]
  public static final class StringLiteral extends LiteralData {
    public String s;
    public StringLiteral(Token t, String file) {
      super(t, file);
      s = Utils.convertImageToString(t.image);
    }
    public StringLiteral(String s, CodeZone cz) {
      super(cz);
      this.s = s;
    }
    @Override
    public String getValue() {
      return s;
    }
    @Override
    public String[] getOperands() {
      String[] aux = {"String: \"" 
                      +  s.replace("\\", "\\\\")
                          .replace("\n", "\\n").replace("\t", "\t")
                          .replace("\b", "\\b").replace("\r", "\r")
                          .replace("\f", "\\f").replace("\"", "\\\"") 
                      + "\""};
      return aux;
    }
    @Override
    public BaseType getType() {
      return ClassOrInterfaceTypeRef.getFromClass(String.class);
    }
    @Override
    public StringLiteral getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }
    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    @Override
    public LiteralData getCompileTimeConstant() {
      return this;
    }
    @Override
    public LiteralData unaryOp(Operator operator) {
      return null;
    }
    @Override
    public String getStringValue() {
      return "\"" + s + "\"";
    }
    
    @Override
    public void set(ComputedValue other) {
      if(other instanceof StringLiteral) {
        s = ((StringLiteral)other).s;
      }
    }
    
    public boolean getAsBool() {
      throw new IllegalStateException();
    }
    public char getAsChar() {
      throw new IllegalStateException();
    }
    public byte getAsByte() {
      throw new IllegalStateException();
    }
    public short getAsShort() {
      throw new IllegalStateException();
    }
    public int getAsInt() {
      throw new IllegalStateException();
    }
    public long getAsLong() {
      throw new IllegalStateException();
    }
    public float getAsFloat() {
      throw new IllegalStateException();
    }
    public double getAsDouble() {
      throw new IllegalStateException();
    }
    public Object getAsObject() {
      return s;
    }
  }
  
  public static class BooleanLiteral extends LiteralData {
    public boolean z;
    
    public BooleanLiteral(boolean b, Token t, String file) {
      super(t, file);
      z = b;
    }
    public BooleanLiteral(boolean b, CodeZone cz) {
      super(cz);
      z = b;
    }
    
    public LiteralData booleanOp(BooleanLiteral other, BooleanOperation.Operator operator) {
      boolean result;
      
      switch(operator) {
      case EQ:
        result = z == other.z;
        break;
      case NEQ:
        result = z != other.z;
        break;
      default:
        return null;
      }
      if(result) {
        return new BooleanLiteral(true,this);
      } else {
        return new BooleanLiteral(false,this);
      }
    }
    
    @Override
    public LiteralData unaryOp(Operator operator) {
      if(operator == Operator.NOT) {
        return new BooleanLiteral(!z,this);
      }
      return null;
    }
    @Override
    public LiteralData getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }
    @Override
    public Object getValue() {
      if(z)
        return Boolean.TRUE;
      else
        return Boolean.FALSE;
    }
    @Override
    public String getStringValue() {
      if(z)
        return "true";
      else
        return "false";
    }
    @Override
    public BaseType getType() {
      return PrimitiveTypeRef.getFromName("boolean");
    }
    @Override
    public void set(ComputedValue other) {
      if(other instanceof BooleanLiteral) {
        z = ((BooleanLiteral) other).z;
      }
    }
    @Override
    public LiteralData getCompileTimeConstant() {
      return this;
    }
    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    
    public boolean getAsBool() {
      return z;
    }
    public char getAsChar() {
      throw new IllegalStateException();
    }
    public byte getAsByte() {
      throw new IllegalStateException();
    }
    public short getAsShort() {
      throw new IllegalStateException();
    }
    public int getAsInt() {
      throw new IllegalStateException();
    }
    public long getAsLong() {
      throw new IllegalStateException();
    }
    public float getAsFloat() {
      throw new IllegalStateException();
    }
    public double getAsDouble() {
      throw new IllegalStateException();
    }
    public Object getAsObject() {
      if(z) {
        return Boolean.TRUE;
      } else {
        return Boolean.FALSE;
      }
    }
  }
  
  public static final class NullLiteral extends LiteralData {    
    public NullLiteral(Token t, String file) {
      super(t, file);
    }  
    public NullLiteral(CodeZone cz) {
      super(cz);
    }
    @Override
    public Object getValue() {
      return null;
    }
    @Override
    public String[] getOperands() {
      String[] aux = {"Null"};
      return aux;
    }
    @Override
    public BaseType getType() {
      return NullType.instance;
    }
    @Override
    public NullLiteral getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }
    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    @Override
    public LiteralData getCompileTimeConstant() {
      return this;
    }
    @Override
    public LiteralData unaryOp(Operator operator) {
      return null;
    }
    @Override
    public String getStringValue() {
      return "null";
    }
    @Override
    public void set(ComputedValue other) {
      // -------------------
    }
    
    public boolean getAsBool() {
      throw new IllegalStateException();
    }
    public char getAsChar() {
      throw new IllegalStateException();
    }
    public byte getAsByte() {
      throw new IllegalStateException();
    }
    public short getAsShort() {
      throw new IllegalStateException();
    }
    public int getAsInt() {
      throw new IllegalStateException();
    }
    public long getAsLong() {
      throw new IllegalStateException();
    }
    public float getAsFloat() {
      throw new IllegalStateException();
    }
    public double getAsDouble() {
      throw new IllegalStateException();
    }
    public Object getAsObject() {
      return null;
    }
  }
  
  public static final class ClassLiteral extends LiteralData { 
    public BaseType type;
    
    public ClassLiteral(BaseType type, CodeZone cz) {
      super(cz);
      this.type = type;
    }
    @Override
    public Object getValue() {
      if(type instanceof JavaType)
        return ((JavaType)type).classObject;
      else
        return null;
    }
    @Override
    public String[] getOperands() {
      String[] aux = {type.getBinaryName()};
      return aux;
    }
    @Override
    public BaseType getType() {
      return Utils.createType(Class.class);
    }
    @Override
    public ClassLiteral getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }
    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }
    @Override
    public LiteralData getCompileTimeConstant() {
      return this;
    }
    @Override
    public LiteralData unaryOp(Operator operator) {
      return null;
    }
    @Override
    public String getStringValue() {
      return type.getBinaryName();
    }
    @Override
    public void set(ComputedValue other) {
      if(other instanceof ClassLiteral) {
        type = ((ClassLiteral)other).type;
      }
    }
    
    public boolean getAsBool() {
      throw new IllegalStateException();
    }
    public char getAsChar() {
      throw new IllegalStateException();
    }
    public byte getAsByte() {
      throw new IllegalStateException();
    }
    public short getAsShort() {
      throw new IllegalStateException();
    }
    public int getAsInt() {
      throw new IllegalStateException();
    }
    public long getAsLong() {
      throw new IllegalStateException();
    }
    public float getAsFloat() {
      throw new IllegalStateException();
    }
    public double getAsDouble() {
      throw new IllegalStateException();
    }
    public Object getAsObject() {
      return type;
    }
  }

}
