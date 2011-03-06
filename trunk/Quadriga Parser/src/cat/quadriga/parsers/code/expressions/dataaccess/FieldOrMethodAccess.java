package cat.quadriga.parsers.code.expressions.dataaccess;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.ReferenceTypeRef;
import cat.quadriga.parsers.code.types.UnknownType;

public final class FieldOrMethodAccess extends MemberAccess {
  
  public final ExpressionNode reference;
  public final ReferenceTypeRef type;
  public final String name;

  public FieldOrMethodAccess(String name, ReferenceTypeRef type, ExpressionNode reference, CodeZone cz) {
    super(name, type.classObject, cz);
    this.name = name;
    this.type = type;
    this.reference = reference;
  }

  @Override
  public BaseType getType() {
    return UnknownType.empty;
  }

  public DataAccess getAsMethod() {
    return type.getAccessAsMethod(reference, name, this);
  }

  public DataAccess getAsField() {
    return type.getAccessAsField(reference, name, this);
  }

  @Override
  public FieldOrMethodAccess getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    // TODO Auto-generated method stub
    return false;
  }
}
