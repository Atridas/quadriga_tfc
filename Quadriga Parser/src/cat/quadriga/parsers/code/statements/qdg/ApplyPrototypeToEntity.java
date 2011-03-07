package cat.quadriga.parsers.code.statements.qdg;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.CallToNamedArguments;
import cat.quadriga.parsers.code.statements.StatementNodeClass;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.parsers.code.types.qdg.QuadrigaPrototype;

public class ApplyPrototypeToEntity extends StatementNodeClass {
  
  public final ExpressionNode entity;
  public final QuadrigaPrototype base;
  public final CallToNamedArguments arguments;
  public final Map<QuadrigaComponent, CallToNamedArguments> componentArguments;
  

  public ApplyPrototypeToEntity(
      ExpressionNode entity,
      QuadrigaPrototype base, 
      CallToNamedArguments arguments, 
      Map<QuadrigaComponent, CallToNamedArguments> componentArguments,
      CodeZone cz) {
    super(cz);
    this.entity = entity;
    this.base = base;
    this.arguments = arguments;
    this.componentArguments = componentArguments;
  }

  @Override
  public String treeStringRepresentation() {
    List<String> aux = new LinkedList<String>();
    aux.add(entity.treeStringRepresentation());
    aux.add(base.treeStringRepresentation());
    aux.add(arguments.treeStringRepresentation());
    for(Entry<QuadrigaComponent, CallToNamedArguments> entry : componentArguments.entrySet()) {
      aux.add(
          Utils.treeStringRepresentation("Component redefinition", 
              entry.getKey().getBinaryName(),
              entry.getValue().treeStringRepresentation())
          );
    }
    return Utils.treeStringRepresentation("Apply Prototype to Entity",aux);
  }

  private boolean linked = false;
  private ApplyPrototypeToEntity linkedVersion = null;
  @Override
  public ApplyPrototypeToEntity getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode ent;
      CallToNamedArguments args;
      QuadrigaPrototype prototype;
      if(entity.isCorrectlyLinked()) {
        ent = entity;
      } else {
        ent = entity.getLinkedVersion(symbolTable, errorLog);
        if(ent == null) {
          return null;
        }
      }
      if(arguments.isCorrectlyLinked()) {
        args = arguments;
      } else {
        args = arguments.getLinkedVersion(symbolTable, errorLog);
        if(args == null) {
          return null;
        }
      }
      if(base.isValid()) {
        prototype = base;
      } else {
        prototype = base.getValid(symbolTable, errorLog);
        if(prototype == null) {
          return null;
        }
      }

      //Arguments xungos
      Map<QuadrigaComponent, CallToNamedArguments> compArgs = new HashMap<QuadrigaComponent, CallToNamedArguments>();
      for(Entry<QuadrigaComponent, CallToNamedArguments> entry : componentArguments.entrySet()) {
        CallToNamedArguments nargs = entry.getValue();
        if(nargs.isCorrectlyLinked()) {
          compArgs.put(entry.getKey(),nargs);
        } else {
          nargs = nargs.getLinkedVersion(symbolTable, errorLog);
          if(nargs == null) {
            return null;
          } else {
            compArgs.put(entry.getKey(),nargs);
          }
        }
      }
      
      
      if(!(ent.getType() instanceof QuadrigaEntity)) {
        errorLog.insertError("Necessita una entitat", ent);
        return null;
      }
      linkedVersion = new ApplyPrototypeToEntity(ent, prototype, args, compArgs, this);
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
