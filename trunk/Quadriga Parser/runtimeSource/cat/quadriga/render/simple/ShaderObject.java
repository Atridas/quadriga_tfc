package cat.quadriga.render.simple;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL20.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.vecmath.Matrix4f;

import org.lwjgl.BufferUtils;

public class ShaderObject {
  private int vs, fs, program;
  private Map<String, Integer> uniforms = new HashMap<String, Integer>();
  private Map<String, Integer> attributes = new HashMap<String, Integer>();
  private Map<Integer, FloatBuffer> floatBuffers = new HashMap<Integer, FloatBuffer>();
  private Map<Integer, IntBuffer> intBuffers = new HashMap<Integer, IntBuffer>();
  
  public ShaderObject(String vertexShader, String fragmentShader, 
                      Set<String> uniforms, Set<String> attributes) {
    vs = glCreateShader(GL_VERTEX_SHADER);
    
    glShaderSource(vs, vertexShader);
    glCompileShader( vs );
    
    IntBuffer result = BufferUtils.createIntBuffer(1);
    result.rewind();
    glGetShader(vs, GL_COMPILE_STATUS, result);
    
    if(result.get() == 0) {
      result.rewind();
      glGetShader(vs, GL_INFO_LOG_LENGTH, result);
      int len = result.get();
      String info = glGetShaderInfoLog(vs, len);
      throw new IllegalArgumentException("Error in vertex shader: " + info + "\nSource:\n" + vertexShader);
    }
    
    //Fragment!
    fs = glCreateShader(GL_FRAGMENT_SHADER);
    
    glShaderSource(fs, fragmentShader);
    glCompileShader( fs );
    
    //IntBuffer result = BufferUtils.createIntBuffer(1);
    result.rewind();
    glGetShader(fs, GL_COMPILE_STATUS, result);
    
    if(result.get() == 0) {
      result.rewind();
      glGetShader(fs, GL_INFO_LOG_LENGTH, result);
      int len = result.get();
      String info = glGetShaderInfoLog(fs, len);
      throw new IllegalArgumentException("Error in fragment shader: " + info + "\nSource:\n" + fragmentShader);
    }
    
    
    //Program
    program = glCreateProgram();

    glAttachShader(program, vs);
    glAttachShader(program, fs);
    
    glLinkProgram(program);

    result.rewind();
    glGetProgram(program, GL_LINK_STATUS, result);
    
    if(result.get() == 0) {
      result.rewind();
      glGetProgram(program, GL_INFO_LOG_LENGTH, result);
      int len = result.get();
      String info = glGetProgramInfoLog(program, len);
      throw new IllegalArgumentException("Error linking shader: " + info 
          + "\nVertex:\n" + vertexShader
          + "\nFragment:\n" + fragmentShader);
    }

    
    for(String uniform : uniforms) {
      int id = glGetUniformLocation(program, uniform);
      if(id < 0) throw new IllegalArgumentException("Uniform not valid " + uniform 
          + "\nVertex:\n" + vertexShader
          + "\nFragment:\n" + fragmentShader);
      this.uniforms.put(uniform, id);
    }
    
    for(String attribute : attributes) {
      int id = glGetAttribLocation(program, attribute);
      if(id < 0) throw new IllegalArgumentException("Attribute not valid " + attribute 
          + "\nVertex:\n" + vertexShader
          + "\nFragment:\n" + fragmentShader);
      this.attributes.put(attribute, id);
    }
  }
  
  private FloatBuffer getFloatBuffer(int size) {
    FloatBuffer fb = floatBuffers.get(size);
    if(fb == null) {
      fb = BufferUtils.createFloatBuffer(size);
      floatBuffers.put(size, fb);
    }
    fb.rewind();
    return fb;
  }
  
  
  private IntBuffer getIntBuffer(int size) {
    IntBuffer ib = intBuffers.get(size);
    if(ib == null) {
      ib = BufferUtils.createIntBuffer(size);
      intBuffers.put(size, ib);
    }
    ib.rewind();
    return ib;
  }
  
  public void setUniform(String name, Matrix4f matrix) {
    int uniformID = uniforms.get(name);
    FloatBuffer fb = getFloatBuffer(16);
    RenderManager.matrixToBuffer(matrix, fb);
    glUniformMatrix4(uniformID, false, fb);
  }
  
  public void setAttribBufferedPointer(
      String name, 
      int elementsPerVertex, 
      int type, 
      boolean normalized, 
      int vertexSize, 
      int offset) 
  {
    int attribID = attributes.get(name);
    
    glEnableVertexAttribArray(attribID);
    glVertexAttribPointer(attribID, 
                                elementsPerVertex, 
                                type ,
                                normalized, 
                                vertexSize, 
                                offset);
  }
  
  public void drawBufferedElements(int numPrimitives, boolean isShort) {
    glDrawElements(GL_TRIANGLES, 
        numPrimitives * 3, 
        (isShort)?GL_UNSIGNED_SHORT : GL_UNSIGNED_INT, 0);
  }
  
  public void activate() {
    glUseProgram(program);
  }
}
