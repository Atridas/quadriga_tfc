package cat.quadriga.parsers.code.types;

import java.util.ArrayList;
import java.util.List;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.JavaReference;


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

  @Override
  public ParametrizedClass getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(isValid()) {
      return this;
    }
    BaseType base = this.base;
    if(base == null) {
      return null;
    }
    List<ParameterClass> parameters = new ArrayList<ParameterClass>(this.parameters.size());
    for(ParameterClass param: parameters) {
      BaseType validParam = param.base.getValid(symbolTable, errorLog);
      if(validParam == null) {
        return null;
      }
      parameters.add(new ParameterClass(validParam, param.bound));
    }
    try {
      return new ParametrizedClass((ClassOrInterfaceTypeRef)base, parameters);
    } catch (ClassCastException e) {
      return null;
    }
  }

  @Override
  public boolean isValid() {
    if(!base.isValid()) {
      return false;
    }
    for(ParameterClass param : parameters) {
      if(!param.base.isValid()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public ComputedValue getDefaultValue() {
    return new JavaReference(null);
  }
  
}
