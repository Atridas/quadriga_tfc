package cat.quadriga.java.base;

import javax.vecmath.Color3f;

public class MaterialUnshadedColor extends BaseMaterial {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  public Color3f color;
  
  public MaterialUnshadedColor(Color3f color) {
    this.color = color;
  }
}
