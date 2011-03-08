package cat.quadriga.parsers.code.expressions.qdg;

import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.statements.CallToNamedArguments;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;

public final class ComponentAllocation extends ExpressionNodeClass {
  
  public final QuadrigaComponent            component;
  public final CallToNamedArguments arguments;

  public ComponentAllocation(QuadrigaComponent component, CallToNamedArguments arguments, CodeZone cz) {
    super(cz);
    this.component = component;
    this.arguments = arguments;
  }

  @Override
  public String[] getOperands() {
    String[] aux = {component.treeStringRepresentation(), 
                    arguments.treeStringRepresentation()};
    return aux;
  }

  @Override
  public String getOperation() {
    return "Component Allocation";
  }

  @Override
  public BaseType getType() {
    return component;
  }

  private boolean linked = false;
  private ComponentAllocation linkedVersion = null;
  @Override
  public ComponentAllocation getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      QuadrigaComponent validC;
      if(component.isValid()) {
        validC = component;
      } else {
        BaseSymbol symbol = symbolTable.findSymbol(component.getBinaryName());
        try {
          assert symbol != null;
          assert symbol instanceof TypeSymbol;
          assert ((TypeSymbol)symbol).type instanceof QuadrigaComponent;
          validC = (QuadrigaComponent)((TypeSymbol)symbol).type;
          if(!validC.isValid()) {
            validC = validC.getValid(symbolTable, errorLog);
            if(validC == null) {
              return null;
            }
            symbolTable.addGlobalSymbol(new TypeSymbol(validC));
          }
        } catch(AssertionError e) {
          errorLog.insertError("Error while finding the component" + component.getBinaryName(),this);
          return null;
        }
      }
      CallToNamedArguments ctna;
      if(arguments.isCorrectlyLinked()) {
        ctna = arguments;
      } else {
        ctna = arguments.getLinkedVersion(symbolTable, errorLog);
        if(ctna == null) {
          return null;
        }
      }
      
      for(Entry<String,ExpressionNode> namedArg : ctna.arguments.entrySet()) {
        QuadrigaComponent.ComponentField field = validC.getField(namedArg.getKey());
        if(field == null) {
          errorLog.insertError("Component " + validC.getBinaryName() + " has no " + namedArg.getKey(),namedArg.getValue());
          return null;
        }
        if(!field.type.isAssignableFrom(namedArg.getValue().getType())) {
          errorLog.insertError("Cannot assign this value [" 
              + namedArg.getValue().getType().getBinaryName() 
              + "] to field " 
              + namedArg.getKey()
              + " ["
              + field.type.getBinaryName()
              + "]"
              , namedArg.getValue());
          return null;
        }
      }
      linkedVersion = new ComponentAllocation(validC, ctna, this);
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

}
