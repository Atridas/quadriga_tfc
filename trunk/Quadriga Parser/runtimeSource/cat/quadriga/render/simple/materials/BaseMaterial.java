package cat.quadriga.render.simple.materials;

import javax.vecmath.Matrix4f;

import cat.quadriga.render.simple.RenderManager;
import cat.quadriga.render.simple.VertexType;

public abstract class BaseMaterial {
  
  public abstract void activate();
  public abstract void preRender(VertexType vt, Matrix4f worldMatrix, RenderManager rm);

  BaseMaterial activateShortcut() {
    return this;
  }
  BaseMaterial preRenderShortcut() {
    return this;
  }
}
