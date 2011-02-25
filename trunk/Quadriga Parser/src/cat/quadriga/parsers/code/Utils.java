package cat.quadriga.parsers.code;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.dataaccess.ArrayLengthAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.LocalVarAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.TypeDataAccess;
import cat.quadriga.parsers.code.proxy.ProxyDataAccess;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.symbols.SymbolTable;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.parsers.code.types.ArrayType;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.JavaType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.ReferenceTypeRef;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;

abstract public class Utils {
  public static final String treeStringRepresentation( String operation, String operands[]) {
    String out = operation;
  
    if(operands.length == 0)
      return out;
  
    for(int i = 0; i < operands.length-1; i++)
    {
      out += "\n+- " + operands[i].replace("\n", "\n|  ");
  
    }
  
    return out += "\n+- " + operands[operands.length-1].replace("\n", "\n   ");
  }

  
  public static final char convertImageToChar(String image) {
    image = image.substring(1, image.length() - 1);
    if(image.length() == 1) { //Cas 'x'
      return image.charAt(0);
    } else {
      //Cas '\\x'
      return convertFirstScapeChar(image.substring(1)).charAt(0);
    }
  }
  
  public static final String convertImageToString(String image) {
    image = image.substring(1, image.length() - 1);
    String aux[] = image.replaceAll("\\\\", "\\ ").split("\\\\");
    String result = aux[0];
    for(int i = 1; i < aux.length; i++) {
      result += convertFirstScapeChar(aux[i].substring(1));
    }
    return image;
  }
  
//["n","t","b","r","f","\\","'","\""]
  private static String convertFirstScapeChar(String scape) {
    char aux;
    int len = 1;
    switch(scape.charAt(0)) {
    case 'n': aux = '\n'; break;
    case 't': aux = '\t'; break;
    case 'b': aux = '\b'; break;
    case 'r': aux = '\r'; break;
    case 'f': aux = '\f'; break;
    case '\\': aux = '\\'; break;
    case '\'': aux = '\''; break;
    case '"': aux = '"'; break;
    case 'u': 
      int hex = Integer.decode("0x" + scape.substring(1, 5));
      aux = (char) hex;
      len = 5;
      break;
    case '0':
    default: aux = '\0'; break;
    }
    
    return aux + scape.substring(len);
    
  }
  
  public static ExpressionNode symbolToExpression(BaseSymbol symbol, Token first, Token last)
  {
    if(symbol instanceof LocalVariableSymbol) {
      return new LocalVarAccess((LocalVariableSymbol)symbol, new CodeZoneClass(first,last));
    } else if(symbol instanceof TypeSymbol) {
      return new TypeDataAccess(((TypeSymbol)symbol).type, new CodeZoneClass(first,last));
    }
    
    //TODO error?
    return new ProxyDataAccess("Proxy direct access [" + symbol.name + "]", new CodeZoneClass(first,last));
  }
  
  public static ExpressionNode accessToMember(DataAccess expression, String member, Token t)
  {
    CodeZoneClass cz = new CodeZoneClass( expression.beginLine(), expression.beginColumn(),
                                          t.endLine, t.endColumn);
    if(expression instanceof TypeDataAccess) {
      TypeDataAccess tda = (TypeDataAccess) expression;
      //static accesses
      BaseType type = tda.type;
      if("class".compareTo(member) == 0) {
        //TODO
      } else if(type instanceof ReferenceTypeRef) {
        
        return ((ReferenceTypeRef)type).getAccess(member, cz);
        /*
        return new StaticAccess(member, (ReferenceTypeRef)type, 
                                expression.beginLine(), expression.beginColumn(),
                                t.endLine, t.endColumn);
                                */
      }
    } 
    BaseType type = expression.getType();
    if(type instanceof ArrayType && member.compareTo("length") == 0) {
      return new ArrayLengthAccess(expression, cz);
    }
    
    if(type instanceof ReferenceTypeRef) {
      return ((ReferenceTypeRef)type).getAccess(expression, member, cz);
    }
    return new ProxyDataAccess("Proxy access to member " + member, expression, cz);
  }

