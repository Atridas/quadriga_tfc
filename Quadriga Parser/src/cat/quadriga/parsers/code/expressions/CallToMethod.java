package cat.quadriga.parsers.code.expressions;

import java.lang.reflect.Method;
import java.util.List;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.FieldOrMethodAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.expressions.dataaccess.MethodAccess;
import cat.quadriga.parsers.code.proxy.ProxyDataAccess;
import cat.quadriga.parsers.code.statements.CallToArguments;
import cat.quadriga.parsers.code.statements.CallToListedArguments;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.UnknownType;

public final class CallToMethod extends ExpressionNodeClass {
  
  public final CallToArguments arguments;
  public final DataAccess  function;
  public final Method      methodToCall;

  public CallToMethod(DataAccess function, CallToArguments arguments) {
    super(new CodeZoneClass(function, arguments));
    this.arguments = arguments;
    this.function = function;
    
    if(function instanceof MethodAccess) {
      MethodAccess method = (MethodAccess) function;

      if(arguments instanceof CallToListedArguments) {
        List<ExpressionNode> calledArgs = ((CallToListedArguments)arguments).arguments;
        
        Class<?>[][] realArgs = new Class<?>[method.getNumMethods()][];
        for(int i = 0; i < method.getNumMethods(); i++) {
          realArgs[i] = method.getMethods(i).getParameterTypes();
        }
        
        int finalMethod = Utils.selectMethod(calledArgs, realArgs);
        if(finalMethod < 0) {
          methodToCall = null;
        } else {
          methodToCall = method.getMethods(finalMethod);
        }
      } else {
        methodToCall = null;
      }
      
    } else if(function instanceof FieldOrMethodAccess) {
      CallToMethod aux = new CallToMethod(
                            ((FieldOrMethodAccess)function).getAsMethod(),
                            arguments);
      methodToCall = aux.methodToCall;
    } else {
      methodToCall = null;
    }
  }

  @Override
  public String[] getOperands() {
    String[] aux = {function.treeStringRepresentation(),
                    arguments.treeStringRepresentation()};
    
    return aux;
  }

  @Override
  public String getOperation() {
    if(methodToCall == null) {
      if(function instanceof ProxyDataAccess) {
        return "Proxy Call";
      } else {
        return "Invalid Call";
      }
    } else {
      return "Call";
    }
  }

  @Override
  public BaseType getType() {
    if(methodToCall == null) {
      return UnknownType.empty;
    } else {
      return Utils.createType(methodToCall.getReturnType());
    }
  }

  private boolean linked = false;
  private CallToMethod linkedVersion = null;
  @Override
  public CallToMethod getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      if(methodToCall == null) {
        errorLog.insertError("Invalid function",this);
        return null;
      }
      CallToArguments args;
      if(arguments.isCorrectlyLinked()) {
        args = arguments;
      } else {
        args = arguments.getLinkedVersion(symbolTable, errorLog);
        if(args == null) {
          return null;
        }
      }
      DataAccess fun;
      if(arguments.isCorrectlyLinked()) {
        fun = function;
      } else {
        fun = function.getLinkedVersion(symbolTable, errorLog);
        if(fun == null) {
          return null;
        }
      }
      linkedVersion = new CallToMethod(fun, args);
      linkedVersion.linked = true;
      linkedVersion.linkedVersion = linkedVersion;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }

}
