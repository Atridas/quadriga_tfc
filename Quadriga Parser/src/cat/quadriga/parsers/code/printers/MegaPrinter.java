package cat.quadriga.parsers.code.printers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MegaPrinter {
  private int tabLen = 0;
  private boolean printedWhiteSpace = false;

  private void print(PrintString input, StringBuilder out) {
    out.append(input.text);
    printedWhiteSpace = false;
  }
  
  private void print(PrintIntro input, StringBuilder out) {
    out.append("\n");
    for(int i = 0; i < tabLen; i++)
      out.append("  ");
    printedWhiteSpace = true;
  }
  
  private void print(PrintInitTab input, StringBuilder out) {
    tabLen++;
  }
  
  private void print(PrintEndTab input, StringBuilder out) {
    tabLen--;
  }
  
  private void print(PrintWhiteSpace input, StringBuilder out) {
    if(printedWhiteSpace)
      return;
    out.append(" ");
    printedWhiteSpace = true;
  }
  
  public String print(List<PrintInfo> input) {
    StringBuilder out = new StringBuilder();
    
    for(PrintInfo token: input) {
      if(token instanceof PrintString) {
        print((PrintString) token, out);
      } else if(token instanceof PrintWhiteSpace) {
        print((PrintWhiteSpace) token, out);
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
  
  public void printToFile(List<PrintInfo> input, String file) {
    try {
      OutputStream os = new FileOutputStream(file);
      os.write(print(input).getBytes("UTF-8"));
      
      os.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public List<PrintInfo> format(String in) {
    String[] lines = in.split("\n");
    List<PrintInfo> out = new ArrayList<PrintInfo>(lines.length);

    for(int i = 0; i < lines.length; i++)
    {
      if(i != 0) {
        out.add(PrintIntro.getInstance());
      }
      out.add( new PrintString(lines[i]) );
    }
    return out;
  }
  
  private static MegaPrinter instance = new MegaPrinter();
  private MegaPrinter() {};
  public static MegaPrinter getInstance() {
    return instance;
  }
}
