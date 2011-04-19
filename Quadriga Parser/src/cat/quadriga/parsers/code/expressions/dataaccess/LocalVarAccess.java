package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class LocalVarAccess extends DirectDataAccess {
  
  public LocalVariableSymbol var;


  public LocalVarAccess(LocalVariableSymbol variable, CodeZone cz) {
    super(cz);
    variable.updateCodeZone(cz);
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
    return 0 == (Utils.FINAL & var.modifiers);
  }

  @Override
  public boolean isReadable() {
    return true;
  }

  private boolean linked = false;
  @Override
  public LocalVarAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) return this;
    linked = true;
    
    BaseSymbol symbol = symbolTable.findSymbol(var.name);
    if(symbol instanceof LocalVariableSymbol) {
      LocalVariableSymbol lvs = (LocalVariableSymbol)symbol;
      if(lvs.type == null) {
        errorLog.insertError("No type",this);
        linked = false;
      } else if(!lvs.type.isValid()) {
        errorLog.insertError("Type " + lvs.type + " not valid",this);
        linked = false;
      }
      var = lvs;
    } else {
      errorLog.insertError("Symbol " + var.name + " not found",this);
      linked = false;
    }
    
    
    if(linked) return this;
    else       return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

  @Override
  public WriteAccess getWriteVersion(SymbolTable symbolTable) {
    return new WriteVersion();
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }
  
  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    assert isCorrectlyLinked();
    return runtime.getLocalVariable(var);
  }

  private class WriteVersion extends ExpressionNodeClass implements WriteAccess {

    public WriteVersion() {
      super(LocalVarAccess.this);
    }

    @Override
    public DataAccess getLinkedVersion(SymbolTable symbolTable,
        ErrorLog errorLog) {
      return this;
    }

    @Override
    public BaseType getType() {
      return LocalVarAccess.this.getType();
    }

    @Override
    public WriteAccess getWriteVersion(SymbolTable symbolTable) {
      return this;
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
    public String[] getOperands() {
      return LocalVarAccess.this.getOperands();
    }

    @Override
    public String getOperation() {
      return LocalVarAccess.this.getOperation();
    }

    @Override
    public boolean isCorrectlyLinked() {
      return true;
    }

    @Override
    public LiteralData getCompileTimeConstant() {
      return null;
    }

    @Override
    public void setValue(ComputedValue value, RuntimeEnvironment runtime) {
      runtime.putLocalVariable(var, value);
    }
    
  }

}
