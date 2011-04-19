package cat.quadriga.parsers.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.BaseType;

public class QuadrigaFunction extends CodeZoneClass implements TreeRepresentable, Linkable {

  public final List<ParameterClass> parameters;
  public final BlockCode code;
  public final int numLocalVariables;
  public final List<LocalVariableSymbol> localVariables;
  
  public QuadrigaFunction(List<ParameterClass> parameters, BlockCode code, int numLocalVariables, List<LocalVariableSymbol> localVariables, CodeZone cd) {
    super(cd);
    this.parameters = Collections.unmodifiableList(new ArrayList<ParameterClass>(parameters));
    this.code = code;
    this.numLocalVariables = numLocalVariables;
    this.localVariables = Collections.unmodifiableList(new ArrayList<LocalVariableSymbol>(localVariables));
  }

  @Override
  public String treeStringRepresentation() {
    String params = Utils.parametersRepresentation(parameters);
    return Utils.treeStringRepresentation("Quadriga function",params,code.treeStringRepresentation());
  }

  private boolean linked = false;
  @Override
  public boolean isCorrectlyLinked() {
    if(linked) return true;
    for(ParameterClass parameter: parameters) {
      if(!parameter.type.isValid()) {
        return false;
      }
      if(parameter.init != null && !parameter.init.isCorrectlyLinked()) {
        return false;
      }
    }
    return code.isCorrectlyLinked();
  }
  
  private QuadrigaFunction(QuadrigaFunction original, Aux aux, SymbolTable symbolTable, ErrorLog errorLog) {
    super(original);
    aux.aux = this;
    linked = true;
    
    this.numLocalVariables = original.numLocalVariables;
    this.localVariables = original.localVariables;
    symbolTable.newContext();
    
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
      ParameterClass param =
             new ParameterClass(
          parameter.cz, 
          nType, 
          parameter.name, 
          parameter.varargs, 
          parameter.modifiers, 
          nInit, 
          parameter.semantic,
          symbolTable.getNumLocalVariables());
      params.add(param);
      LocalVariableSymbol lvs = new LocalVariableSymbol(parameter.modifiers, nType, parameter.name, param.position, original.code);
      symbolTable.addLocalVariable(lvs);
    }
    //TODO hi ha d'haver "this"?
    //symbolTable.addSymbol(new ThisSymbol(QuadrigaEntity.baseEntity));
    if(original.code.isCorrectlyLinked()) {
      code = original.code;
    } else {
      code = original.code.getLinkedVersion(symbolTable, errorLog);
    }
    if(code == null) {
      linked = false;
    } else if(params.size() != original.parameters.size()) {
      linked = false;
    }
    parameters = Collections.unmodifiableList(params);
    symbolTable.deleteContext();
  }
  
  private Aux aux = new Aux();
  @Override
  public QuadrigaFunction getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog) {
    if(linked)
      return this;
    if(aux.aux != null)
      return aux.aux;
    QuadrigaFunction cp = new QuadrigaFunction(this, aux, symbolTable, errorLog);
    aux.aux = null;
    if(cp.linked) {
      return cp;
    } else {
      return null;
    }
  }
  
  private static class Aux { QuadrigaFunction aux; };

}
