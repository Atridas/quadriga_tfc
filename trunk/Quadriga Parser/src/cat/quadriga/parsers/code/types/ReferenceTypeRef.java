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
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.StaticAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.StaticFieldAccess;

public class ReferenceTypeRef extends JavaType {
  
  private final Map<String, List<AccessibleObject>> ambiguousNames = new HashMap<String, List<AccessibleObject>>();
  private final Map<String, Field> fields = new HashMap<String, Field>(),
                             staticFields = new HashMap<String, Field>();
  private final Map<String, Method> methods = new HashMap<String, Method>(),
                              staticMethods = new HashMap<String, Method>();
  private final List<Constructor<?>> constructors = new LinkedList<Constructor<?>>();
  
  public ReferenceTypeRef(Class<?> c, String binaryName) {
    super(c, "L" + c.getCanonicalName() + ";");
    
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
  
  
  public DataAccess getStaticAccess(String name, CodeZone cz) {
    List<AccessibleObject> ambiguous = ambiguousNames.get(name);
    if(ambiguous != null) {
      //TODO millorable
      return new StaticAccess(name,this.classObject,cz);
    }
    
    Field field = staticFields.get(name);
    if(field != null) {
      return new StaticFieldAccess(field,this.classObject,cz);
    }
    
    Method method = staticMethods.get(name);
    if(method != null) {
      //TODO
      return new StaticAccess(name,this.classObject,cz);
    }
    
    return new StaticAccess("Proxy access to " + name, this.classObject,cz);
  }

  private boolean searchAndDeleteRedundant(String objectName) {
    if(ambiguousNames.containsKey(objectName)) {
      return true;
    }
    if(fields.remove(objectName) != null) {
      ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
      return true;
    }
    if(staticFields.remove(objectName) != null) {
      ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
      return true;
    }
    if(methods.remove(objectName) != null) {
      ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
      return true;
    }
    if(staticMethods.remove(objectName) != null) {
      ambiguousNames.put(objectName, new LinkedList<AccessibleObject>());
      return true;
    }
    return false;
  }

  private void addField(Field field) {
    if((field.getModifiers() & Utils.STATIC) > 0) {
      if(field.getDeclaringClass().equals(this.classObject) ) {
        if(searchAndDeleteRedundant(field.getName())) {
          ambiguousNames.get(field.getName()).add(field);
        } else {
          staticFields.put(field.getName(), field);
        }
      }
    } else {
      if(searchAndDeleteRedundant(field.getName())) {
        ambiguousNames.get(field.getName()).add(field);
      } else {
        fields.put(field.getName(), field);
      }
    }
  }

  private void addMethod(Method method) {
    if((method.getModifiers() & Utils.STATIC) > 0) {
      if(method.getDeclaringClass().equals(this.classObject) ) {
        if(searchAndDeleteRedundant(method.getName())) {
          ambiguousNames.get(method.getName()).add(method);
        } else {
          staticMethods.put(method.getName(), method);
        }
      }
    } else {
      if(searchAndDeleteRedundant(method.getName())) {
        ambiguousNames.get(method.getName()).add(method);
      } else {
        methods.put(method.getName(), method);
      }
    }
  }

  private void addConstructor(Constructor<?> constructor) {
    constructors.add(constructor);
  }
}
