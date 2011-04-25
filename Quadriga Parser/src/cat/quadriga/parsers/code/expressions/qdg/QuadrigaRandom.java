package cat.quadriga.parsers.code.expressions.qdg;

import java.util.Random;

import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNodeClass;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.NullType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.JavaReference;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class QuadrigaRandom extends ExpressionNodeClass {

  public QuadrigaRandom(CodeZone cz) {
    super(cz);
  }

  @Override
  public String[] getOperands() {
    String[] aux = {};
    return aux;
  }

  @Override
  public String getOperation() {
    return "RND";
  }

  @Override
  public BaseType getType() {
    return Utils.createType(Random.class);
  }
  @Override
  public QuadrigaRandom getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    return this;
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
  public ComputedValue compute(RuntimeEnvironment runtime) {
    return new JavaReference( runtime.rnd.get() );
  }
}