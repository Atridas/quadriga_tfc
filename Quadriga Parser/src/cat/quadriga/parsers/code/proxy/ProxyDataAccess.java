package cat.quadriga.parsers.code.proxy;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
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
  public ProxyDataAccess getLinkedVersion(SymbolTable symbolTable, ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }

}
