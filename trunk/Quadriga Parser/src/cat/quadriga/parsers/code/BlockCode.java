package cat.quadriga.parsers.code;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.statements.BlockStatementNode;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;

public class BlockCode extends CodeZone {

  public final List<LocalVariableSymbol> localVariables;
  public final List<BlockStatementNode> statements;
  
  private BlockCode(int beginLine, int beginColumn, 
                    int endLine, int endColumn,
                    List<LocalVariableSymbol> localVariables,
                    List<BlockStatementNode> statements) {
    super(beginLine, beginColumn, endLine, endColumn);
    this.localVariables = Collections.unmodifiableList(localVariables);
    this.statements     = Collections.unmodifiableList(statements);
  }
  
  private String treeStringRepresentation = null;
  public String treeStringRepresentation() {
    if(treeStringRepresentation != null) {
      return treeStringRepresentation;
    }
    
    String varr[] = new String[localVariables.size()];
    int i = 0;
    for(LocalVariableSymbol v : localVariables) {
      varr[i++] = v.name;
    }
    
    String vars = Utils.treeStringRepresentation("Local Variables:", 
                                                  varr);

    String carr[] = new String[statements.size()];
    i = 0;
    for(BlockStatementNode c : statements) {
      carr[i++] = c.treeStringRepresentation();
    }
    String code = Utils.treeStringRepresentation("Code:", 
                                                  carr);
    
    String aux[] = {vars, code};
    
    treeStringRepresentation = Utils.treeStringRepresentation("Block:",aux);
    
    return treeStringRepresentation;
  }
  
  
  public static final class TmpBlockCode {
    private int beginLine, beginColumn, endLine, endColumn;
    private final List<LocalVariableSymbol> localVariables;
    private final List<BlockStatementNode> statements;
    public TmpBlockCode(Token t) {
      beginLine   = endLine   = t.beginLine;
      beginColumn = endColumn = t.beginColumn;
      
      localVariables = new LinkedList<LocalVariableSymbol>();
      statements     = new LinkedList<BlockStatementNode>();
    }
    
    public void setEndToken(Token t) {
      endLine   = t.endLine;
      endColumn = t.endColumn;
    }

    public void addLocalVariable(LocalVariableSymbol local) {
      localVariables.add(local);
    }
    public void addStatement(BlockStatementNode statement) {
      statements.add(statement);
    }
    
    public BlockCode transformToBlockCode() {
      return new BlockCode( beginLine, beginColumn, 
                            endLine, endColumn,
                            localVariables, statements);
    }
  }
}
