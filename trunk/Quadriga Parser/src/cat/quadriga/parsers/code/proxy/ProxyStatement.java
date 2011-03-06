package cat.quadriga.parsers.code.proxy;

import java.util.List;

import cat.quadriga.parsers.code.CodeZoneClass;
import cat.quadriga.parsers.code.Utils;
import cat.quadriga.parsers.code.printers.MegaPrinter;
import cat.quadriga.parsers.code.printers.PrintInfo;
import cat.quadriga.parsers.code.statements.StatementNodeClass;

public class ProxyStatement extends StatementNodeClass {

  private String treeStringRepresentation;
  
  public ProxyStatement(List<PrintInfo> in) {
    super(new CodeZoneClass(0,0,0,0,""));
    
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
