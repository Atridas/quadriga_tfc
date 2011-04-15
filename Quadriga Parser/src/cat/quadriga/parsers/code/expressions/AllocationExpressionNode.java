package cat.quadriga.parsers.code.expressions;

import java.lang.reflect.Constructor;
import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.BreakOrContinueException;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.statements.CallToArguments;
import cat.quadriga.parsers.code.statements.CallToListedArguments;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.ParametrizedClass;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.JavaReference;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class AllocationExpressionNode extends ExpressionNodeClass {
  
  public ExpressionNode origin;
  public BaseType type;
  public CallToArguments arguments;
  public Constructor<?> constructor;

  public AllocationExpressionNode(BaseType type, CallToArguments arguments, Token n) {
    this(type, arguments, new CodeZoneClass(n, arguments));
  }
  
  public AllocationExpressionNode(ExpressionNode origin, BaseType type, CallToArguments arguments, Token n) {
    this(origin, type, arguments, new CodeZoneClass(n, arguments));
  }

  public AllocationExpressionNode(BaseType type, CallToArguments arguments, CodeZone cz) {
    super(cz);
    origin = null;
    this.type = type;
    this.arguments = arguments;
    constructor = getConstructor();
  }
  
  public AllocationExpressionNode(ExpressionNode origin, BaseType type, CallToArguments arguments, CodeZone cz) {
    super(cz);
    this.origin = origin;
    this.type = type;
    this.arguments = arguments;
    constructor = getConstructor();
  }
  
  private Constructor<?> getConstructor() {
    if(!(arguments instanceof CallToListedArguments))
      return null;
    List<ExpressionNode> calledArgs = ((CallToListedArguments)arguments).arguments;
    
    List<Constructor<?>> constructors;
    if(type instanceof ParametrizedClass) {
      BaseType base = ((ParametrizedClass)type).base;
      if(base instanceof ClassOrInterfaceTypeRef) {
        constructors = ((ClassOrInterfaceTypeRef)base).getConstuctors();
      } else {
        return null;
      }
    } else if(type instanceof ClassOrInterfaceTypeRef) {
      constructors = ((ClassOrInterfaceTypeRef)type).getConstuctors();
    } else {
      return null;
    }
    
    Class<?>[][] realArgs = new Class<?>[constructors.size()][];
    for(int i = 0; i < constructors.size(); i++) {
      realArgs[i] = constructors.get(i).getParameterTypes();
    }
    
    int finalMethod = Utils.selectMethod(calledArgs, realArgs);
    if(finalMethod < 0) {
      return null;
    } else {
      return constructors.get(finalMethod);
    }
  }

  @Override
  public String[] getOperands() {
    List<String> aux = new LinkedList<String>();
    aux.add(type.getBinaryName());
    aux.add(arguments.treeStringRepresentation());
    if(origin != null) {
      aux.add(origin.treeStringRepresentation());
    }
    return aux.toArray(new String[aux.size()]);
  }

  @Override
  public String getOperation() {
    if(constructor == null) {
      return "Invalid Constructor";
    } else if(origin != null) {
      return "Inner class Constructor";
    } else {
      return "Constructor";
    }
  }

  @Override
  public BaseType getType() {
    return type;
  }
  
  private boolean linked = false;
  @Override
  public AllocationExpressionNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) return this;
    
    linked = true;
    
    //TODO amb més intensitat, sobretot per el tema d'inner classes...
    if(origin != null && !origin.isCorrectlyLinked()) {
      ExpressionNode newOrigin = origin.getLinkedVersion(symbolTable, errorLog);
      if(newOrigin == null) {
        linked = false;
      } else {
        origin = newOrigin;
      }
    }
    
    if(!type.isValid()) {
      BaseType newType = type.getValid(symbolTable, errorLog);
      if(newType == null) {
        linked = false;
      } else {
        type = newType;
      }
    }
    if(!arguments.isCorrectlyLinked()) {
      CallToArguments newArguments = arguments.getLinkedVersion(symbolTable, errorLog);
      if(newArguments == null) {
        linked = false;
      } else {
        arguments = newArguments;
      }
    }
    
    if(constructor == null) {
      if(getConstructor() == null) {
        errorLog.insertError("Invalid constructor", this);
        linked = false;
      }
    }
    
    if(linked) return this;
    else       return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }
  

  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    assert isCorrectlyLinked();
    
    int stackSize = runtime.stack.size();
    try {
      arguments.execute(runtime);
    } catch (BreakOrContinueException e) {
      throw new IllegalStateException(e);
    }
    Object[] initargs = new Object[runtime.stack.size() - stackSize];
    for(int i = 1; i <= initargs.length; ++i) {
      initargs[initargs.length-i] = runtime.stack.pop().getAsObject();
    }
    
    try {
      return new JavaReference( constructor.newInstance(initargs) );
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
  }

}
