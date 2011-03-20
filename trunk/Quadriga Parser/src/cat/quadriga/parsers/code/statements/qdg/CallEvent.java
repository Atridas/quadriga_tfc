package cat.quadriga.parsers.code.statements.qdg;

import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.CallToArguments;
import cat.quadriga.parsers.code.statements.StatementNodeClass;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEvent;

public class CallEvent extends StatementNodeClass {
  
  public final ExpressionNode entity, time;
  public final QuadrigaEvent event;
  public final CallToArguments args;

  public CallEvent(
      ExpressionNode entity, 
      QuadrigaEvent event,
      CallToArguments args,
      ExpressionNode time,
      CodeZone cz) {
    super(cz);
    this.entity = entity;
    this.time = time;
    this.event = event;
    this.args = args;
  }

  @Override
  public String[] getOperands() {
    List<String> aux = new LinkedList<String>();
    if(entity != null) {
      aux.add(entity.treeStringRepresentation());
    }
    aux.add(args.treeStringRepresentation());
    if(time != null) {
      aux.add(time.treeStringRepresentation());
    }
    return aux.toArray(new String[aux.size()]);
  }

  @Override
  public String getOperation() {
    return "Call to Event " + event.getBinaryName();
  }

  private boolean linked = false;
  private CallEvent linkedVersion = null;
  @Override
  public CallEvent getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } else if(linkedVersion == null) {
      ExpressionNode newEntity, newTime;
      CallToArguments newArgs;
      QuadrigaEvent newEvent;
      if(entity == null || entity.isCorrectlyLinked()) {
        newEntity = entity;
      } else {
        newEntity = entity.getLinkedVersion(symbolTable, errorLog);
        if(newEntity == null) {
          return null;
        }
      }
      if(time == null || time.isCorrectlyLinked()) {
        newTime = time;
      } else {
        newTime = time.getLinkedVersion(symbolTable, errorLog);
        if(newTime == null) {
          return null;
        }
      }
      if(args.isCorrectlyLinked()) {
        newArgs = args;
      } else {
        newArgs = args.getLinkedVersion(symbolTable, errorLog);
        if(newArgs == null) {
          return null;
        }
      }
      if(event.isValid()) {
        newEvent = event;
      } else {
        newEvent = event.getValid(symbolTable, errorLog);
        if(newEvent == null) {
          return null;
        }
      }
      
      if(newEntity != null && !(newEntity.getType() instanceof QuadrigaEntity)) {
        errorLog.insertError("Event needs to be called to an Entity", newEntity);
        return null;
      }
      
      if(newTime != null && !PrimitiveTypeRef.getFromName("float").isAssignableFrom(newTime.getType())) {
        errorLog.insertError("Event time must be a number", newEntity);
        return null;
      }
      
      //TODO arguments
      
      linkedVersion = new CallEvent(newEntity,newEvent,newArgs,newTime,this); 
      linkedVersion.linkedVersion = linkedVersion;
      linkedVersion.linked = true;
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }

}
