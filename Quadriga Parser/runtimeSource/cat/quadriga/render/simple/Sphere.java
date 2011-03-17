package cat.quadriga.render.simple;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

import javax.vecmath.Matrix4f;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;

public class Sphere {
  public float radi;
  public int arestes;

  private static Map<Integer, Integer> vertexBuffers = new HashMap<Integer, Integer>();
  private static Map<Integer, Integer> indexBuffers  = new HashMap<Integer, Integer>();
  
  public static final String vertexShaderSource = 
          "#version 130\n"
        + "in      vec3 _position;\n"
        + "in      vec3 _normal;\n"
        + "in      vec2 _texCoords;\n"
        + "uniform mat4 u_worldMatrix;\n"
        + "uniform mat4 u_viewProjMatrix;\n"
        + "uniform float u_radi;\n"
        + "out     vec3 normal_;\n"
        + "out     vec2 texCoords_;\n\n"
        
        + "void main() {\n"
        + "  gl_Position = u_viewProjMatrix * u_worldMatrix * vec4(_position.xyz * u_radi,1.0);\n"
        + "  normal_     = vec3(u_viewProjMatrix * u_worldMatrix * vec4(_normal.xyz  ,0.0));\n"
        + "  normal_     = normalize(normal_);\n"
        + "  texCoords_  = _texCoords;\n"
        + "}\n";
  
  public static final String fragmentShaderSource = 
          "#version 130\n"
        + "void main() {\n"
        + "  gl_FragColor = vec4(1.0,0.0,0.0,1.0);\n"
        + "}\n";
  
  private static int vertexShader, fragmentShader, programShader;

  private static int attribPosition, attribNormal, attribTex;
  private static int uniformWorld, uniformViewProj, uniformRadi;
  
  public Sphere(float radi, int arestes) {
    this.radi = radi;
    this.arestes = arestes;
    
    if(!vertexBuffers.containsKey(arestes)) {
      createBuffers(arestes);
    }
    
    if(vertexShader == 0) {
      createShaders();
    }
  }
  
