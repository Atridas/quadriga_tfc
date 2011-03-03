package cat.quadriga.parsers.code.types;

import java.util.List;


public final class ParametrizedClass extends ReferenceTypeRef {
  
  public final BaseType base;
  public final List<ParameterClass> parameters;
  

  public ParametrizedClass(ClassOrInterfaceTypeRef base, List<ParameterClass> parameters) {
    super(base.classObject, 
        "L" + base.classObject.getCanonicalName().replace('.', '/')
        + getParamBinary(parameters) + ";");
    this.base = base;
    this.parameters = parameters;
  }
  
  public ParametrizedClass(BaseType base, List<ParameterClass> parameters) {
    super(Object.class, 
        "L" + "unknown".replace('.', '/')
        + getParamBinary(parameters) + ";");
    this.base = base;
    this.parameters = parameters;
  }
  
  private static String getParamBinary(List<ParameterClass> parameters) {
    String aux = "";
    if(parameters.size() > 0) {
      aux += "<";
      for(ParameterClass param : parameters) {
        switch(param.bound) {
        case EXTENDS:
          aux += "+";
          break;
        case SUPER:
          aux += "-";
          break;
        }
        aux += (param.base == null)? "*" : param.base.getBinaryName();
      }
      aux += ">";
    }
    return aux;
  }
  
  public static class ParameterClass {
    public final BaseType base;
    public final Bound bound;

    public ParameterClass() {
      base = null;
      bound = Bound.NO;
    }
    
    public ParameterClass(BaseType base) {
      this.base = base;
      bound = Bound.NO;
    }
    
    public ParameterClass(BaseType base, Bound bounding) {
      this.base = base;
      bound = bounding;
    }
    
    public static enum Bound {
      NO, SUPER, EXTENDS
    }
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    return UnknownType.empty;
  }

  @Override
  public boolean isMathematicallyOperable() {
    return false;
  }
  
}
