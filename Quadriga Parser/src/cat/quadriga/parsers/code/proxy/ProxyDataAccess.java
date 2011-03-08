package cat.quadriga.parsers.code.proxy;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.WriteAccess;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.UnknownType;

public final class ProxyDataAccess extends ExpressionNodeClass implements DataAccess {

  public final String name;
  public final ExpressionNode indirect;
  public final Class<?> clazz;

  public ProxyDataAccess(String name, CodeZone cz) {
    super(cz);
    this.name = name;
    indirect = null;
    clazz = null;
  }
  
  public ProxyDataAccess(String name) {
    super(new CodeZoneClass(0,0,0,0,""));
    this.name = name;
    indirect = null;
    clazz = null;
  }

  public ProxyDataAccess(String name, ExpressionNode indirect, CodeZone cz) {
    super(cz);
    this.name = name;
    this.indirect = indirect;
    clazz = null;
  }

  public ProxyDataAccess(String name, Class<?> clazz, CodeZone cz) {
    super(cz);
    this.name = name;
    this.indirect = null;
    this.clazz = clazz;
  }

  @Override
  public String[] getOperands() {
    if(indirect != null) {
      String[] aux = { indirect.treeStringRepresentation() };
      return aux;
    } else if(clazz != null) {
      String[] aux = { clazz.toString() };
      return aux;
    } else {
      return new String[0];
    }
  }

  @Override
  public String getOperation() {
    return ">> Proxy Data Access [ " + name + " ] <<";
  }

  @Override
  public BaseType getType() {
    return UnknownType.empty;
  }

  @Override
  public boolean isAssignable() {
    return true;
  }

  @Override
  public boolean isReadable() {
    return true;
  }

  @Override
  public DataAccess getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog) {
    ExpressionNode nInd;
    if(indirect == null || indirect.isCorrectlyLinked()) {
      nInd = indirect;
    } else {
      nInd = indirect.getLinkedVersion(symbolTable, errorLog);
      if(nInd == null) {
        return null;
      }
    }
    //TODO errorlog
    if(nInd == null) {
      BaseSymbol symbol = symbolTable.findSymbol(name);
      if(symbol != null) {
        DataAccess aux = Utils.symbolToDataAccess(symbol, this);
        if(aux instanceof ProxyDataAccess) {
          errorLog.insertError("Symbol " + name + " is not of valid type", this);
        } else {
          return aux.getLinkedVersion(symbolTable, errorLog);
        }
      } else {
        errorLog.insertError("Can not find " + name, this);
      }
    } else {
      return Utils.accessToMember(nInd, name, this)
              .getLinkedVersion(symbolTable, errorLog);
    }
    
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return false;
  }

  @Override
  public WriteAccess getWriteVersion() {
    return null;
  }

}
