package cat.quadriga.parsers.code.statements.qdg;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.statements.CallToArguments;
import cat.quadriga.parsers.code.statements.CallToListedArguments;
import cat.quadriga.parsers.code.statements.CallToNamedArguments;
import cat.quadriga.parsers.code.statements.StatementNodeClass;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEvent;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.EventInstance;
import cat.quadriga.runtime.RuntimeEnvironment;
import cat.quadriga.runtime.RuntimeEvent;

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
        errorLog.insertError("Event time must be a number", newTime);
        return null;
      }
      
      if(newArgs instanceof CallToListedArguments) {
        if(((CallToListedArguments)newArgs).arguments.size() > 0) {
          errorLog.insertError("Arguments must be named", newArgs);
        }
      } else {
        //TODO arguments
      }
      
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
  
  @Override
  public void execute(RuntimeEnvironment runtime) {
    assert isCorrectlyLinked();
    
    ComputedValue computedEntity = null;
    if(entity != null) {
      computedEntity = entity.compute(runtime);
    }

    RuntimeEvent re = (RuntimeEvent)event;
    
    Map<String,ComputedValue> arguments = new HashMap<String, ComputedValue>();
    if(args instanceof CallToNamedArguments) {
      for(Entry<String, ExpressionNode> arg : ((CallToNamedArguments)args).arguments.entrySet()) 
      {
        arguments.put(
            arg.getKey(), 
            arg.getValue().compute(runtime)
            );
      }
    }
    
    EventInstance ei = re.createInstance(arguments, runtime);
    
    if(time == null) {
      runtime.executeEvent(ei, (Entity)computedEntity);
    } else {
      runtime.enqueueEvent(ei, (Entity)computedEntity, time.compute(runtime).getAsFloat());
    }
    
  }

}
