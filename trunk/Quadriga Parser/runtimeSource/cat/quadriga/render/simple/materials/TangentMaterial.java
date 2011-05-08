package cat.quadriga.render.simple.materials;

import static org.lwjgl.opengl.GL11.GL_FLOAT;
import static org.lwjgl.opengl.GL20.glEnableVertexAttribArray;
import static org.lwjgl.opengl.GL20.glVertexAttribPointer;

import javax.vecmath.Matrix4f;

import cat.quadriga.render.simple.RenderManager;
import cat.quadriga.render.simple.VertexType;

public class TangentMaterial extends MaterialDecorator {
  public int tangent;
  public int bitangent;

  public TangentMaterial(BaseMaterial base) {
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
    glEnableVertexAttribArray(tangent);
    glEnableVertexAttribArray(bitangent);
    glVertexAttribPointer(
        tangent, 
        3, 
        GL_FLOAT, 
        false, 
        vt.getVertexSize(), 
        vt.getTangentStride());
    glVertexAttribPointer(
        bitangent, 
        3, 
        GL_FLOAT, 
        false, 
        vt.getVertexSize(), 
        vt.getBitangentStride());
    
    preRenderShortcut.preRender(vt, worldMatrix, rm);
  }

}
