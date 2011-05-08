package cat.quadriga.render.simple.materials;

import javax.vecmath.Matrix4f;

import cat.quadriga.render.simple.RenderManager;
import cat.quadriga.render.simple.ShaderObject;
import cat.quadriga.render.simple.VertexType;

public final class ShaderMaterial extends BaseMaterial {
  public ShaderObject shader;

  @Override
  public void activate() {
    shader.activate();
  }

  @Override
  public void cleanUp() {
    shader.cleanUp();
  }

  @Override
  public void setParameter(String parameterName, Object param) { }

  @Override
  public void preRender(VertexType vt, Matrix4f worldMatrix, RenderManager rm) {}

  @Override
  public boolean hasParameters() {
    return false;
  }
}
