package cat.quadriga.parsers.code.symbols;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SymbolTable {

  Map<String, BaseSymbol> globalNamesPace = new HashMap<String, BaseSymbol>();
  List<Map<String, BaseSymbol>> mapStack = new LinkedList<Map<String,BaseSymbol>>();

  
  public void newContext() {
    mapStack.add(new HashMap<String, BaseSymbol>());
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
    return globalNamesPace.get(name);
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
}
