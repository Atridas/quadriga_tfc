package cat.quadriga.parsers.code.statements;

import java.util.List;

import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.printers.MegaPrinter;
import cat.quadriga.parsers.code.printers.PrintInfo;

public class ProxyStatement extends StatementNode {

  private String treeStringRepresentation;
  
  public ProxyStatement(List<PrintInfo> in) {
    super(0, 0, 0, 0);
    
    treeStringRepresentation = 
      Utils.treeStringRepresentation(">> Proxy Statement: ",
          MegaPrinter.getInstance().print(in).split("\n")
                                    ) + "\n<<";
  }

  @Override
  public String treeStringRepresentation() {
    return treeStringRepresentation;
  }

}
