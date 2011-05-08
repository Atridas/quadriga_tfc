package cat.quadriga.render.simple.materials;

import static org.lwjgl.opengl.GL11.GL_FLOAT;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glVertexAttribPointer;

import javax.vecmath.Matrix4f;

import cat.quadriga.render.simple.RenderManager;
import cat.quadriga.render.simple.VertexType;

public class ColorMaterial extends MaterialDecorator {
  public int color;

  public ColorMaterial(BaseMaterial base) {
    super(base);
  }
  
  @Override
  public BaseMaterial activateShortcut() {
    return activateShortcut;
  }

  @Override
  public void activate() {
    activateShortcut.activate();
  }

  @Override
  public void preRender(VertexType vt, Matrix4f worldMatrix, RenderManager rm) {
    glEnableVertexAttribArray(color);
    glVertexAttribPointer(
        color, 
        3, 
        GL_FLOAT, 
        false, 
        vt.getVertexSize(), 
        vt.getColorStride());
    
    preRenderShortcut.preRender(vt, worldMatrix, rm);
  }

}
