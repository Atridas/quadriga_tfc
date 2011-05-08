package cat.quadriga.render.simple;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

import javax.vecmath.Matrix4f;

import org.lwjgl.BufferUtils;

import cat.quadriga.render.simple.materials.BaseMaterial;

public final class StaticMesh {
  private BaseMaterial material;
  private final VertexType vt;
  private final int vb, ib;
  private final int numIndexes;
  private final int drawMode;
  
  public StaticMesh(BaseMaterial material, Vertex[] vertexArray, int[] indexes) {
    this(material, vertexArray, indexes, GL_TRIANGLES);
  }
  
  public StaticMesh(BaseMaterial material, Vertex[] vertexArray, int[] indexes, int drawMode) {
    IntBuffer bufferObjects = BufferUtils.createIntBuffer(2);
    glGenBuffers(bufferObjects);
    vb = bufferObjects.get(0);
    ib = bufferObjects.get(1);
    
    vt = vertexArray[0].getVertexType();
    
    ByteBuffer vBuffer = BufferUtils.createByteBuffer(vt.getVertexSize() * vertexArray.length);
    IntBuffer  iBuffer = BufferUtils.createIntBuffer(indexes.length);
    
    for(int i = 0; i < vertexArray.length; ++i) {
      vertexArray[i].writeToBuffer(vBuffer);
    }
    iBuffer.put(indexes);
    
    vBuffer.rewind();
    iBuffer.rewind();
    
    glBindBuffer(GL_ARRAY_BUFFER, vb);
    glBufferData(GL_ARRAY_BUFFER, vBuffer, GL_STATIC_DRAW);
    
    glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ib);
    glBufferData(GL_ELEMENT_ARRAY_BUFFER, iBuffer, GL_STATIC_DRAW);
    
    this.material = material;
    this.numIndexes = indexes.length;
    this.drawMode = drawMode;
  }
  
  public void setMaterial(BaseMaterial material) {
    this.material = material;
  }
  
  public void render(Matrix4f world, RenderManager rm) {
    assert !cleanedUp;
    
    material.activate();
    glBindBuffer(GL_ARRAY_BUFFER, vb);
    material.preRender(vt, world, rm);
    glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ib);
    glDrawElements(drawMode, numIndexes, GL_UNSIGNED_INT, 0);
  }
  
  private boolean cleanedUp = false;
  public void cleanUp() {
    if(!cleanedUp) {
      glDeleteBuffers(vb);
      glDeleteBuffers(ib);
      cleanedUp = true;
    }
  }
  
  @Override
  public void finalize() {
    cleanUp();
  }
}
