package cat.quadriga.render.simple.materials;

import static org.lwjgl.opengl.GL20.glUniform1i;

import javax.vecmath.Matrix4f;

import cat.quadriga.render.simple.RenderManager;
import cat.quadriga.render.simple.VertexType;

public class TextureUnitMaterial extends MaterialDecorator {
  public int textureUnit;
  public int textureUniform;

  public TextureUnitMaterial(BaseMaterial base) {
    super(base);
  }
  
  @Override
  public BaseMaterial activateShortcut() {
    return activateShortcut;
  }
  
  @Override
  public BaseMaterial cleanUpShortcut() {
    return cleanUpShortcut;
  }

  @Override
  public void cleanUp() {
    cleanUpShortcut.activate();
  }

  @Override
  public void activate() {
    activateShortcut.activate();
  }

  @Override
  public void preRender(VertexType vt, Matrix4f worldMatrix, RenderManager rm) {
    glUniform1i(textureUniform, textureUnit);
    
    preRenderShortcut.preRender(vt, worldMatrix, rm);
  }
}
