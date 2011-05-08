package cat.quadriga.render.simple.materials;

import static org.lwjgl.opengl.GL11.GL_FLOAT;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glVertexAttribPointer;

import javax.vecmath.Matrix4f;

import cat.quadriga.render.simple.RenderManager;
import cat.quadriga.render.simple.VertexType;

public class TextureCoords2Material extends MaterialDecorator {
  public int tex2;

  public TextureCoords2Material(BaseMaterial base) {
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
    glEnableVertexAttribArray(tex2);
    glVertexAttribPointer(
        tex2, 
        2, 
        GL_FLOAT, 
        false, 
        vt.getVertexSize(), 
        vt.getST2Stride());
    
    preRenderShortcut.preRender(vt, worldMatrix, rm);
  }

}
