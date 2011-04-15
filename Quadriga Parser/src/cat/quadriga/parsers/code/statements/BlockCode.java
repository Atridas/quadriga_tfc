package cat.quadriga.parsers.code.statements;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.BreakException;
import cat.quadriga.parsers.code.BreakOrContinueException;
import cat.quadriga.parsers.code.CodeZone;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.SymbolTable;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.symbols.LocalVariableSymbol;
import cat.quadriga.parsers.code.types.BaseType;
import cat.quadriga.runtime.RuntimeEnvironment;

public class BlockCode extends StatementNodeClass {

  public List<LocalVariableSymbol> localVariables;
  public List<StatementNode> statements;
  
  private BlockCode(List<LocalVariableSymbol> localVariables,
                    List<StatementNode> statements,
                    CodeZone cz) {
    super(cz);
    this.localVariables = new Vector<LocalVariableSymbol>(localVariables);
    this.statements     = new Vector<StatementNode>(statements);
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
  @Override
  public BlockCode getLinkedVersion(SymbolTable symbolTable,
      ErrorLog errorLog) {
    if(linked) return this;
    linked = true;

    symbolTable.newContext();
    for(int i = 0; i < localVariables.size(); ++i) {
      
      LocalVariableSymbol localVariableSymbol = localVariables.get(i);
      
      if(localVariableSymbol.type.isValid()) {
        symbolTable.addSymbol(localVariableSymbol);
      } else {
        BaseType type = localVariableSymbol.type.getValid(symbolTable, errorLog);
        if(type == null) {
          linked = false;
        } else {
          localVariableSymbol.type = type;
        }
        symbolTable.addSymbol(localVariableSymbol);
      }
    }
    
    
    for(int i = 0; i < statements.size(); ++i) {
      StatementNode stmt = statements.get(i);
      
      if(!stmt.isCorrectlyLinked()) {
        StatementNode newStatement = stmt.getLinkedVersion(symbolTable, errorLog);
        if(newStatement == null) {
          linked = false;
        } else {
          statements.set(i, newStatement);
        }
      }
    }
      
      
    symbolTable.deleteContext();
    
    if(linked) return this;
    else       return null;
  }

  @Override
  public boolean isCorrectlyLinked() {
    return linked;
  }
  

  @Override
  public void execute(RuntimeEnvironment runtime) throws BreakOrContinueException {
    execute(runtime, Collections.<LocalVariableSymbol>emptySet());
  }

  public void execute(RuntimeEnvironment runtime, Set<LocalVariableSymbol> varsToSkip) throws BreakOrContinueException {
    try {
      assert isCorrectlyLinked();
      
      runtime.newLocalContext();
      
      for(LocalVariableSymbol lvs : localVariables) {
        if(!varsToSkip.contains(lvs)) {
          runtime.putLocalVariable(lvs, null);
        }
      }
      
      try {
        for(StatementNode statement : statements) {
          statement.execute(runtime);
        }
      } catch (BreakException e) {
        if(e.tobreak != this) {
          runtime.deleteLocalContext();
          throw e;
        }
      }
  
      runtime.deleteLocalContext();
    } catch (BreakOrContinueException e) {
      throw e;
    } catch (Exception e) {
      throw new RuntimeException("Error in " 
          + beginLine + ":" + beginColumn + " "
          + endLine + ":" + endColumn + " " + file, e);
    }
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
