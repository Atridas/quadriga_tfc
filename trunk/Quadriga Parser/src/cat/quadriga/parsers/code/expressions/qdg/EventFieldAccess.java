package cat.quadriga.parsers.code.expressions.qdg;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.expressions.dataaccess.UnaryDataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.WriteAccess;
import cat.quadriga.parsers.code.symbols.BaseSymbol;
import cat.quadriga.parsers.code.symbols.TypeSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEvent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaField;
import cat.quadriga.runtime.ComponentInstance;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.EventInstance;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class EventFieldAccess extends UnaryDataAccess {
  
  public String field;
  public QuadrigaEvent event;

  public EventFieldAccess(ExpressionNode reference, String field, CodeZone cz) {
    super(reference,cz);
    this.field = field;
    this.event = (QuadrigaEvent)reference.getType();
  }
  
  public boolean isStatic() {
    return false;
  }
  
  @Override
  public String getOperation() {
    QuadrigaField cf = event.getField(field);
    if(cf == null) {
      return ">> Wrong Event Field: <<";
    }
    return "Event Field:";
  }
  
  @Override
  public String[] getOperands() {
    String[] aux = { event.getBinaryName() + " -> " + field,
                     operand.treeStringRepresentation()}; 
    return aux;
  }

  @Override
  public BaseType getType() {
    QuadrigaField cf = event.getField(field);
    if(cf == null) {
      return UnknownType.empty;
    }
    return cf.type;
  }

  @Override
  public boolean isAssignable() {
    return false; //TODO revisar això
  }

  @Override
  public boolean isReadable() {
    return true;
  }

  private boolean linked = false;
  @Override
  public EventFieldAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) return this;
    linked = true;
    
    if(!event.isValid()) {
      BaseSymbol symbol = symbolTable.findSymbol(event.getBinaryName());
      try {
        assert symbol != null;
        assert symbol instanceof TypeSymbol;
        assert ((TypeSymbol)symbol).type instanceof QuadrigaEvent;
        
        QuadrigaEvent validE = (QuadrigaEvent)((TypeSymbol)symbol).type;
        if(!validE.isValid()) {
          validE = validE.getValid(symbolTable, errorLog);
          if(validE == null) {
            linked = false;
          } else {
            event = validE;
            symbolTable.addGlobalSymbol(new TypeSymbol(event));
          }
        }
      } catch(AssertionError e) {
        errorLog.insertError("Error while finding the component" + event.getBinaryName(),this);
        return null;
      }
    }
    if(!operand.isCorrectlyLinked()) {
      ExpressionNode op = operand.getLinkedVersion(symbolTable, errorLog);
      if(op == null) {
        linked = false;
      } else {
        operand = op;
      }
    }
    
    QuadrigaField field = event.getField(this.field);
    if(field == null) {
      errorLog.insertError("Component " + event.getBinaryName() + " has no " + this.field,this);
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
    return null;
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }
  
  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    
    EventInstance ei = (EventInstance) operand.compute(runtime);
    
    return ei.getFieldValue(field);
  }

}