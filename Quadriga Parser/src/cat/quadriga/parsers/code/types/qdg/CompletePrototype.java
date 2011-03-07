package cat.quadriga.parsers.code.types.qdg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.ParameterClass;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class CompletePrototype extends BaseTypeClass implements QuadrigaPrototype {

  public final List<ParameterClass> parameters;
  public final BlockCode initializations; 
  
  public CompletePrototype(IncompletePrototype original) {
    super(original.getBinaryName());
    initializations = original.initializations;
    parameters = Collections.unmodifiableList(new ArrayList<ParameterClass>(original.parameters));
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
  public String treeStringRepresentation() {
    return Utils.treeStringRepresentation("Prototype", 
        (parameters == null || parameters.size() == 0)? null : Utils.parametersRepresentation(parameters),
        initializations.treeStringRepresentation());
  }

  private boolean validated = false;
  @Override
  public boolean isValid() {
    if(validated) return true;
    for(ParameterClass parameter: parameters) {
      if(!parameter.type.isValid()) {
        return false;
      }
      if(parameter.init != null && !parameter.init.isCorrectlyLinked()) {
        return false;
      }
    }
    return initializations.isCorrectlyLinked();
  }

  private CompletePrototype(CompletePrototype original, Aux aux, SymbolTable symbolTable, ErrorLog errorLog) {
    super(original.getBinaryName());
    aux.aux = this;
    validated = true;
    
    
    
    if(original.initializations.isCorrectlyLinked()) {
      initializations = original.initializations;
    } else {
      initializations = original.initializations.getLinkedVersion(symbolTable, errorLog);
    }
    
    List<ParameterClass> params = new ArrayList<ParameterClass>();
    for(ParameterClass parameter: original.parameters) {
      BaseType nType;
      ExpressionNode nInit = null;
      if(parameter.type.isValid()) {
        nType = parameter.type;
      } else {
        nType = parameter.type.getValid(symbolTable, errorLog);
        if(nType == null) {
          break;
        }
      }
      if(parameter.init != null) {
        if(parameter.init.isCorrectlyLinked()) {
          nInit = parameter.init;
        } else {
          nInit = parameter.init.getLinkedVersion(symbolTable, errorLog);
          if(nInit == null) {
            break;
          }
        }
      }
      params.add(new ParameterClass(
          parameter.cz, 
          nType, 
          parameter.name, 
          parameter.varargs, 
          parameter.modifiers, 
          nInit, 
          parameter.semantic));
    }
    if(initializations == null) {
      validated = false;
    } else if(params.size() != original.parameters.size()) {
      validated = false;
    }
    parameters = Collections.unmodifiableList(params);
  }
  
  private Aux aux = new Aux();
  @Override
  public CompletePrototype getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    if(validated)
      return this;
    if(aux.aux != null)
      return aux.aux;
    CompletePrototype cp = new CompletePrototype(this, aux, symbolTable, errorLog);
    aux.aux = null;
    if(cp.validated) {
      return cp;
    } else {
      return null;
    }
  }
  
  private static class Aux { CompletePrototype aux; };

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return getBinaryName().compareTo(rightOperand.getBinaryName()) == 0;
  }
}