  public void render(Matrix4f world, Matrix4f viewProj) {
    Integer vertexBufferId = vertexBuffers.get(arestes);
    if(vertexBufferId == null) { //per si s'ha canviat el nombre d'arestes
      createBuffers(arestes);
      vertexBufferId = vertexBuffers.get(arestes);
    }
    Integer indexBufferId  = indexBuffers.get(arestes);
    
    GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vertexBufferId);
    GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, indexBufferId);
    
    GL20.glUseProgram(programShader);
    
    FloatBuffer fb = BufferUtils.createFloatBuffer(16);
    fb.rewind();
    for(int i = 0; i < 4; ++i) {
      for(int j = 0; j < 4; ++j) {
        fb.put(world.getElement(i, j));
      }
    }
    fb.rewind();
    GL20.glUniformMatrix4(uniformWorld, false, fb);
    fb.rewind();
    for(int i = 0; i < 4; ++i) {
      for(int j = 0; j < 4; ++j) {
        fb.put(viewProj.getElement(i, j));
      }
    }
    fb.rewind();
    GL20.glUniformMatrix4(uniformViewProj, false, fb);
    
    GL20.glUniform1f(uniformRadi, radi);

    GL20.glEnableVertexAttribArray(attribPosition);
    GL20.glEnableVertexAttribArray(attribNormal);
    GL20.glEnableVertexAttribArray(attribTex);

    GL20.glVertexAttribPointer(attribPosition, 
                                3, 
                                GL11.GL_FLOAT ,
                                false, 
                                VERTEX_SIZE, 
                                0);
    GL20.glVertexAttribPointer(attribNormal, 
                                3, 
                                GL11.GL_FLOAT ,
                                false, 
                                VERTEX_SIZE, 
                                3 * Float.SIZE);
    GL20.glVertexAttribPointer(attribTex, 
                                2, 
                                GL11.GL_FLOAT ,
                                false, 
                                VERTEX_SIZE, 
                                6 * Float.SIZE);
    
    GL11.glDrawElements(GL11.GL_TRIANGLES, 
                        arestes * arestes*3, 
                        GL11.GL_SHORT, 0);
  }
  
  // xyz, nx, ny, nz, u, v
  public static final int VERTEX_SIZE = 8 * Float.SIZE;
  
  private static synchronized void createBuffers(int arestes) {
    if(!vertexBuffers.containsKey(arestes)) {
      IntBuffer bufferObjects = BufferUtils.createIntBuffer(2);
      
      GL15.glGenBuffers(bufferObjects);

      int vertexBufferId = bufferObjects.get(0);
      int indexBufferId = bufferObjects.get(1);

      vertexBuffers.put(arestes,vertexBufferId);
      indexBuffers.put(arestes,indexBufferId);
      
      //Vertex Buffer
      ByteBuffer vertexBuffer = BufferUtils.createByteBuffer(VERTEX_SIZE * arestes * arestes);
      ByteBuffer indexBuffer = BufferUtils.createByteBuffer(Short.SIZE * arestes * arestes*3);

      vertexBuffer.rewind();
      indexBuffer.rewind();
      
      for(int t = 0; t < arestes; ++t) {
        float radRing = (float)Math.sin(Math.PI * t / arestes);
        for(int b = 0; b < arestes; ++b) {
          float x = radRing * (float)Math.cos(2 * Math.PI * b / arestes);
          float y =       1 * (float)Math.cos(    Math.PI * t / arestes);
          float z = radRing * (float)Math.sin(2 * Math.PI * b / arestes);
          //Vertex
          vertexBuffer.putFloat(x);
          vertexBuffer.putFloat(y);
          vertexBuffer.putFloat(z);
          //Normal ---
          vertexBuffer.putFloat(x);
          vertexBuffer.putFloat(y);
          vertexBuffer.putFloat(z);

          // S, T (UV)
          vertexBuffer.putFloat( (float)b / (float)arestes);
          vertexBuffer.putFloat( (float)t / (float)arestes);
          
          //indexos
          indexBuffer.putShort((short)(t*arestes + b));
          if(b < arestes-1) {
            indexBuffer.putShort((short)(t*arestes + b + 1));
          } else {
            indexBuffer.putShort((short)(t*arestes));
          }
          if(b < arestes-1) {
            indexBuffer.putShort((short)((t+1)*arestes + b));
          } else {
            indexBuffer.putShort((short)b);
          }
          
        }
      }
      
      vertexBuffer.rewind();
      indexBuffer.rewind();
      
      GL15.glBindBuffer(GL15.GL_ARRAY_BUFFER, vertexBufferId);
      GL15.glBufferData(GL15.GL_ARRAY_BUFFER, vertexBuffer, GL15.GL_STATIC_DRAW);
      
      GL15.glBindBuffer(GL15.GL_ELEMENT_ARRAY_BUFFER, indexBufferId);
      GL15.glBufferData(GL15.GL_ELEMENT_ARRAY_BUFFER, indexBuffer, GL15.GL_STATIC_DRAW);
    }
  }
  
  private static synchronized void createShaders() {
    if(vertexShader == 0) {
      //Vertex!
      vertexShader = GL20.glCreateShader(GL20.GL_VERTEX_SHADER);
      
      GL20.glShaderSource(vertexShader, vertexShaderSource);
      GL20.glCompileShader( vertexShader );
      
      IntBuffer result = BufferUtils.createIntBuffer(1);
      result.rewind();
      GL20.glGetShader(vertexShader, GL20.GL_COMPILE_STATUS, result);
      
      if(result.get() == 0) {
        result.rewind();
        GL20.glGetShader(vertexShader, GL20.GL_INFO_LOG_LENGTH, result);
        int len = result.get();
        String info = GL20.glGetShaderInfoLog(vertexShader, len);
        throw new IllegalStateException("Error in sphere vertex shader: " + info);
      }
      
      //Fragment!
      fragmentShader = GL20.glCreateShader(GL20.GL_FRAGMENT_SHADER);
      
      GL20.glShaderSource(fragmentShader, fragmentShaderSource);
      GL20.glCompileShader( fragmentShader );
      
      //IntBuffer result = BufferUtils.createIntBuffer(1);
      result.rewind();
      GL20.glGetShader(fragmentShader, GL20.GL_COMPILE_STATUS, result);
      
      if(result.get() == 0) {
        result.rewind();
        GL20.glGetShader(fragmentShader, GL20.GL_INFO_LOG_LENGTH, result);
        int len = result.get();
        String info = GL20.glGetShaderInfoLog(fragmentShader, len);
        throw new IllegalStateException("Error in sphere fragment shader: " + info);
      }
      
      
      //Program
      programShader = GL20.glCreateProgram();

      GL20.glAttachShader(programShader, vertexShader);
      GL20.glAttachShader(programShader, fragmentShader);
      
      GL20.glLinkProgram(programShader);

      result.rewind();
      GL20.glGetProgram(programShader, GL20.GL_LINK_STATUS, result);
      
      if(result.get() == 0) {
        result.rewind();
        GL20.glGetProgram(programShader, GL20.GL_INFO_LOG_LENGTH, result);
        int len = result.get();
        String info = GL20.glGetShaderInfoLog(programShader, len);
        throw new IllegalStateException("Error in sphere program shader: " + info);
      }
      
      
      //posicions de les coses
/*
      + "in      vec3 _position;\n"
      + "in      vec3 _normal;\n"
      + "in      vec2 _texCoords;\n"
      + "uniform mat4 u_worldMatrix;\n"
      + "uniform mat4 u_viewProjMatrix;\n"
      + "uniform float u_radi;\n"
  */
      uniformWorld    = GL20.glGetUniformLocation(programShader, "u_worldMatrix");
      uniformViewProj = GL20.glGetUniformLocation(programShader, "u_viewProjMatrix");
      uniformRadi     = GL20.glGetUniformLocation(programShader, "u_radi");

      attribPosition = GL20.glGetAttribLocation(programShader, "_position");
      attribNormal   = GL20.glGetAttribLocation(programShader, "_normal");
      attribTex      = GL20.glGetAttribLocation(programShader, "_texCoords");
      
      int error = GL11.glGetError();
      if(error != 0) {
        throw new IllegalStateException("OpenGL error");
      }
    }
  }
  
  public static synchronized void cleanUp() {
    GL20.glDeleteShader(vertexShader);
    GL20.glDeleteShader(fragmentShader);
    GL20.glDeleteProgram(programShader);

    for(Integer i : vertexBuffers.values()) {
      GL15.glDeleteBuffers(i);
    }
    for(Integer i : indexBuffers.values()) {
      GL15.glDeleteBuffers(i);
    }
    
  }
}
