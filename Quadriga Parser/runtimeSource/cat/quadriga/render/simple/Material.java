package cat.quadriga.render.simple;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

import javax.vecmath.Matrix4f;

import static org.lwjgl.opengl.GL11.*;

public class Material {
  public ShaderObject shader;
  //attributes
  public String positionName, 
                normalName, 
                colorName,
                stName,
                st2Name,
                tangentName,
                bitangentName;
  //uniforms
  public String worldMatrixName, 
                viewMatrixName,
                projMatrixName,
                worldViewMatrixName,
                viewProjMatrixName, 
                worldViewProjMatrixName;
  
  public final SortedMap<Integer, String> textures = new TreeMap<Integer, String>();

  private Matrix4f auxMatrix = new Matrix4f();
  
  public void activate() {
    shader.activate();
    
    //TODO llums, etc que és estàtic
  }
  
  public void preRender(VertexType vt, Matrix4f worldMatrix, RenderManager rm) {
    if(worldMatrixName != null) {
      shader.setUniform(worldMatrixName, worldMatrix);
    }
    if(viewProjMatrixName != null) {
      auxMatrix.setIdentity();
      rm.getViewProjectionMatrix(auxMatrix);
      shader.setUniform(viewProjMatrixName, auxMatrix);
    }
    if(worldViewProjMatrixName != null) {
      auxMatrix.setIdentity();
      rm.getViewProjectionMatrix(auxMatrix);
      auxMatrix.mul(worldMatrix);
      shader.setUniform(worldViewProjMatrixName, auxMatrix);
    }
    
    for(Entry<Integer, String> texture : textures.entrySet()) {
      shader.setTextureUniform(texture.getValue(), texture.getKey());
    }
    
    if(positionName != null) {
      shader.setAttribBufferedPointer(
          positionName, 
          3, 
          GL_FLOAT, 
          false, 
          vt.getVertexSize(), 
          vt.getPositionStride());
    }
    
    if(normalName != null) {
      shader.setAttribBufferedPointer(
          normalName, 
          3, 
          GL_FLOAT, 
          false, 
          vt.getVertexSize(), 
          vt.getNormalStride());
    }
    
    if(colorName != null) {
      shader.setAttribBufferedPointer(
          colorName, 
          3, 
          GL_FLOAT, 
          false, 
          vt.getVertexSize(), 
          vt.getColorStride());
    }
    
    if(stName != null) {
      shader.setAttribBufferedPointer(
          stName, 
          2, 
          GL_FLOAT, 
          false, 
          vt.getVertexSize(), 
          vt.getSTStride());
    }
  }
  
  public void cleanUp() {
    shader.cleanUp();
  }
}
