package cat.quadriga.java.base;

import javax.vecmath.Color3f;

public class ColorUtils {
  public static Color3f getHSV(float h, float s, float v) {
    return new Color3f(h,s,v);
  }
}
