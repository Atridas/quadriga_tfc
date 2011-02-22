package cat.quadriga.parsers.code.statements;

import cat.quadriga.parsers.Token;
import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.ErrorLog;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.symbols.LabelSymbol;
import cat.quadriga.parsers.code.symbols.SymbolTable;

public class LabeledStatementNode extends StatementNode {
  
  public final LabelSymbol label;
  public final StatementNode statement;

  public LabeledStatementNode(Token label, StatementNode statement, SymbolTable st, ErrorLog errorLog) {
    super(new CodeZoneClass(label, statement));

    if(st.findSymbolOnTop(label.image) != null) {
      errorLog.insertError("Identificador \"" + label.image + "\" repetit.", this);
    }
    
    this.label = new LabelSymbol(label.image);
    this.statement = statement;
  }

  private String treeStringRepresentation = null;
  @Override
  public String treeStringRepresentation() {
    if(treeStringRepresentation != null) {
      return treeStringRepresentation;
    }
    String[] aux = {statement.treeStringRepresentation()};
    return
           treeStringRepresentation = Utils.treeStringRepresentation(
                                          "LABEL: " + label.name,
                                           aux);
    
  }

}
