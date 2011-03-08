package cat.quadriga.java.base;

import javax.vecmath.Color3f;

public class ColorUtils {
  public final static Color3f RED   = new Color3f(1,0,0);
  public final static Color3f GREEN = new Color3f(0,1,0);
  public final static Color3f BLUE  = new Color3f(0,0,1); 
  
  public static Color3f getHSV(float h, float s, float v) {
    return new Color3f(h,s,v);
  }
}
