package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.expressions.CastExpressionNode;
import cat.quadriga.parsers.code.expressions.ExpressionNode;
import cat.quadriga.parsers.code.expressions.dataaccess.DataAccess;
import cat.quadriga.parsers.code.expressions.dataaccess.WriteAccess;
import cat.quadriga.parsers.code.types.PrimitiveTypeRef;
import cat.quadriga.parsers.code.types.qdg.QuadrigaComponent;
import cat.quadriga.parsers.code.types.qdg.QuadrigaEntity;
import cat.quadriga.runtime.ComputedValue;
import cat.quadriga.runtime.Entity;
import cat.quadriga.runtime.RuntimeEnvironment;

public class AssigmentStatementNode extends StatementNodeClass {
  
  public final ExpressionNode leftOperand, rightOperand;
  public final Operator operator;

  public AssigmentStatementNode(Operator operator, 
                                ExpressionNode left, 
                                ExpressionNode right) {
    super(new CodeZoneClass(left, right));
    leftOperand  = left;
    rightOperand = right;
    this.operator = operator;
  }

  @Override
  public String[] getOperands() {
    String operands[] = { leftOperand.treeStringRepresentation(),
        rightOperand.treeStringRepresentation() 
       };
    return operands;
  }

  @Override
  public String getOperation() {
    return operator.toString();
  }
  
  public Operator getOperator() {
    return operator;
  }

  public static enum Operator {
    ASSIGN("="),
    PLUSASSIGN("+="),
    MINUSASSIGN("-="),
    STARASSIGN("*="),
    SLASHASSIGN("/="),
    ANDASSIGN("&="),
    ORASSIGN("|="),
    XORASSIGN("^="),
    REMASSIGN("%="),
    LSHIFTASSIGN("<<="),
    RSIGNEDSHIFTASSIGN(">>="),
    RUNSIGNEDSHIFTASSIGN(">>>=");
    
    private String representation;
    private Operator(String r) {
      representation = r;
    }
    @Override
    public String toString() {
      return representation;
    }
  }

  
  private boolean linked = false;
  private AssigmentStatementNode linkedVersion = null;
  @Override
  public AssigmentStatementNode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) return this;
    if(linkedVersion == null) {
      ExpressionNode leftOp;
      if(leftOperand.isCorrectlyLinked()) {
        leftOp = leftOperand;
      } else {
        leftOp = leftOperand.getLinkedVersion(symbolTable, errorLog);
        if(leftOp == null) {
          return null;
        }
      }
      if(leftOp instanceof DataAccess) {
        DataAccess da = (DataAccess)leftOp;
        if(da.isAssignable()) {
          leftOp = da.getWriteVersion(symbolTable);
          assert(leftOp != null);
        } else {
          errorLog.insertError("L'operand esquerra no s'hi pot escriure",leftOp);
          return null;
        }
      } else {
        errorLog.insertError("L'operand esquerra no és un accés a dades",leftOp);
        return null;
      }
      ExpressionNode rightOp;
      if(rightOperand.isCorrectlyLinked()) {
        rightOp = rightOperand;
      } else {
        rightOp = rightOperand.getLinkedVersion(symbolTable, errorLog);
        if(rightOp == null) {
          return null;
        }
      }
      if(leftOp.getType().isAssignableFrom(rightOp.getType())) {
        if(leftOp.getType() instanceof PrimitiveTypeRef && leftOp.getType() != rightOp.getType()) {
          rightOp = new CastExpressionNode(leftOp.getType(), rightOp, rightOp).getLinkedVersion(symbolTable, errorLog);
          assert(rightOp != null);
        }
        
        linkedVersion = new AssigmentStatementNode(operator, leftOp, rightOp);
        linkedVersion.linked = true;
        linkedVersion.linkedVersion = linkedVersion;
        
      } else {
        errorLog.insertError("No es pot assignar " + rightOp.getType().getBinaryName() + " a " + leftOp.getType().getBinaryName(),this);
        return null;
      }
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
    
    ComputedValue result = rightOperand.compute(runtime);
    if(operator != Operator.ASSIGN) {
      throw new IllegalStateException("Not yet implemented " + this.getClass().getCanonicalName());
    }
    
    WriteAccess writeTo = (WriteAccess) leftOperand;
    
    if(writeTo.getType() instanceof QuadrigaEntity) {
      QuadrigaEntity qe = (QuadrigaEntity) writeTo.getType();
      Entity resEntity = (Entity) result;
      for(QuadrigaComponent qc : qe.catchedComponents) {
        resEntity.cacheComponent(qc);
      }
      result = resEntity;
    }
    
    writeTo.setValue(result, runtime);
  }
}
