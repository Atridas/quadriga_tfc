package cat.quadriga.render.simple;


import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashSet;
import java.util.Set;

import javax.vecmath.Matrix4f;

import org.lwjgl.BufferUtils;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL12.glDrawRangeElements;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;

public class Box {
  private static boolean initialized;
  
  private static int vb, ib;
  private static ShaderObject shader;
  
  //private static int aVertPosition, uWorld, uViewProj;
  
  public Box() {
    if(!initialized) {
      init();
    }
  }
  
  private static synchronized void init() {
    if(!initialized) {
      initialized = true;
      
      float vertexs[] = { -0.5f, -0.5f, 0.f,
                           0.5f, -0.5f, 0.f,
                            0.f,  0.5f, 0.f,
                        };
      
      int indexs[] = { 0, 1, 2 };
      
      IntBuffer bufferObjects = BufferUtils.createIntBuffer(2);
      glGenBuffers(bufferObjects);
      vb = bufferObjects.get(0);
      ib = bufferObjects.get(1);
      
      FloatBuffer vertexBuffer = BufferUtils.createFloatBuffer(vertexs.length);
      IntBuffer indexBuffer = BufferUtils.createIntBuffer(indexs.length);

      vertexBuffer.rewind();
      indexBuffer.rewind();
      
      vertexBuffer.put(vertexs);
      indexBuffer.put(indexs);

      vertexBuffer.rewind();
      indexBuffer.rewind();
      
      glBindBuffer(GL_ARRAY_BUFFER, vb);
      glBufferData(GL_ARRAY_BUFFER, vertexBuffer, GL_STATIC_DRAW);
      
      glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ib);
      glBufferData(GL_ELEMENT_ARRAY_BUFFER, indexBuffer, GL_STATIC_DRAW);
      
      
      // shaders
      String fragmentShader = 
        "#ifdef GL_ES\n" +
        " precision highp float;\n" +
        "#endif\n" +

        "void main(void) {\n" +
        "    gl_FragColor = vec4(1.0, 1.0, 1.0, 1.0);\n" +
        "}\n";
      
      String vertexShader = 
         "attribute vec3 aVertexPosition;\n\n" +

         "uniform mat4 uWorld;\n" +
         "uniform mat4 uViewProj;\n\n" +
      
         "void main(void) {\n" +
         "    gl_Position = uViewProj * uWorld * vec4(aVertexPosition, 1.0);\n" +
         "}\n";

      Set<String> uniforms = new HashSet<String>();
      Set<String> attributes = new HashSet<String>();
      uniforms.add("uWorld");
      uniforms.add("uViewProj");
      attributes.add("aVertexPosition");
      
      
      shader = new ShaderObject(
                        vertexShader, 
                        fragmentShader, 
                        uniforms, 
                        attributes);
    }
  }
  
  public void render(Matrix4f world, Matrix4f viewProj) {
    shader.activate();

    shader.setUniform("uWorld", world);
    shader.setUniform("uViewProj", viewProj);
    
    glBindBuffer(GL_ARRAY_BUFFER, vb);
    shader.setAttribBufferedPointer(
        "aVertexPosition", 
        3, 
        GL_FLOAT, 
        false, 
        3 * Float.SIZE / 8, 
        0);

    glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, ib);
    shader.drawBufferedElements(1, false);
  }
}
