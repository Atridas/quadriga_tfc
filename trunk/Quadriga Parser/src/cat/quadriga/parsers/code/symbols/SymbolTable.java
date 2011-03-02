package cat.quadriga.parsers.code.symbols;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cat.quadriga.parsers.code.types.ClassOrInterfaceTypeRef;

public class SymbolTable {
  
  private final Set<String> searchedClasses = new HashSet<String>();
  private final Map<String, BaseSymbol> globalNamesPace = new HashMap<String, BaseSymbol>();
  private final List<Map<String, BaseSymbol>> mapStack = new LinkedList<Map<String,BaseSymbol>>();
  {
    mapStack.add(globalNamesPace);
  }

  private final List<String> includedPackages = new LinkedList<String>();
  {
    addPackage("java.lang");
  }
  
  public void newContext() {
    mapStack.add(0, new HashMap<String, BaseSymbol>());
  }
  
  public void deleteContext() {
    mapStack.remove(0);
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
    
    Map<String, BaseSymbol> map = globalNamesPace;
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
}
