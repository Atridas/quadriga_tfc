package cat.quadriga.parsers.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ErrorLog {

  public boolean writeClasses = false;
  
  private final List<Error>   errors   = new ArrayList<Error>();
  private final List<Warning> warnings = new ArrayList<Warning>();

  public void insertError(String error, CodeZone cz) {
    errors.add(new Error(cz, error+getCallingMethod()));
  }

  public void insertWarning(String warning, CodeZone cz) {
    warnings.add(new Warning(cz, warning+getCallingMethod()));
  }

  public List<Error> getErrors() {
    return Collections.unmodifiableList(errors);
  }
  public List<Warning> getWarning() {
    return Collections.unmodifiableList(warnings);
  }
  
  public String print() {
    StringBuilder sb = new StringBuilder();
    for(Error error : errors) {
      sb.append("**Error: ");
      sb.append(error.stringError);
      sb.append("\n  ");

      sb.append("From line:");
      sb.append(error.beginLine);
      sb.append(" column:");
      sb.append(error.beginColumn);
      sb.append(" To line:");
      sb.append(error.endLine);
      sb.append(" column:");
      sb.append(error.endColumn);
      sb.append("\n  \"");
      
      sb.append(error.file);
      sb.append("\"\n");
    }
    for(Warning warning : warnings) {
      sb.append("* Warning: ");
      sb.append(warning.stringWarning);
      sb.append("\n  ");

      sb.append("From line:");
      sb.append(warning.beginLine);
      sb.append(" column:");
      sb.append(warning.beginColumn);
      sb.append(" To line:");
      sb.append(warning.endLine);
      sb.append(" column:");
      sb.append(warning.endColumn);
      sb.append("\n  \"");
      
      sb.append(warning.file);
      sb.append("\"\n");
    }
    return sb.toString();
  }

  public class Error extends CodeZoneClass {
    public final String stringError;
    
    Error(CodeZone cz, String str) {
      super(cz);
      stringError = str;
    }
  }
  public class Warning extends CodeZoneClass {
    public final String stringWarning;
    
    Warning(CodeZone cz, String str) {
      super(cz);
      stringWarning = str;
    }
  }
  
  private String getCallingMethod() {
    if(!writeClasses) return "";
    String res = " [";
    try {
      throw new Exception();
    } catch (Exception e) {
      if(e.getStackTrace().length < 3) {
        return "";
      }
      StackTraceElement aux = e.getStackTrace()[2];
      res += aux.getClassName();
    }
    return res + "]";
  }
}
