package cat.quadriga.parsers.code;

import java.util.List;

public class MegaPrinter {
  private int tabLen = 0;

  private void print(PrintString input, StringBuilder out) {
    out.append(input.text);
  }
  
  private void print(PrintIntro input, StringBuilder out) {
    out.append("\n");
    for(int i = 0; i < tabLen; i++)
      out.append("  ");
  }
  
  private void print(PrintInitTab input, StringBuilder out) {
    tabLen--;
  }
  
  private void print(PrintEndTab input, StringBuilder out) {
    tabLen++;
  }
  
  public String print(List<PrintInfo> input) {
    StringBuilder out = new StringBuilder();
    
    for(PrintInfo token: input) {
      if(token instanceof PrintString) {
        print((PrintString) token, out);
      } else if(token instanceof PrintIntro) {
        print((PrintIntro) token, out);
      } else if(token instanceof PrintInitTab) {
        print((PrintInitTab) token, out);
      } else if(token instanceof PrintEndTab) {
        print((PrintEndTab) token, out);
      } else {
        //?
      }
    }
    
    return out.toString();
  }
}
