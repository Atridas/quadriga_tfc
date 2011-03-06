package cat.quadriga.parsers.code.statements;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;

public class BlockCode extends StatementNodeClass {

  public final List<LocalVariableSymbol> localVariables;
  public final List<StatementNode> statements;
  
  private BlockCode(List<LocalVariableSymbol> localVariables,
                    List<StatementNode> statements,
                    CodeZone cz) {
    super(cz);
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
      varr[i++] = v.treeStringRepresentation();
    }
    
    String vars = Utils.treeStringRepresentation("Local Variables:", 
                                                  varr);

    String carr[] = new String[statements.size()];
    i = 0;
    for(StatementNode c : statements) {
      carr[i++] = c.treeStringRepresentation();
    }
    String code = Utils.treeStringRepresentation("Code:", 
                                                  carr);
    
    if(localVariables.size() == 0) {
      String aux[] = {code};
      treeStringRepresentation = Utils.treeStringRepresentation("Block:",aux);
    } else {
      String aux[] = {vars, code};
      treeStringRepresentation = Utils.treeStringRepresentation("Block:",aux);
    }
    
    return treeStringRepresentation;
  }
  
  
  public static final class TmpBlockCode {
    private int beginLine, beginColumn, endLine, endColumn;
    public final List<LocalVariableSymbol> localVariables;
    public final List<StatementNode> statements;
    
    public TmpBlockCode(Token t) {
      beginLine   = endLine   = t.beginLine;
      beginColumn = endColumn = t.beginColumn;
      
      localVariables = new LinkedList<LocalVariableSymbol>();
      statements     = new LinkedList<StatementNode>();
    }
    
    public TmpBlockCode() {
      beginLine   = endLine   = 
      beginColumn = endColumn = 0;
      
      localVariables = new LinkedList<LocalVariableSymbol>();
      statements     = new LinkedList<StatementNode>();
    }
    
    public void setEndToken(Token t) {
      endLine   = t.endLine;
      endColumn = t.endColumn;
    }
    
    public void setEndCode(CodeZone cz) {
      endLine   = cz.endLine();
      endColumn = cz.endColumn();
    }

    public void addLocalVariable(LocalVariableSymbol local) {
      localVariables.add(local);
    }
    public void addStatement(StatementNode statement) {
      statements.add(statement);
    }
    
    public BlockCode transformToBlockCode() {
      return new BlockCode( localVariables, statements, 
          new CodeZoneClass(beginLine, beginColumn, 
                            endLine, endColumn)
      );
    }
  }
}
