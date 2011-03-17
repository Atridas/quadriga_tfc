package cat.quadriga.render.simple;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import javax.vecmath.Matrix4f;

import org.lwjgl.BufferUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL12.*;
import static org.lwjgl.opengl.GL15.*;
import org.lwjgl.opengl.GLContext;
  
public class QuadExample {
  
    public void start() {
        try {
        Display.setDisplayMode(new DisplayMode(800,600));
        Display.create();
    } catch (LWJGLException e) {
        e.printStackTrace();
        System.exit(0);
    }
    
    /*
    ContextCapabilities cc = GLContext.getCapabilities();
    
    String version = GL11.glGetString(GL11.GL_VERSION);
    */

    

    
    float vertexData[] = {100,100,0,
                          300,100,0,
                          300,300,0,
                          100,300,0};
    
    float colorData[] = {1,0,0,1,
                         0,1,0,1,
                         1,1,0,1,
                         0,0,1,1};
    
    int indexBuffer[] = {0,1,2,
                         0,2,3};
    
    
    FloatBuffer vb = BufferUtils.createFloatBuffer(vertexData.length);
    vb.put(vertexData);
    vb.rewind();
    int vertexBufferID = createVBOID();
    bufferData(vertexBufferID,vb);
    
    int colorBufferID = createVBOID();
    FloatBuffer cb = BufferUtils.createFloatBuffer(colorData.length);
    cb.put(colorData);
    cb.rewind();
    bufferData(colorBufferID,cb);

    int indexBufferID = createVBOID();
    IntBuffer ib = BufferUtils.createIntBuffer(indexBuffer.length);
    ib.put(indexBuffer);
    ib.rewind();
    bufferElementData(indexBufferID,ib);
  
    // init OpenGL
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    //glOrtho(0, 800, 600, 0, -1, 1);
    Matrix4f ortho = createOrtho(0, 800, 600, 0, -1, 1);
    FloatBuffer fb = BufferUtils.createFloatBuffer(16);
    matrixToBuffer(ortho, fb);
    glMultMatrix(fb);
    
    glMatrixMode(GL_MODELVIEW);
  
    while (!Display.isCloseRequested()) {
        // Clear the screen and depth buffer
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); 
        
        
        
        render(vertexBufferID,colorBufferID,indexBufferID,6,6);
        
        /*   
        // draw quad
        GL11.glBegin(GL11.GL_QUADS);
            GL11.glColor4f(1, 0, 0, 1);
            GL11.glVertex3f(100,100,0);

            GL11.glColor4f(0, 1, 0, 1);
            GL11.glVertex3f(100+200,100,0);

            GL11.glColor4f(1, 1, 0, 1);
            GL11.glVertex3f(100+200,100+200,0);

            GL11.glColor4f(0, 0, 1, 1);
            GL11.glVertex3f(100,100+200,0);
        GL11.glEnd();
        */
        Display.update();
    }
  
    Display.destroy();
    }
  
    /*
    public static void main(String[] argv) {
        QuadExample quadExample = new QuadExample();
        quadExample.start();
    }
    */
    
    
    public static int createVBOID() {
        if (GLContext.getCapabilities().GL_ARB_vertex_buffer_object) {
          IntBuffer buffer = BufferUtils.createIntBuffer(1);
          glGenBuffers(buffer);
          return buffer.get(0);
        }
        return 0;
      }
    
    public static void bufferData(int id, FloatBuffer buffer) {
        if (GLContext.getCapabilities().GL_ARB_vertex_buffer_object) {
          glBindBuffer(GL_ARRAY_BUFFER, id);
          glBufferData(GL_ARRAY_BUFFER, buffer, GL_STATIC_DRAW);
        }
      }
      public static void bufferElementData(int id, IntBuffer buffer) {
        if (GLContext.getCapabilities().GL_ARB_vertex_buffer_object) {
          glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, id);
          glBufferData(GL_ELEMENT_ARRAY_BUFFER, buffer, GL_STATIC_DRAW);
        }
      }
      
      
      public static void render(
          int vertexBufferID, 
          int colourBufferID,
          int indexBufferID,
          int maxIndex,
          int indexBufferSize) 
      {
          glEnableClientState(GL_VERTEX_ARRAY);
          glBindBuffer(GL_ARRAY_BUFFER, vertexBufferID);
          glVertexPointer(3, GL_FLOAT, 0, 0);
          
          glEnableClientState(GL_COLOR_ARRAY);
          glBindBuffer(GL_ARRAY_BUFFER, colourBufferID);
          glColorPointer(4, GL_FLOAT, 0, 0);
          
          glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, indexBufferID);
          glDrawRangeElements(GL_TRIANGLES, 0, maxIndex, indexBufferSize,
                            GL_UNSIGNED_INT, 0);
      }
      
      
      
    public static Matrix4f createOrtho(float left, float right, float bottom, float top, float zNear, float zFar) {
      float tx = -(right + left) / (right - left);
      float ty = -(top + bottom) / (top - bottom);
      float tz = -(zNear + zFar) / (zNear - zFar);
      
      return new Matrix4f( 
          2 / (right - left), 0, 0, tx,
          0, 2 / (top - bottom), 0, ty,
          0, 0,-2 / (zNear - zFar), tz,
          0, 0, 0,                   1);
    }
    
    public static void matrixToBuffer(Matrix4f in, FloatBuffer out) {
      out.rewind();
      float f[] = new float[4];
      for(int i = 0; i < 4; ++i) {
        in.getColumn(i, f);
        out.put(f);
      }
      out.rewind();
    }
}