  public static ExpressionNode resolveName(SymbolTable symbolTable, List<Token> identifiers) {
    Token first = identifiers.get(0);
    Token actual;
    Iterator<Token> it = identifiers.iterator();
    ExpressionNode result = null;

    actual = it.next();
    String aux = actual.image;
    BaseSymbol symbol = symbolTable.findSymbol(aux);
    if(symbol != null) {
      result = symbolToExpression(symbol,first,actual);
    }
    
    while(result == null && it.hasNext()) {
      actual = it.next();
      aux += '.' + actual.image;
      symbol = symbolTable.findSymbol(aux);
      if(symbol != null) {
        result = symbolToExpression(symbol,first,actual);
      }
    }

    if(result == null) {
      result = new ProxyDataAccess(aux,  new CodeZoneClass(identifiers.get(0),identifiers.get(identifiers.size()-1)));
    } else {
      while(it.hasNext()) {
        actual = it.next();
        aux = actual.image;
        result = accessToMember((DataAccess)result, aux, actual);
      }
    }
    
    return result;
  }
  
  public static BaseType createType(Class<?> clazz) {
    if(clazz.isPrimitive()) {
      return PrimitiveTypeRef.getFromClass(clazz);
    } else if(clazz.isArray()) {
      return new ArrayType(createType(clazz.getComponentType()));
    } else {
      return ClassOrInterfaceTypeRef.getFromClass(clazz);
    }
  }
  
  public static boolean aplicableBySubtyping(BaseType origin, Class<?> destiny) {
    return aplicableBySubtyping(origin, createType(destiny));
  }
  
  public static boolean aplicableBySubtyping(Class<?> origin, BaseType destiny) {
    return aplicableBySubtyping(createType(origin), destiny);
  }
  
  public static boolean aplicableBySubtyping(Class<?> origin, Class<?> destiny) {
    return aplicableBySubtyping(createType(origin), createType(destiny));
  }
  
  public static boolean aplicableBySubtyping(BaseType origin, BaseType destiny) {
    if(origin instanceof UnknownType || destiny instanceof UnknownType) {
      return true;
    }
    
    if(origin instanceof PrimitiveTypeRef) {
      PrimitiveTypeRef oPrim = (PrimitiveTypeRef) origin;
      if(destiny instanceof PrimitiveTypeRef) {
        PrimitiveTypeRef dPrim = (PrimitiveTypeRef) destiny;
        if(oPrim.type == dPrim.type) {
          return true;
        } else {
          //TODO
          return false;
        }
      } else {
        //TODO
        return false;
      }
    } else {
      if(destiny instanceof PrimitiveTypeRef) {
        //TODO
        return false;
      } else {
        Class<?> oClass = ((JavaType) origin).classObject;
        Class<?> dClass = ((JavaType) destiny).classObject;
        
        if(oClass.equals(dClass)) {
          return true;
        }
        Class<?> oSuper = oClass;
        while (oSuper != null && !oSuper.equals(Object.class)) {
          oSuper = oSuper.getSuperclass();
          if(dClass.equals(oSuper)) {
            return true;
          }
        }
        for(Class<?> oInterface : oClass.getInterfaces()) {
          if(oInterface.equals(dClass)) {
            return true;
          }
        }
        return false;
      }
    }
  }
  
  public static int selectMethod(List<ExpressionNode> calledArgs, Class<?>[][] realArgs) {
    List<Integer> validMethods = new LinkedList<Integer>();
    
    //Per nombre d'arguments
    for(int i = 0; i < realArgs.length; i++) {
      if(realArgs[i].length == calledArgs.size()) {
        validMethods.add(i);
      }
    }
    if(validMethods.size() == 0) {
      return -1;
    } else {
      List<Integer> validMethods2 = new LinkedList<Integer>();
      for(Integer validMethod : validMethods) {
        Class<?>[] declaredArgs = realArgs[validMethod];
        boolean selected = true;
        for(int i = 0; i < declaredArgs.length; i++) {
          if(!Utils.aplicableBySubtyping(calledArgs.get(i).getType(),declaredArgs[i])) {
            selected = false;
            continue;
          }
          //TODO més comprovacions
        }
        if(selected) {
          validMethods2.add(validMethod);
        }
      }
      
      if(validMethods2.size() > 0) {
        return validMethods2.get(0);
        // TODO if(validMethods2.size() > 1) {
      } else {
        return -1;
      }
    }
  }
  
  public static final int PUBLIC = 0x0001;
  public static final int PROTECTED = 0x0002;
  public static final int PRIVATE = 0x0004;
  public static final int ABSTRACT = 0x0008;
  public static final int STATIC = 0x0010;
  public static final int FINAL = 0x0020;
  public static final int SYNCHRONIZED = 0x0040;
  public static final int NATIVE = 0x0080;
  public static final int TRANSIENT = 0x0100;
  public static final int VOLATILE = 0x0200;
  public static final int STRICTFP = 0x1000;
}
