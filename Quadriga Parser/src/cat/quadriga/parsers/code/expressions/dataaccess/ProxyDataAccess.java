package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NullType;

public class ProxyDataAccess extends ExpressionNode implements DataAccess {

  private final String name;
  private final DataAccess indirect;
  public ProxyDataAccess(String name, int beginLine, int beginColumn, int endLine,
      int endColumn) {
    super(beginLine, beginColumn, endLine, endColumn);
    this.name = name;
    indirect = null;
  }

  public ProxyDataAccess(String name, CodeZone cz) {
    super(cz);
    this.name = name;
    indirect = null;
  }
  
  public ProxyDataAccess(String name, DataAccess indirect, int beginLine, int beginColumn, int endLine,
      int endColumn) {
    super(beginLine, beginColumn, endLine, endColumn);
    this.name = name;
    this.indirect = indirect;
  }

  public ProxyDataAccess(String name, DataAccess indirect, CodeZone cz) {
    super(cz);
    this.name = name;
    this.indirect = indirect;
  }

  @Override
  public String[] getOperands() {
    if(indirect == null) {
      return new String[0];
    } else {
      String[] aux = { indirect.treeStringRepresentation() };
      return aux;
    }
  }

  @Override
  public String getOperation() {
    return ">> Proxy Data Access [" + name + "] <<";
  }

  @Override
  public BaseType getType() {
    return NullType.instance; //TODO arreglar això
  }

  @Override
  public boolean isAssignable() {
    return true;
  }

  @Override
  public boolean isReadable() {
    return true;
  }

}
