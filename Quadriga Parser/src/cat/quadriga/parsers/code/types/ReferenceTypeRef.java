package cat.quadriga.parsers.code.types;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.MemberAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.FieldAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.MethodAccess;

public class ReferenceTypeRef extends JavaType {
  
  private final Map<String, List<AccessibleObject>> ambiguousNames = new HashMap<String, List<AccessibleObject>>();
  private final Map<String, Field> fields = new HashMap<String, Field>();
  private final Map<String, List<Method>> methods = new HashMap<String, List<Method>>();
  private final List<Constructor<?>> constructors = new LinkedList<Constructor<?>>();
  
  //TODO inner classes...
  
  protected ReferenceTypeRef(Class<?> c, String binaryName) {
    super(c, binaryName);
    
    Field[] fields = c.getFields();
    for(int i = 0; i < fields.length; i++) {
      addField(fields[i]);
    }
    
    Method[] methods = c.getMethods();
    for(int i = 0; i < methods.length; i++) {
      addMethod(methods[i]);
    }
    
    Constructor<?>[] constructors = c.getConstructors();
    for(int i = 0; i < constructors.length; i++) {
      addConstructor(constructors[i]);
    }
  }
  
  public DataAccess getAccess(String name, CodeZone cz) {
    return getAccess(null, name, cz);
  }
  
  public DataAccess getAccess(ExpressionNode reference, String name, CodeZone cz) {
    List<AccessibleObject> ambiguous = ambiguousNames.get(name);
    if(ambiguous != null) {
      //TODO millorable
      return new MemberAccess(name,this.classObject,cz);
    }
    
    Field field = fields.get(name);
    if(field != null) {
      return new FieldAccess(reference, field, cz);
    }
    
    List<Method> methodList = methods.get(name);
    if(methodList != null) {
      return new MethodAccess(reference, methodList.toArray(new Method[methodList.size()]), cz);
    }
    
    return new MemberAccess("Proxy access to " + name, this.classObject,cz);
  }

  private boolean searchAndDeleteRedundant(String objectName, boolean fields) {
    if(ambiguousNames.containsKey(objectName)) {
      return true;
    }
    if(fields) {
      if(methods.remove(objectName) != null) {
        ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
        return true;
      }
    } else {
      if(this.fields.remove(objectName) != null) {
        ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
        return true;
      }
    }
    return false;
  }

  private void addField(Field field) {
    if(searchAndDeleteRedundant(field.getName(), false)) {
      ambiguousNames.get(field.getName()).add(field);
    } else {
      fields.put(field.getName(), field);
    }
  }

  private void addMethod(Method method) {
    if(searchAndDeleteRedundant(method.getName(), false)) {
      ambiguousNames.get(method.getName()).add(method);
    } else {
      List<Method> methods = this.methods.get(method.getName());
      if(methods == null) {
        methods = new LinkedList<Method>();
        this.methods.put(method.getName(), methods);
      }
      methods.add(method);
    }
    
  }

  private void addConstructor(Constructor<?> constructor) {
    constructors.add(constructor);
  }
}
