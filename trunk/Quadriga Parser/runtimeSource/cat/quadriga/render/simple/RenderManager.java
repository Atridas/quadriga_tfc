package cat.quadriga.render.simple;

import static org.lwjgl.opengl.GL11.*;

import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class RenderManager {
  private Map<Integer, Node> nodes = new HashMap<Integer, Node>();
  private Map<Integer, Set<Integer>> parents = new HashMap<Integer, Set<Integer>>();
  private final Matrix4f viewMatrix = new Matrix4f();
  private final Matrix4f projectionMatrix = new Matrix4f();
  private final Vector3f cameraPosition = new Vector3f();
  
  private static Map<String, RenderManager> instances = new HashMap<String, RenderManager>();
  public final static RenderManager instance = new RenderManager();
  
  public static RenderManager getInstance(String name) {
    RenderManager instance = instances.get(name);
    if(instance == null) {
      instance = new RenderManager();
      instances.put(name, instance);
    }
    return instance;
  }
  
  private RenderManager() {}
  
  
  public Node getNode(int id) {
    Node node = nodes.get(id);
    if(node == null) {
      node = new Node();
      setParent(id,-1);
      nodes.put(id, node);
    }
    return node;
  }
  
  public void setParent(int child, int parent) {
    Set<Integer> childs = parents.get(parent);
    if(childs == null) {
      childs = new HashSet<Integer>();
      parents.put(parent, childs);
    }
    childs.add(child);
  }
  
  public void setProjection(
      float left, float right, 
      float bottom, float top, 
      float near, float far) 
  {
    projectionMatrix.setColumn(0, 
        2*near / (right-left), 
        0.0f, 
        0.0f, 
        0.0f);
    projectionMatrix.setColumn(1, 
        0.0f, 
        2*near / (top-bottom), 
        0.0f, 
        0.0f);
    projectionMatrix.setColumn(2, 
        (right+left) / (right-left), 
        (top+bottom) / (top-bottom), 
        -(far+near) / (far-near), 
        -1.0f);
    projectionMatrix.setColumn(3, 
        0.0f, 
        0.0f, 
        -near * far / (far-near), 
        0.0f);
  }
  
  public void setCamera(Vector3f eye, Vector3f lookAt, Vector3f up) {
    cameraPosition.set(eye);
    
    Vector3f zdir = new Vector3f(eye);
    zdir.sub(lookAt);
    Vector3f xdir = new Vector3f();
    xdir.cross(up, zdir);
    Vector3f ydir = new Vector3f();
    ydir.cross(zdir, xdir);

    xdir.normalize();
    ydir.normalize();
    zdir.normalize();

    viewMatrix.setColumn(0, xdir.x, xdir.y, xdir.z, 0.0f);
    viewMatrix.setColumn(1, ydir.x, ydir.y, ydir.z, 0.0f);
    viewMatrix.setColumn(2, zdir.x, zdir.y, zdir.z, 0.0f);
    viewMatrix.setColumn(3, cameraPosition.x, cameraPosition.y, cameraPosition.z, 1.0f);
    
    viewMatrix.invert();
  }
  
  public void getViewProjectionMatrix(Matrix4f viewProjection) {
    viewProjection.set( projectionMatrix );
    viewProjection.mul( viewMatrix   );
  }
  
  public void getViewMatrix(Matrix4f view) {
    view.set( viewMatrix );
  }
  
  public void getProjectionMatrix(Matrix4f projection) {
    projection.set( projectionMatrix );
  }
  
  public static void initGL(int width, int height) {
    try {
      Display.setDisplayMode(new DisplayMode(width,height));
      
      Display.create();
      
      /*GL11.glClearColor(1, 0, 1, 1);
      GL11.glDisable(GL11.GL_DEPTH_TEST);
      GL11.glDisable(GL11.GL_CULL_FACE);
      GL11.glViewport(0, 0, width, height);
      GL11.glClearDepth(0);*/
    //GL20.glUseProgram(0);
      glMatrixMode(GL_PROJECTION);
      glLoadIdentity();
      //glOrtho(0, 800, 600, 0, 1, -1);
      glFrustum(-5.0f, 5.0f,
                -5.0f, 5.0f,
                1.0f,99.9f);
      
      glMatrixMode(GL_MODELVIEW);
      //glLoadIdentity();
      //GL11.glTranslatef(0, 1, 10);
      
      glColor3f(0.5f,0.5f,1.0f);
      
    } catch (LWJGLException e) {
      throw new IllegalStateException(e);
    }
    
  }
  
  public static void initRender() {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); 
  }
  
  public static void testRender() {
    glBegin(GL_QUADS);
    {
      glColor4f(1, 0, 0, 1);
      glVertex3f(100,100,0);
  
      glColor4f(0, 1, 0, 1);
      glVertex3f(100+200,100,0);
  
      glColor4f(1, 1, 0, 1);
      glVertex3f(100+200,100+200,0);
  
      glColor4f(0, 0, 1, 1);
      glVertex3f(100,100+200,0);
    }
    glEnd();
  }
  
  public static void switchBuffers() {
    Display.update();
  }
  
  public static boolean isCloseRequested() {
    return Display.isCloseRequested();
  }
  
  public static void close() {
    Display.destroy();
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
