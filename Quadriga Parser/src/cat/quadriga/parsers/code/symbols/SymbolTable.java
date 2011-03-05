package cat.quadriga.parsers.code.symbols;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.TreeRepresentable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;

public class SymbolTable implements TreeRepresentable {
  
  private final Set<String> searchedClasses = new HashSet<String>();
  private final Map<String, BaseSymbol> globalNamespace = new HashMap<String, BaseSymbol>();
  private final Stack<Map<String, BaseSymbol>> mapStack = new Stack<Map<String,BaseSymbol>>();
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
  
  public BaseSymbol findSymbol(String name) {
    for(Map<String, BaseSymbol> map : mapStack) {
      BaseSymbol symbol = map.get(name);
      if(symbol != null) {
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
      return mapStack.get(0).get(name);
    } else {
      return null;
    }
  }
  
  public void addSymbol(BaseSymbol symbol) {
    String name = symbol.name;
    String aliases[] = symbol.getAlias();
    
    Map<String, BaseSymbol> map = mapStack.get(0);
    map.put(name, symbol);
    for(String alias : aliases) {
      if(!map.containsKey(alias)) {
        map.put(alias, symbol);
      }
    }
  }
  
  public void addGlobalSymbol(BaseSymbol symbol) {
    String name = symbol.name;
    String aliases[] = symbol.getAlias();
    
    Map<String, BaseSymbol> map = globalNamespace;
    map.put(name, symbol);
    for(String alias : aliases) {
      if(!map.containsKey(alias)) {
        map.put(alias, symbol);
      }
    }
    searchedClasses.clear();
  }
  
  public void addPackage(String packa) {
    includedPackages.add(packa);
    searchedClasses.clear();
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
      for(Entry<String,BaseSymbol> symbol : namespace.entrySet()) {
        symbols.add("\"" + symbol.getKey() + "\" : " + symbol.getValue().treeStringRepresentation());
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
}
