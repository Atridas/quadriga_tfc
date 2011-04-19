package cat.quadriga.parsers.code.types.qdg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.QuadrigaFunction;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.statements.BlockCode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.BaseTypeClass;
import cat.quadriga.parsers.code.types.UnknownType;

public class IncompleteSystem extends BaseTypeClass implements QuadrigaSystem {

  public final Set<QuadrigaComponent> components = new HashSet<QuadrigaComponent>();
  public final Set<QuadrigaComponent> specialComponents = new HashSet<QuadrigaComponent>();
  public final Set<QuadrigaComponent> specialExternComponents = new HashSet<QuadrigaComponent>();
  public final Set<QuadrigaSystem> systemDependencies = new HashSet<QuadrigaSystem>();
  public QuadrigaFunction update;
  public QuadrigaFunction newEntity;
  public QuadrigaFunction removeEntity;
  public QuadrigaFunction changeEntity;
  public QuadrigaFunction init, cleanUp;
  public final Map<QuadrigaEvent, QuadrigaFunction> eventHandlers = new HashMap<QuadrigaEvent, QuadrigaFunction>();
  
  public IncompleteSystem(String binaryName) {
    super(binaryName);
  }
  
  public IncompleteSystem(String pack, String name) {
    super((pack.length()>0)? (pack + "." + name) : name);
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
    String comp, special, extern, systems, upd, newE, remE, change, events;
    comp=special=extern=systems=upd=newE=remE=change=events=null;
    List<String> aux = new LinkedList<String>();
    if(components.size() > 0) {
      aux.clear();
      for(QuadrigaComponent component: components) {
        aux.add(component.getBinaryName());
      }
      comp = Utils.treeStringRepresentation("needed components", aux);
    }
    
    if(specialComponents.size() > 0) {
      aux.clear();
      for(QuadrigaComponent component: specialComponents) {
        aux.add(component.treeStringRepresentation());
      }
      special = Utils.treeStringRepresentation("special components", aux);
    }
    
    if(specialExternComponents.size() > 0) {
      aux.clear();
      for(QuadrigaComponent component: specialExternComponents) {
        aux.add(component.treeStringRepresentation());
      }
      extern = Utils.treeStringRepresentation("special extern components", aux);
    }
    
    if(update != null) {
      upd = Utils.treeStringRepresentation("Update: ", update.treeStringRepresentation());
    }
    
    if(newEntity != null) {
      newE = Utils.treeStringRepresentation("New Entity: ", newEntity.treeStringRepresentation());
    }
    
    if(removeEntity != null) {
      remE = Utils.treeStringRepresentation("Remove Entity: ", removeEntity.treeStringRepresentation());
    }
    
    if(changeEntity != null) {
      change = Utils.treeStringRepresentation("Change Entity: ", changeEntity.treeStringRepresentation());
    }
    
    if(eventHandlers.size() > 0) {
      aux.clear();
      for(Entry<QuadrigaEvent,QuadrigaFunction> event: eventHandlers.entrySet()) {
        aux.add(Utils.treeStringRepresentation(event.getKey().getBinaryName(),event.getValue().treeStringRepresentation()));
      }
      events = Utils.treeStringRepresentation("EventHandlers", aux);
    }
    
    return Utils.treeStringRepresentation("Incomplete System", comp, special, extern, systems, upd, newE, remE, change, events);
  }
  
  @Override
  public boolean isValid() {
    return false;
  }

  @Override
  public CompleteSystem getValid(SymbolTable symbolTable, ErrorLog errorLog) {
    return new CompleteSystem(this).getValid(symbolTable, errorLog);
  }

  @Override
  public boolean isAssignableFrom(BaseType rightOperand) {
    return getBinaryName().compareTo(rightOperand.getBinaryName()) == 0;
  }

  @Override
  public boolean isSerializable() {
    return false;
  }
}
