package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.BaseType;

public class LocalVarAccess extends DirectDataAccess {
  
  public final LocalVariableSymbol var;


  public LocalVarAccess(LocalVariableSymbol variable, CodeZone cz) {
    super(cz);
    var = variable;
  }

  @Override
  public String[] getOperands() {
    return new String[0];
  }

  @Override
  public String getOperation() {
    return "Local variable access: " + var.name;
  }

  @Override
  public BaseType getType() {
    return var.type;
  }

  @Override
  public boolean isAssignable() {
    return 0 != (Utils.FINAL & var.modifiers);
  }

  @Override
  public boolean isReadable() {
    return true;
  }

}
