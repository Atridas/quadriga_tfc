package cat.quadriga.render.simple;

import static org.lwjgl.opengl.GL20.GL_COMPILE_STATUS;
import static org.lwjgl.opengl.GL20.GL_FRAGMENT_SHADER;
import static org.lwjgl.opengl.GL20.GL_INFO_LOG_LENGTH;
import static org.lwjgl.opengl.GL20.GL_VERTEX_SHADER;
import static org.lwjgl.opengl.GL20.glCompileShader;
import static org.lwjgl.opengl.GL20.glCreateShader;
import static org.lwjgl.opengl.GL20.glDeleteShader;
import static org.lwjgl.opengl.GL20.glGetShader;
import static org.lwjgl.opengl.GL20.glGetShaderInfoLog;
import static org.lwjgl.opengl.GL20.glShaderSource;
import static org.lwjgl.opengl.GL20.glUseProgram;

import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

public final class ShaderManager {
  private final Map<String, Integer> vertexShaders = new HashMap<String, Integer>();
  private final Map<String, Integer> fragmentShaders = new HashMap<String, Integer>();
  
  //vertex -> fragments -> shader
  private final Map<String, Map<String, SoftReference<ShaderObject>>> shaders = new HashMap<String, Map<String,SoftReference<ShaderObject>>>();
  
  private boolean cleaned = false;
  
  public ShaderObject getShader(String vertexShader, String fragmentShader) {
    Map<String, SoftReference<ShaderObject>> map = shaders.get(vertexShader);
    if(map == null) {
      map = new HashMap<String, SoftReference<ShaderObject>>();
      shaders.put(vertexShader, map);
    }
    SoftReference<ShaderObject> aux = map.get(fragmentShader);
    ShaderObject so = null;
    if(aux != null) so = aux.get();
    
    if(so == null) {
      glUseProgram(0);

      int vs = getVertexShader(vertexShader);
      int fs = getFragmentShader(fragmentShader);
      
      try {
        so = new ShaderObject(vs, fs);
      } catch (Exception e) {
        throw new IllegalArgumentException("Error linking shader: "
            + "\nVertex:\n" + vertexShader
            + "\nFragment:\n" + fragmentShader);
      }
    }
    return so;
  }
  
  private int getVertexShader(String vertexShader) {
    Integer i = vertexShaders.get(vertexShader);
    if(i != null) {
      return i;
    }
    
    int vs = glCreateShader(GL_VERTEX_SHADER);
    
    glShaderSource(vs, vertexShader);
    glCompileShader( vs );
    
    int result;
    result = glGetShader(vs, GL_COMPILE_STATUS);
    
    if(result == 0) {
      int len = glGetShader(vs, GL_INFO_LOG_LENGTH);
      String info = glGetShaderInfoLog(vs, len);
      throw new IllegalArgumentException("Error in vertex shader: " + info + "\nSource:\n" + vertexShader);
    }
    
    vertexShaders.put(vertexShader, vs);
    return vs;
  }
  
  private int getFragmentShader(String fragmentShader) {
    Integer i = fragmentShaders.get(fragmentShader);
    if(i != null) {
      return i;
    }
    
    int fs = glCreateShader(GL_FRAGMENT_SHADER);
    
    glShaderSource(fs, fragmentShader);
    glCompileShader( fs );
    
    //IntBuffer result = BufferUtils.createIntBuffer(1);
    int result = glGetShader(fs, GL_COMPILE_STATUS);
    
    if(result == 0) {
      int len = glGetShader(fs, GL_INFO_LOG_LENGTH);
      String info = glGetShaderInfoLog(fs, len);
      throw new IllegalArgumentException("Error in fragment shader: " + info + "\nSource:\n" + fragmentShader);
    }
    
    fragmentShaders.put(fragmentShader, fs);
    return fs;
  }
  

  
  public void cleanUp() {
    if(!cleaned) {
      for(int vs: vertexShaders.values()) {
        glDeleteShader(vs);
      }
      for(int fs: fragmentShaders.values()) {
        glDeleteShader(fs);
      }
      for(Map<String, SoftReference<ShaderObject>> map : shaders.values()) {
        for(SoftReference<ShaderObject> aux : map.values()) {
          ShaderObject so = aux.get();
          if(so != null) so.cleanUp();
        }
      }
      vertexShaders.clear();
      fragmentShaders.clear();
      shaders.clear();
    }
  }
  
  @Override
  public void finalize() {
    cleanUp();
  }
}
