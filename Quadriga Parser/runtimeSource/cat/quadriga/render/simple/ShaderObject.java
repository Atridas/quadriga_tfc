package cat.quadriga.render.simple;

import static org.lwjgl.opengl.GL20.*;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.vecmath.Matrix4f;

import org.lwjgl.BufferUtils;

public final class ShaderObject {
  private static Logger logger = Logger.getLogger(ShaderObject.class.getCanonicalName());
  
  private int vs=-1, fs=-1, program=-1;
  private Map<String, Integer> uniforms = new HashMap<String, Integer>();
  private Map<String, Integer> attributes = new HashMap<String, Integer>();
  private Map<Integer, FloatBuffer> floatBuffers = new HashMap<Integer, FloatBuffer>();
  //private Map<Integer, IntBuffer> intBuffers = new HashMap<Integer, IntBuffer>();
  
  public ShaderObject(String vertexShader, String fragmentShader) {
    glUseProgram(0);
    
    vs = glCreateShader(GL_VERTEX_SHADER);
    
    glShaderSource(vs, vertexShader);
    glCompileShader( vs );
    
    int result;
    result = glGetShader(vs, GL_COMPILE_STATUS);
    
    if(result == 0) {
      int len = glGetShader(vs, GL_INFO_LOG_LENGTH);
      String info = glGetShaderInfoLog(vs, len);
      throw new IllegalArgumentException("Error in vertex shader: " + info + "\nSource:\n" + vertexShader);
    }
    
    //Fragment!
    fs = glCreateShader(GL_FRAGMENT_SHADER);
    
    glShaderSource(fs, fragmentShader);
    glCompileShader( fs );
    
    //IntBuffer result = BufferUtils.createIntBuffer(1);
    result = glGetShader(fs, GL_COMPILE_STATUS);
    
    if(result == 0) {
      int len = glGetShader(fs, GL_INFO_LOG_LENGTH);
      String info = glGetShaderInfoLog(fs, len);
      throw new IllegalArgumentException("Error in fragment shader: " + info + "\nSource:\n" + fragmentShader);
    }
    
    
    //Program
    program = glCreateProgram();

    glAttachShader(program, vs);
    glAttachShader(program, fs);
    
    glLinkProgram(program);

    result = glGetProgram(program, GL_LINK_STATUS);
    
    if(result == 0) {
      int len = glGetProgram(program, GL_INFO_LOG_LENGTH);
      String info = glGetProgramInfoLog(program, len);
      throw new IllegalArgumentException("Error linking shader: " + info 
          + "\nVertex:\n" + vertexShader
          + "\nFragment:\n" + fragmentShader);
    }

    
    int numUniforms = glGetProgram(program, GL_ACTIVE_UNIFORMS);
    int uniformLen  = glGetProgram(program, GL_ACTIVE_UNIFORM_MAX_LENGTH);
    
    for(int i = 0; i < numUniforms; ++i) {
      String uniform = glGetActiveUniform(program, i, uniformLen);
      int id = glGetUniformLocation(program, uniform);
      this.uniforms.put(uniform, id);
    }

    int numAttributes = glGetProgram(program, GL_ACTIVE_ATTRIBUTES);
    int attributeLen  = glGetProgram(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH);
    
    for(int i = 0; i < numAttributes; ++i) {
      String attribute = glGetActiveAttrib(program, i, attributeLen);
      int id = glGetAttribLocation(program, attribute);
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
  
  
  /*private IntBuffer getIntBuffer(int size) {
    IntBuffer ib = intBuffers.get(size);
    if(ib == null) {
      ib = BufferUtils.createIntBuffer(size);
      intBuffers.put(size, ib);
    }
    ib.rewind();
    return ib;
  }*/

  private volatile Set<String> testedNullUniforms = new HashSet<String>();
  private volatile Set<String> testedNullAttributes = new HashSet<String>();
  
  public int getUniform(String name) {
    Integer uniformID = uniforms.get(name);
    if(uniformID == null) {
      if(!testedNullUniforms.contains(name)) {
        testedNullUniforms.add(name);
        logger.warning("Uniform " + name + " does not exist.");
      }
      return -1;
    }
    return uniformID;
  }
  
  public int getAttrib(String name) {
    Integer attribID = attributes.get(name);
    if(attribID == null) {
      if(!testedNullAttributes.contains(name)) {
        testedNullAttributes.add(name);
        logger.warning("Atribute " + name + " does not exist.");
      }
      return -1;
    }
    return attribID;
  }
  
  public void setUniform(String name, Matrix4f matrix) {
    Integer uniformID = uniforms.get(name);
    if(uniformID == null) {
      if(!testedNullUniforms.contains(name)) {
        testedNullUniforms.add(name);
        logger.warning("Uniform " + name + " does not exist.");
      }
    } else {
      setUniform(uniformID, matrix);
    }
  }
  
  public void setUniform(int uniformID, Matrix4f matrix) {
    FloatBuffer fb = getFloatBuffer(16);
    RenderManager.matrixToBuffer(matrix, fb);
    glUniformMatrix4(uniformID, false, fb);
  }
  
  public void setTextureUniform(String name, int unit ) {
    Integer uniformID = uniforms.get(name);
    if(uniformID == null) {
      if(!testedNullUniforms.contains(name)) {
        testedNullUniforms.add(name);
        logger.warning("Uniform " + name + " does not exist.");
      }
    } else {
      glUniform1i(uniformID, unit);
    }
  }
  
  public void setTextureUniform(int uniformID, int unit ) {
    glUniform1i(uniformID, unit);
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
  
  public void setAttribBufferedPointer(
      int attribID, 
      int elementsPerVertex, 
      int type, 
      boolean normalized, 
      int vertexSize, 
      int offset) 
  {
    
    glEnableVertexAttribArray(attribID);
    glVertexAttribPointer(attribID, 
                                elementsPerVertex, 
                                type ,
                                normalized, 
                                vertexSize, 
                                offset);
  }
  
  public void activate() {
    glUseProgram(program);
  }
  
  public void cleanUp() {
    if(program >= 0)
      glDeleteProgram(program);
    if(vs >= 0)
      glDeleteShader(vs);
    if(fs >= 0)
      glDeleteShader(fs);
    
    fs = vs = program = -1;
  }
  
  @Override
  public void finalize() {
    cleanUp();
  }
}
