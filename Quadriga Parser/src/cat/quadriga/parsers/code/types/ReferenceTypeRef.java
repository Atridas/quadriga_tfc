package cat.quadriga.parsers.code.types;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.FieldAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.FieldOrMethodAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.MethodAccess;
import cat.quadriga.parsers.code.proxy.ProxyDataAccess;

public abstract class ReferenceTypeRef extends JavaType {
  
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
      return new FieldOrMethodAccess(name, this, reference, cz);
    }
    
    Field field = fields.get(name);
    if(field != null) {
      return new FieldAccess(reference, field, cz);
    }
    
    List<Method> methodList = methods.get(name);
    if(methodList != null) {
      return new MethodAccess(reference, methodList.toArray(new Method[methodList.size()]), cz);
    }

    return new ProxyDataAccess(name,this.classObject,cz);
  }
  
  public DataAccess getAccessAsField(String name, CodeZone cz) {
    return getAccessAsField(null, name, cz);
  }
    
  public DataAccess getAccessAsField(ExpressionNode reference, String name, CodeZone cz) {
    List<AccessibleObject> ambiguous = ambiguousNames.get(name);
    if(ambiguous != null) {
      for(AccessibleObject field : ambiguous) {
        if(field instanceof Field)
          return new FieldAccess(reference,(Field)field,cz);
      }
    }
    Field field = fields.get(name);
    if(field != null) {
      return new FieldAccess(reference, field, cz);
    }
    return new ProxyDataAccess(name,this.classObject,cz);
  }
  
  public DataAccess getAccessAsMethod(String name, CodeZone cz) {
    return getAccessAsMethod(null, name, cz);
  }
    
  public DataAccess getAccessAsMethod(ExpressionNode reference, String name, CodeZone cz) {
    List<AccessibleObject> ambiguous = ambiguousNames.get(name);
    if(ambiguous != null) {
      List<Method> methodList = new LinkedList<Method>();
      for(AccessibleObject method : ambiguous) {
        if(method instanceof Method) {
          methodList.add((Method)method);
        }
        return new MethodAccess(reference,methodList.toArray(new Method[methodList.size()]),cz);
      }
    }
    List<Method> methodList = methods.get(name);
    if(methodList != null) {
      return new MethodAccess(reference, methodList.toArray(new Method[methodList.size()]), cz);
    }
    return new ProxyDataAccess(name,this.classObject,cz);
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
  
  
  public List<Constructor<?>> getConstuctors() {
    return Collections.unmodifiableList(constructors);
  }
  
  public PrimitiveTypeRef toPrimitiveType() {
    if("Ljava.lang.Void;".compareTo(getBinaryName()) == 0 ) {
      return PrimitiveTypeRef.getFromName("void");
    }
    if("Ljava.lang.Void;".compareTo(getBinaryName()) == 0 ) {
      return PrimitiveTypeRef.getFromName("void");
    }
    if("Ljava.lang.Integer;".compareTo(getBinaryName()) == 0 ) {
      return PrimitiveTypeRef.getFromName("int");
    }
    if("Ljava.lang.Long;".compareTo(getBinaryName()) == 0 ) {
      return PrimitiveTypeRef.getFromName("long");
    }
    if("Ljava.lang.Short;".compareTo(getBinaryName()) == 0 ) {
      return PrimitiveTypeRef.getFromName("short");
    }
    if("Ljava.lang.Char;".compareTo(getBinaryName()) == 0 ) {
      return PrimitiveTypeRef.getFromName("char");
    }
    if("Ljava.lang.Byte;".compareTo(getBinaryName()) == 0 ) {
      return PrimitiveTypeRef.getFromName("byte");
    }
    if("Ljava.lang.Float;".compareTo(getBinaryName()) == 0 ) {
      return PrimitiveTypeRef.getFromName("float");
    }
    if("Ljava.lang.Double;".compareTo(getBinaryName()) == 0 ) {
      return PrimitiveTypeRef.getFromName("double");
    }
    return null;
  }
  
  @Override
  public boolean isMathematicallyOperable() {
    PrimitiveTypeRef aux = toPrimitiveType();
    if(aux == null) {
      return false;
    }
    return aux.isMathematicallyOperable(); 
  }

  @Override
  public BaseType getMathematicResultType(BaseType other) {
    PrimitiveTypeRef aux = toPrimitiveType();
    if(aux == null) {
      return UnknownType.empty;
    }
    return aux.getMathematicResultType(other);
  }
  
  @Override
  public abstract ReferenceTypeRef getValid(SymbolTable symbolTable, ErrorLog errorLog);
}
