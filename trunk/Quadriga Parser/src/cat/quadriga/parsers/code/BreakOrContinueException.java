package cat.quadriga.parsers.code;

import cat.quadriga.parsers.code.statements.BucleOrSwitchInterface;

public abstract class BreakOrContinueException extends Exception {
  
  private static final long serialVersionUID = -5217196280283827476L;
  
  public final BucleOrSwitchInterface tobreak;

  protected BreakOrContinueException(BucleOrSwitchInterface tobreak) {
    this.tobreak = tobreak;
  }

}
