package cat.quadriga.render.simple.materials;

import static org.lwjgl.opengl.GL20.glUniformMatrix4;

import java.nio.FloatBuffer;

import javax.vecmath.Matrix4f;

import org.lwjgl.BufferUtils;

import cat.quadriga.render.simple.RenderManager;
import cat.quadriga.render.simple.VertexType;

public class WorldViewMatrixMaterial extends MaterialDecorator {
  public int worldView;
  private Matrix4f auxMatrix = new Matrix4f();
  private FloatBuffer fb = BufferUtils.createFloatBuffer(16);

  public WorldViewMatrixMaterial(BaseMaterial base) {
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
    auxMatrix.setIdentity();
    rm.getProjectionMatrix(auxMatrix);
    auxMatrix.mul(worldMatrix);
    RenderManager.matrixToBuffer(auxMatrix, fb);
    RenderManager.matrixToBuffer(auxMatrix, fb);
    glUniformMatrix4(worldView, false, fb);
    
    preRenderShortcut.preRender(vt, worldMatrix, rm);
  }

}
