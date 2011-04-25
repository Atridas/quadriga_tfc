package cat.quadriga.parsers.code.expressions;

import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.dataaccess.LiteralData;
import cat.quadriga.parsers.code.expressions.dataaccess.WriteAccess;
import cat.quadriga.parsers.code.statements.AssigmentStatementNode;
import cat.quadriga.parsers.code.statements.AssigmentStatementNode.Operator;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;

public final class AssigmentExpressionNode extends BinaryExpressionNode {

  public final AssigmentStatementNode statementEquivalent;
  
  public AssigmentExpressionNode(Operator operator, ExpressionNode left, ExpressionNode right) {
    super(left, right);

    statementEquivalent = new AssigmentStatementNode(operator, left, right);
  }

  @Override
  public String getOperation() {
    return statementEquivalent.getOperator().toString();
  }

  @Override
  public BaseType getType() {
    return statementEquivalent.leftOperand.getType();
  }

  private AssigmentExpressionNode(AssigmentStatementNode asn) {
    super(asn.leftOperand, asn.rightOperand);
    statementEquivalent = asn;
  }
  
  private AssigmentExpressionNode linkedVersion = null;
  @Override
  public AssigmentExpressionNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(isCorrectlyLinked()) {
      return this;
    } else if(linkedVersion == null) {
      AssigmentStatementNode asn = statementEquivalent.getLinkedVersion(symbolTable, errorLog);
      if(asn == null) {
        return null;
      }
      linkedVersion = new AssigmentExpressionNode(asn);
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return statementEquivalent.isCorrectlyLinked();
  }

  @Override
  public LiteralData getCompileTimeConstant() {
    return null;
  }


  @Override
  public ComputedValue compute(RuntimeEnvironment runtime) {
    assert isCorrectlyLinked();
    
    try {
      try {
        ComputedValue result = rightOperand.compute(runtime);
        if(statementEquivalent.operator != Operator.ASSIGN) {
          throw new IllegalStateException("Not yet implemented " + this.getClass().getCanonicalName());
        }
        
        WriteAccess writeTo = (WriteAccess) leftOperand;
        
        if(writeTo.getType() instanceof QuadrigaEntity) {
          QuadrigaEntity qe = (QuadrigaEntity) writeTo.getType();
          if(result instanceof Entity) {
            Entity resEntity = (Entity) result;
            for(QuadrigaComponent qc : qe.catchedComponents) {
              resEntity.cacheComponent(qc);
            }
            result = resEntity;
          }
        }
        
        writeTo.setValue(result, runtime);
        return result;
      } catch (Exception e) {
        throw new RuntimeException("Error in " 
            + beginLine + ":" + beginColumn + " "
            + endLine + ":" + endColumn + " " + file, e);
      }
    } catch (Exception e) {
      throw new RuntimeException("Error in " 
          + beginLine + ":" + beginColumn + " "
          + endLine + ":" + endColumn + " " + file, e);
    }
  }
  
}
