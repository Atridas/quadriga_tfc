package cat.quadriga.parsers.code.statements;



import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.ArrayType;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.JavaType;

public class IterableFor extends StatementNodeClass implements BucleInterface {
  
  public final LocalVariableSymbol iterator;
  public final ExpressionNode iterable;
  public final StatementNode execution;

  public IterableFor(LocalVariableSymbol iterator, ExpressionNode iterable, StatementNode execution, CodeZone cz) {
    super(cz);
    this.iterator = iterator;
    this.iterable = iterable;
    this.execution = execution;
  }

  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      treeStringRepresentation = Utils.treeStringRepresentation("for iteration", 
                                    "iterator: " + iterator.name + " {" + iterator.type + "}",
                                    iterable.treeStringRepresentation(),
                                    execution.treeStringRepresentation());
    }
    return treeStringRepresentation;
  }
  
  private IterableFor(IterableFor original, 
      SymbolTable symbolTable,
      ErrorLog errorLog) 
  {
    super(original);
    linked = true;
    linkedVersion = this;
    
    if(original.iterable.isCorrectlyLinked()) {
      iterable = original.iterable;
    } else {
      iterable = original.iterable.getLinkedVersion(symbolTable, errorLog);
      if(this.iterable == null) {
        linked = false;
      }
    }
    

    symbolTable.newContext();
    BucleOrSwitchInterface prev = symbolTable.closestBucleOrSwitch;
    symbolTable.closestBucleOrSwitch = this;

    if(original.iterator.type.isValid()) {
      iterator = original.iterator;
      symbolTable.addSymbol(iterator);
    } else {
      BaseType type = original.iterator.type.getValid(symbolTable, errorLog);
      if(type != null) {
        linked = false;
      }
      iterator = new LocalVariableSymbol(
          original.iterator.modifiers, 
          type, 
          original.iterator.name
          );
      symbolTable.addSymbol(iterator);
    }
    
    if(original.execution.isCorrectlyLinked()) {
      execution = original.execution;
    } else {
      execution = original.execution.getLinkedVersion(symbolTable, errorLog);
      if(this.iterable == null) {
        linked = false;
      }
    }
    
    symbolTable.closestBucleOrSwitch = prev;
    symbolTable.deleteContext();
    

    if(iterable.getType() instanceof ArrayType) {
      ArrayType at = (ArrayType)iterable.getType();
      if(!iterator.type.isAssignableFrom(at.base)) {
        linked = false;
        errorLog.insertError("L'operador dret i l'esquerra no són compatibles", this);
      }
    } else if(iterable.getType() instanceof JavaType) {
        JavaType jt = (JavaType)iterable.getType();
        if(Iterable.class.isAssignableFrom( jt.classObject )) {
          //TODO ----------------------
        } else {
          linked = false;
          errorLog.insertError("L'operador dret no és iterable", iterable);
        }
    } else {
      linked = false;
      errorLog.insertError("L'operador dret no és iterable", iterable);
    }
  }
  
  private boolean linked = false;
  private IterableFor linkedVersion = null;
  @Override
  public IterableFor getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      linkedVersion = new IterableFor(this, symbolTable, errorLog);
      if(!linkedVersion.isCorrectlyLinked()) {
        linkedVersion = null;
      }
    }
    return linkedVersion;
  }
  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

}
