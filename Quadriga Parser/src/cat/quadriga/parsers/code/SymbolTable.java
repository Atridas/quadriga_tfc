package cat.quadriga.parsers.code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Map.Entry;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.statements.BucleOrSwitchInterface;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;

public class SymbolTable implements TreeRepresentable {
  
  private final Set<String> searchedClasses = new HashSet<String>();
  private final Map<String, BaseSymbol> globalNamespace = new HashMap<String, BaseSymbol>();
  private final Stack<Map<String, BaseSymbol>> mapStack = new Stack<Map<String,BaseSymbol>>();

  public final Set<QuadrigaComponent> accesses = new HashSet<QuadrigaComponent>();
  public final Set<QuadrigaComponent> writes = new HashSet<QuadrigaComponent>();
  
  public BucleOrSwitchInterface closestBucleOrSwitch = null;
  {
    mapStack.push(globalNamespace);
  }

  private final List<String> includedPackages = new LinkedList<String>();
  {
    addPackage("java.lang");
  }
  
  public void newContext() {
    mapStack.push(new HashMap<String, BaseSymbol>());
  }
  
  public void deleteContext() {
    mapStack.pop();
  }
  
  public BaseSymbol findSymbol(List<Token> name) {
    String n = name.get(0).image;
    for(int i = 0; i < name.size(); ++i) {
      n += "." + name.get(i);
    }
    return findSymbol(n);
  }
  
  public BaseSymbol findSymbol(String name) {
    for(Map<String, BaseSymbol> map : mapStack) {
      BaseSymbol symbol = map.get(name);
      if(symbol != null) {
        if(symbol instanceof SymbolRef) {
          symbol = ((SymbolRef)symbol).base;
        }
        return symbol;
      }
    }
    
    //Search for classes
    BaseSymbol symbol = findClassOrInnerClass(name);
    if(symbol != null) return symbol;
    String aux[] = name.split("\\.");
    String aux2 = aux[0];
    for(int i = 0; i < aux.length-1 ; i++) {
      symbol = findClassOrInnerClass(aux2);
      if(symbol == null) {
        aux2 += "." + aux[i+1];
        continue;
      } else {
        for(int j = i+1; j < aux.length; j++) {
          aux2 += "$" + aux[j];
        }
        symbol = findClassOrInnerClass(aux2);
        break;
      }
    }
    if(symbol instanceof SymbolRef) {
      symbol = ((SymbolRef)symbol).base;
    }
    return symbol;
  }
  
  private BaseSymbol findClassOrInnerClass(String name) {
    if(searchedClasses.contains(name)) {
      return null;
    }
    for(String packa: includedPackages) {
      try {
        Class<?> clazz = Class.forName(packa + "." + name);
        BaseSymbol symbol = new TypeSymbol(ClassOrInterfaceTypeRef.getFromClass(clazz));
        addGlobalSymbol(symbol);
        return symbol;
      } catch (ClassNotFoundException e) {
        continue;
      } catch (Throwable e) {
        continue;
      }
    }
    searchedClasses.add(name);
    return null;
  }
  
  public BaseSymbol findSymbolOnTop(String name) {
    if(mapStack.size() != 0) {
      BaseSymbol symbol = mapStack.get(0).get(name);
      if(symbol instanceof SymbolRef) {
        symbol = ((SymbolRef)symbol).base;
      }
      return symbol;
    } else {
      return null;
    }
  }
  
  public void addSymbol(BaseSymbol symbol) {
    String name = symbol.name;
    String aliases[] = symbol.getAlias();
    
    Map<String, BaseSymbol> map = mapStack.peek();
    map.put(name, symbol);
    for(String alias : aliases) {
      //if(!map.containsKey(alias)) {
        map.put(alias, new SymbolRef( symbol ));
      //}
    }
  }
  
  public void addGlobalSymbol(BaseSymbol symbol) {
    String name = symbol.name;
    String aliases[] = symbol.getAlias();
    
    Map<String, BaseSymbol> map = globalNamespace;
    map.put(name, symbol);
    for(String alias : aliases) {
      //if(!map.containsKey(alias)) {
        map.put(alias, new SymbolRef( symbol ));
      //}
    }
    searchedClasses.clear();
  }
  
  public void addPackage(String packa) {
    includedPackages.add(packa);
    searchedClasses.clear();
  }
  
  public void copyGlobals(SymbolTable other) {
    if(other == null || this == other) {
      return;
    }
    
    globalNamespace.putAll(other.globalNamespace);
  }
  
  public boolean link(ErrorLog errorLog) {
    boolean errorsOcurred = false;
    for(Entry<String, BaseSymbol> entry : globalNamespace.entrySet()) {
      BaseSymbol symbol = entry.getValue();
      
      if(symbol instanceof SymbolRef) {
        symbol = ((SymbolRef)symbol).base;
      }
      
      if(symbol instanceof TypeSymbol) {
        BaseType type = ((TypeSymbol)symbol).type;
        if(!type.isValid()) {
          type = type.getValid(this, errorLog);
          if(type == null) {
            errorsOcurred = true;
          } else {
            globalNamespace.put(entry.getKey(), new TypeSymbol(type));
          }
        }
      } else {
        errorLog.insertWarning("Symbol " + entry.getKey() + " is not a type", CodeZoneClass.linking);
      }
    }
    return !errorsOcurred;
  }
  
  public void cleanQuadrigaPackage(String pack) {
    if(!pack.endsWith(".")) {
      pack += '.';
    }
    
    List<String> aux = new LinkedList<String>();
    for(Entry<String,BaseSymbol> entry: globalNamespace.entrySet()) {
      String str = entry.getKey();
      if(str.startsWith(pack)) {
        aux.add(str);
      }
    }
  }

  @Override
  public String treeStringRepresentation() {
    Stack<String> aux = new Stack<String>();
    for(Map<String,BaseSymbol> namespace : mapStack) {
      String kind;
      if(namespace == globalNamespace) {
        kind = "Globals";
      } else {
        kind = "Locals";
      }
      List<String> symbols = new LinkedList<String>();
      //for(Entry<String,BaseSymbol> symbol : new TreeMap<String,BaseSymbol>(namespace).entrySet()) {
      for(Entry<String,BaseSymbol> symbol : namespace.entrySet()) {
            if(!(symbol.getValue() instanceof SymbolRef)) {
          symbols.add("\"" + symbol.getKey() + "\" : " + symbol.getValue().treeStringRepresentation());
        }
      }
      String element = Utils.treeStringRepresentation(kind, symbols);
      aux.push(element);
    }
    return Utils.treeStringRepresentation("", aux);
  }

  @Override
  public String toString() {
    return treeStringRepresentation();
  }
  
  private static class SymbolRef extends BaseSymbol {
    
    public final BaseSymbol base;

    public SymbolRef(BaseSymbol origin) {
      super(origin.name);
      base = origin;
    }

    @Override
    public String createTreeStringRepresentation() {
      return base.createTreeStringRepresentation();
    }
    
  }
}
