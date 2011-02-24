package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.NullType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;

public abstract class LiteralData extends DirectDataAccess {

  public LiteralData(Token t) {
    super(new CodeZoneClass(t));
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
  
  public static class IntegerLiteral extends LiteralData {
    public final int i;
    public IntegerLiteral(Token t) {
      super(t);
      i = Integer.decode(t.image);
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
  }
  
  public static class LongLiteral extends LiteralData {
    public final long l;
    public LongLiteral(Token t) {
      super(t);
      l = Long.decode(t.image);
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
  }
  
  public static class FloatLiteral extends LiteralData {
    public final float f;
    public FloatLiteral(Token t) {
      super(t);
      f = Float.parseFloat(t.image);
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
  }
  
  public static class DoubleLiteral extends LiteralData {
    public final double d;
    public DoubleLiteral(Token t) {
      super(t);
      d = Double.parseDouble(t.image);
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
  }
  
  public static class CharacterLiteral extends LiteralData {
    public final char c;
    public CharacterLiteral(Token t) {
      super(t);
      c = Utils.convertImageToChar(t.image);
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
  }
  
  //["n","t","b","r","f","\\","'","\""]
  public static class StringLiteral extends LiteralData {
    public final String s;
    public StringLiteral(Token t) {
      super(t);
      s = Utils.convertImageToString(t.image);
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
  }
  
  public static class TrueLiteral extends LiteralData {    
    public TrueLiteral(Token t) {
      super(t);
    }
    @Override
    public Boolean getValue() {
      return true;
    }
    @Override
    public String[] getOperands() {
      String[] aux = {"Boolean: true"};
      return aux;
    }
    @Override
    public BaseType getType() {
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.BOOLEAN);
    }
  }
  
  public static class FalseLiteral extends LiteralData {    
    public FalseLiteral(Token t) {
      super(t);
    }
    @Override
    public Boolean getValue() {
      return false;
    }
    @Override
    public String[] getOperands() {
      String[] aux = {"Boolean: false"};
      return aux;
    }
    @Override
    public BaseType getType() {
      return PrimitiveTypeRef.getFromType(PrimitiveTypeRef.Type.BOOLEAN);
    }
  }
  
  public static class NullLiteral extends LiteralData {    
    public NullLiteral(Token t) {
      super(t);
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
  }
  
  public static class ClassLiteral extends LiteralData { 
    public final BaseType type;
    
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
      //TODO
      return Utils.createType(Class.class);
    }
  }

}
