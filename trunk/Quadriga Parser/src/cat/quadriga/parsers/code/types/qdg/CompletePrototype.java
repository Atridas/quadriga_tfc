package cat.quadriga.parsers.code.types.qdg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.BreakOrContinueException;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.ParameterClass;
import cat.quadriga.parsers.code.QuadrigaFunction;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.statements.CallToNamedArguments;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.symbols.ThisSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.runtime.ComponentInstance;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.RuntimePrototype;

public class CompletePrototype extends BaseTypeClass implements RuntimePrototype {

  //public final List<ParameterClass> parameters;
  //public final BlockCode initializations;
  public final QuadrigaFunction init;
  
  public CompletePrototype(IncompletePrototype original) {
    super(original.getBinaryName());
    BlockCode initializations = original.initializations;
    List<ParameterClass> parameters = Collections.unmodifiableList(new ArrayList<ParameterClass>(original.parameters));
    init = new QuadrigaFunction(parameters, initializations, original.numLocalVariables, original.localVariables, initializations);
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
    String linkedStatus; 
    if(!isValid()) {
      linkedStatus = " <->";
    } else {
      linkedStatus = " <+>";
    }
    return Utils.treeStringRepresentation("Prototype" + linkedStatus, 
        (init.parameters == null || init.parameters.size() == 0)? null : Utils.parametersRepresentation(init.parameters),
        init.code.treeStringRepresentation());
  }

  private boolean validated = false;
  @Override
  public boolean isValid() {
    if(validated) return true;
    return init.isCorrectlyLinked();
  }

  private CompletePrototype(CompletePrototype original, Aux aux, SymbolTable symbolTable, ErrorLog errorLog) {
    super(original.getBinaryName());
    aux.aux = this;
    validated = true;
    //TODO comprovar que els parametres estiguin ben "adaptats"
    symbolTable.resetLocalVariables();
    symbolTable.newContext();
    symbolTable.addLocalVariable(new ThisSymbol(QuadrigaEntity.baseEntity,original.init.code));
    
    init = original.init.getLinkedVersion(symbolTable, errorLog);
    
    symbolTable.deleteContext();
    symbolTable.closeLocalVariables();
    if(init == null) {
      validated = false;
    }
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

  @Override
  public boolean isSerializable() {
    return true;
  }
  
  private static final class AuxClass {
    String symbol;
    ComputedValue cv;
    
    AuxClass(String s, ComputedValue c) {
      symbol = s;
      cv = c;
    }
  }

  @Override
  public void apply(Entity entity, CallToNamedArguments arguments,
      Map<QuadrigaComponent, CallToNamedArguments> componentArguments,
      RuntimeEnvironment runtime) {
    
    List<AuxClass> calculatedParameters = new LinkedList<AuxClass>();
    for(Entry<String, ExpressionNode> arg : arguments.arguments.entrySet()) {
      calculatedParameters.add(new AuxClass(arg.getKey(),arg.getValue().compute(runtime)));
    }
    
    runtime.enterFunction(init.numLocalVariables); {
      
      
      
      
      //TODO comprovar parametres?
      //TODO coses de parametres
    
      Map<String, ParameterClass> params = new HashMap<String, ParameterClass>();
      for(ParameterClass param : init.parameters) {
        params.put(param.name, param);
      }
      
      Map<String, LocalVariableSymbol> locals = new HashMap<String, LocalVariableSymbol>();
      for(LocalVariableSymbol local : init.code.localVariables) {
        locals.put(local.name, local);
      }
      
      runtime.newLocalContext();
      runtime.putLocalVariable(new ThisSymbol(QuadrigaEntity.baseEntity, init.code),entity);
      
      Set<LocalVariableSymbol> symbolsToSkip = new HashSet<LocalVariableSymbol>();
      
      for(AuxClass arg : calculatedParameters) {
        params.remove(arg.symbol);
        LocalVariableSymbol lvs = locals.get(arg.symbol);
        
        runtime.putLocalVariable(lvs, arg.cv);
        symbolsToSkip.add(lvs);
      }
      
      for(Entry<String, ParameterClass> param : params.entrySet()) {
        LocalVariableSymbol lvs = locals.get(param.getKey());
        ParameterClass p = param.getValue();
        if(p.semantic == null) {
          runtime.putLocalVariable(lvs, param.getValue().init.compute(runtime));
        } else {
          if("ENTITY".compareToIgnoreCase( p.semantic ) == 0) {
            runtime.putLocalVariable(lvs,entity);
          } else {
            throw new IllegalArgumentException("Sempantic " + p.semantic + " not suported.");
          }
        }
        symbolsToSkip.add(lvs);
      }
      
      try {
        init.code.execute(runtime,symbolsToSkip);
      } catch (BreakOrContinueException e) {
        throw new IllegalStateException(e);
      }
      
      runtime.deleteLocalContext();
      
      for(Entry<QuadrigaComponent, CallToNamedArguments> componentArgument : componentArguments.entrySet()) {
        ComponentInstance ci = entity.getComponent(componentArgument.getKey());
        if(ci == null) {
          //TODO
          throw new IllegalStateException("Not implemented");
        }
        for(Entry<String, ExpressionNode> ca : componentArgument.getValue().arguments.entrySet()) {
          ci.setFieldValue(ca.getKey(), ca.getValue().compute(runtime));
        }
        ci.commitChanges();
      }
      
    } runtime.exitFunction();
  }
}
