package cat.quadriga.runtime.qvm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.EventInstance;
import cat.quadriga.runtime.RuntimeEvent;

public class VirtualEvent implements EventInstance {
  public final RuntimeEvent event;
  public final Map<String,ComputedValue> values = new HashMap<String, ComputedValue>();
  
  public VirtualEvent(RuntimeEvent event) {
    if(!event.isValid()) {
      throw new IllegalArgumentException("Event must be valid");
    }
    this.event = event;
  }

  @Override
  public RuntimeEvent getEvent() {
    return event;
  }

  @Override
  public ComputedValue getFieldValue(String field) {
    return values.get(field);
  }

  @Override
  public void setFieldValue(String field, ComputedValue value) {
    BaseType fieldType = event.getFieldType(field);
    
    if(fieldType == null) {
      throw new IllegalArgumentException("Field " + field + " does not exist "
          + "in component " + event.getBinaryName());
    }
    if(!fieldType.isAssignableFrom(value.getType())) {
      throw new IllegalArgumentException("Can not assign " 
          + value.getType().getBinaryName() + " to " + fieldType.getBinaryName());
    }
    
    values.put(field, value);
  }
  
  @Override
  public String toString() {
    StringBuilder str = new StringBuilder(event.getBinaryName());
    for(Entry<String, ComputedValue> field : values.entrySet()) {
      str.append("\n  ");
      str.append(field.getKey());
      str.append(" = ");
      str.append(field.getValue().getStringValue());
    }
    return str.toString();
  }

  @Override
  public void copy(EventInstance other) {
    // TODO Auto-generated method stub
    throw new IllegalStateException("Not implemented");
  }

  @Override
  public Map<String, ComputedValue> getFieldValues() {
    return values;
  }

  @Override
  public boolean getAsBool() {
    throw new IllegalStateException("Error");
  }

  @Override
  public byte getAsByte() {
    throw new IllegalStateException("Error");
  }

  @Override
  public char getAsChar() {
    throw new IllegalStateException("Error");
  }

  @Override
  public double getAsDouble() {
    throw new IllegalStateException("Error");
  }

  @Override
  public float getAsFloat() {
    throw new IllegalStateException("Error");
  }

  @Override
  public int getAsInt() {
    throw new IllegalStateException("Error");
  }

  @Override
  public long getAsLong() {
    throw new IllegalStateException("Error");
  }

  @Override
  public Object getAsObject() {
    return this;
  }

  @Override
  public short getAsShort() {
    throw new IllegalStateException("Error");
  }

  @Override
  public String getStringValue() {
    return toString();
  }

  @Override
  public BaseType getType() {
    return event;
  }

  @Override
  public void set(ComputedValue other) {
    throw new IllegalStateException("Error");
  }
}
