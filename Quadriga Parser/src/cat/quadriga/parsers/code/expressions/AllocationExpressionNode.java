package cat.quadriga.parsers.code.expressions;

import java.lang.reflect.Constructor;
import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.statements.CallToArguments;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;

public class AllocationExpressionNode extends ExpressionNodeClass {
  
  public final ExpressionNode origin;
  public final BaseType type;
  public final CallToArguments arguments;
  public final Constructor<?> constructor;

  public AllocationExpressionNode(BaseType type, CallToArguments arguments, Token n) {
    super(new CodeZoneClass(n, arguments));
    origin = null;
    this.type = type;
    this.arguments = arguments;
    constructor = getConstructor();
  }
  
  public AllocationExpressionNode(ExpressionNode origin, BaseType type, CallToArguments arguments, Token n) {
    super(new CodeZoneClass(n, arguments));
    this.origin = origin;
    this.type = type;
    this.arguments = arguments;
    constructor = getConstructor();
  }
  
  private Constructor<?> getConstructor() {
    List<ExpressionNode> calledArgs = arguments.arguments;
    
    if(!(type instanceof ClassOrInterfaceTypeRef))
      return null;
    
    List<Constructor<?>> constructors = ((ClassOrInterfaceTypeRef)type).getConstuctors();
    
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

}
