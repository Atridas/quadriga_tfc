package cat.quadriga.parsers.code.statements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;

public class TryStatementNode extends StatementNodeClass {
  
  public final BlockCode block;
  public final List<CatchBlock> catches;
  public final BlockCode finalment;

  public TryStatementNode(BlockCode block, 
                          List<CatchBlock> catches,
                          BlockCode finalment,
                          CodeZone cz) {
    super(cz);
    this.block = block;
    this.catches = Collections.unmodifiableList(new ArrayList<CatchBlock>(catches));
    this.finalment = finalment;
  }

  private String treeStringRepresentation;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation == null) {
      List<String> operands = new LinkedList<String>();
      operands.add(block.treeStringRepresentation());
      for(CatchBlock catx : catches) {
        operands.add(
            Utils.treeStringRepresentation("catch {" + catx.exception + "}", 
                catx.code.treeStringRepresentation())
                    );
      }
      if(finalment != null) {
        operands.add(
            Utils.treeStringRepresentation("finally",
                finalment.treeStringRepresentation())
                    );
      }
      
      String operator;
      if(operands.size() == 1) {
        operator ="Wrong formed try";
      } else {
        operator ="try";
      }
      treeStringRepresentation = Utils.treeStringRepresentation(
                                        operator,
                                        operands.toArray(new String[operands.size()])
                                        );
    }
    return treeStringRepresentation;
  }

  public final static class CatchBlock {
    public final LocalVariableSymbol exception;
    public final BlockCode code;
    
    public CatchBlock(LocalVariableSymbol exception, BlockCode code) {
      this.exception = exception;
      this.code = code;
    }
  }

  @Override
  public StatementNodeClass getLinkedVersion(SymbolTable symbolTable,
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
