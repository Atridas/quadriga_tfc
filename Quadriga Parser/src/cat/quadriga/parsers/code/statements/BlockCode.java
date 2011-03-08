package cat.quadriga.parsers.code.statements;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.BaseType;

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

  @Override
  public String[] getOperands() {
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
      return aux;
    } else {
      String aux[] = {vars, code};
      return aux;
    }
  }

  @Override
  public String getOperation() {
    return "Block";
  }
  
  
  private boolean linked = false;
  private BlockCode linkedVersion = null;
  @Override
  public BlockCode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) {
      return this;
    } if(linkedVersion == null) {
      TmpBlockCode tmp = new TmpBlockCode(this);
      symbolTable.newContext();
      for(LocalVariableSymbol localVariableSymbol : localVariables) {
        if(localVariableSymbol.type.isValid()) {
          tmp.addLocalVariable(localVariableSymbol);
          symbolTable.addSymbol(localVariableSymbol);
        } else {
          BaseType type = localVariableSymbol.type.getValid(symbolTable, errorLog);
          if(type != null) {
            break;
          }
          LocalVariableSymbol lvs = new LocalVariableSymbol(
              localVariableSymbol.modifiers, 
              type, 
              localVariableSymbol.name
              );
          tmp.addLocalVariable(lvs);
          symbolTable.addSymbol(lvs);
        }
      }
      
      if(tmp.localVariables.size() == localVariables.size()) {
        for(StatementNode stmt : statements) {
          if(stmt.isCorrectlyLinked()) {
            tmp.addStatement(stmt);
          } else {
            StatementNode newStatement = stmt.getLinkedVersion(symbolTable, errorLog);
            if(newStatement == null) {
              break;
            } else {
              tmp.addStatement(newStatement);
            }
          }
        }
        if(tmp.statements.size() == statements.size()) {
          linkedVersion = tmp.transformToBlockCode();
          linkedVersion.linkedVersion = linkedVersion;
          linkedVersion.linked = true;
        }
      }
      
      symbolTable.deleteContext();
    }
    return linkedVersion;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }
  
  
  public static final class TmpBlockCode {
    private int beginLine, beginColumn, endLine, endColumn;
    private final String file;
    public final List<LocalVariableSymbol> localVariables;
    public final List<StatementNode> statements;
    
    public TmpBlockCode(Token t, String file) {
      beginLine   = endLine   = t.beginLine;
      beginColumn = endColumn = t.beginColumn;
      this.file = file;
      
      localVariables = new LinkedList<LocalVariableSymbol>();
      statements     = new LinkedList<StatementNode>();
    }
    
    public TmpBlockCode(String file) {
      beginLine   = endLine   = 
      beginColumn = endColumn = 0;
      this.file = file;
      
      localVariables = new LinkedList<LocalVariableSymbol>();
      statements     = new LinkedList<StatementNode>();
    }
    
    private TmpBlockCode(CodeZone cz) {
      beginLine   = cz.beginLine();
      endLine     = cz.endLine();
      beginColumn = cz.beginColumn();
      endColumn   = cz.endColumn();
      file        = cz.file();
      
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
                            endLine, endColumn, file)
      );
    }
  }
}
