package cat.quadriga.java.base;

import javax.vecmath.Color3f;

public class MaterialUnshadedColor extends BaseMaterial {
  public Color3f color;
  
  public MaterialUnshadedColor(Color3f color) {
    this.color = color;
  }
}
