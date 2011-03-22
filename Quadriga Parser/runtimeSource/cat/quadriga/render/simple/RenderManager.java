package cat.quadriga.render.simple;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;

import java.awt.Font;
import java.io.IOException;
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
  private Map<Integer, Integer> parents = new HashMap<Integer, Integer>();
  private Map<Integer, Set<Integer>> childs = new HashMap<Integer, Set<Integer>>();
  private Map<Integer, StaticMesh> meshes = new HashMap<Integer, StaticMesh>();
  private Map<Integer, StackedSphere> spheres = new HashMap<Integer, StackedSphere>();
  
  private int lastTexture = 0; //TODO multi-texture
  
  private static Texture proves;
  
  private Map<String, Float> perThreadFPSs = new HashMap<String, Float>();
  public boolean renderFPS = true;
  
  private final Matrix4f viewMatrix = new Matrix4f();
  private final Matrix4f projectionMatrix = new Matrix4f();
  private final Vector3f cameraPosition = new Vector3f();
  
  private static Map<String, RenderManager> instances = new HashMap<String, RenderManager>();
  public final static RenderManager instance = new RenderManager();
  private static StaticMesh axis;
  private static final MaterialManager materialManager = new MaterialManager();
  
  
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
    
    //remove old parent, if exists
    Integer oldParent = this.parents.get(child);
    if(oldParent != null) {
      this.childs.get(oldParent).remove(child);
    }
    
    Set<Integer> childs = this.childs.get(parent);
    if(childs == null) {
      childs = new HashSet<Integer>();
      this.childs.put(parent, childs);
    }
    childs.add(child);
    parents.put(child,parent);
  }
  
  public void setSphere(int position, float radi) {
    spheres.put(position, new StackedSphere(radi, 30, 30));
  }
  
  public void changeSphere(int position, float radi) {
    spheres.get(position).radi = radi;
  }
  
  public void deleteSphere(int position) {
    spheres.remove(position);
  }
  
  public static MaterialManager getMaterialManager() {
    return materialManager;
  }
  
  void activateTexture(int target, int texture) {
    //if(lastTexture != texture) {
      glActiveTexture(GL_TEXTURE0);
      glBindTexture(target, texture);
    //  lastTexture = texture;
    //}
  }
  
  public void setPerspective(float fovy, float aspect, float zNear, float zFar) {
    float f = (float)(1.0 / Math.tan(fovy/2.));
    projectionMatrix.setColumn(0, 
        f/aspect,
        0,
        0,
        0);
    projectionMatrix.setColumn(1, 
        0,
        f,
        0,
        0);
    projectionMatrix.setColumn(2, 
        0,
        0,
        (zFar+zNear)/(zNear-zFar),
        -1);
    projectionMatrix.setColumn(3, 
        0,
        0,
        2*zFar*zNear / (zNear-zFar),
        0);
        
  }
  
  public void setFrustum(
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
        -2*near * far / (far-near), 
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
    viewProjection.mul( projectionMatrix );
    viewProjection.mul( viewMatrix   );
  }
  
  public void getViewMatrix(Matrix4f view) {
    view.mul( viewMatrix );
  }
  
  public void getProjectionMatrix(Matrix4f projection) {
    projection.mul( projectionMatrix );
  }
  
  public static void initGL(int width, int height) {
    try {
      Display.setDisplayMode(new DisplayMode(width,height));
      
      Display.create();
      
      glEnable(GL_DEPTH_TEST);
      glEnable(GL_CULL_FACE);
      
      try {
        proves = new Texture2D("resources/fonts/font0_0.png", instance);
        //proves = new Texture2D("resources/textures/rednyu.png", instance);
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      
      //fonts.put("Times New Roman", new UnicodeFont(new Font("Times New Roman", Font.BOLD, 24)));
      
    } catch (LWJGLException e) {
      throw new IllegalStateException(e);
    }
    
  }
  
  public static void initRender() {
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT); 
  }
  
  public static void switchBuffers() {
    Display.update();
  }
  
  public static boolean isCloseRequested() {
    return Display.isCloseRequested();
  }
  
  public static void close() {
    
    if(axis != null) {
      axis.cleanUp();
      axis = null;
    }
    StackedSphere.cleanUp();
    materialManager.cleanUp();
    
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
  
  private static void initAxis() {
    
    Material axisMaterial = materialManager.getMaterial("resources/materials/color.xml");
    
    /*String fragmentShader = 
      "varying vec4 v_Color;\n" +

      "void main(void) {\n" +
      "    gl_FragColor = v_Color;\n" +
      "}\n";
    
    String vertexShader = 
      "attribute vec3 a_Position;\n" +
      "attribute vec4 a_Color;\n\n" +
      
      "varying vec4 v_Color;\n\n" +

       "uniform mat4 u_World;\n" +
       "uniform mat4 u_ViewProj;\n\n" +
    
       "void main(void) {\n" +
       "    gl_Position = u_ViewProj * u_World * vec4(a_Position, 1.0);\n" +
       "    v_Color = a_Color;\n" +
       "}\n";
    
    ShaderObject axisShader = new ShaderObject(vertexShader, fragmentShader);
    
    Material axisMaterial = new Material();
    axisMaterial.shader             = axisShader;
    axisMaterial.positionName       = "a_Position";
    axisMaterial.colorName          = "a_Color";
    axisMaterial.worldMatrixName    = "u_World";
    axisMaterial.viewProjMatrixName = "u_ViewProj";*/
    
    Vertex[] axisVertex = {
        new Vertex.PositionColor(0, 0, 0, 1, 1, 1, 1),
        new Vertex.PositionColor(1, 0, 0, 1, 0, 0, 1),
        new Vertex.PositionColor(0, 1, 0, 0, 1, 0, 1),
        new Vertex.PositionColor(0, 0, 1, 0, 0, 1, 1),
                          };
    
    int indexos[] = {0,1,0,2,0,3};
    
    axis = new StaticMesh(axisMaterial, axisVertex, indexos, GL_LINES);
  }
  
  public void drawAxis(Vector3f position) {
    Matrix4f world = new Matrix4f();
    world.setIdentity();
    if(position!=null) {
      world.setTranslation(position);
    }
    if(axis == null) {
      initAxis();
    }
    axis.render(world, this);
  }
  
  public void renderGraph() {
    
    proves.activate();
    
    Matrix4f id = new Matrix4f();
    id.setIdentity();
    for(int node : childs.get(-1)) {
      renderNode(node, id);
    }
    
    /*
    GL20.glUseProgram(0);
    float posy = 30;
    Color.white.bind();
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    glOrtho(0, 800, 600, 0, 1, -1);
    glMatrixMode(GL_MODELVIEW);
    UnicodeFont ttf = fonts.get("Times New Roman");
    for(Entry<String, Float> fps : perThreadFPSs.entrySet()) {
      ttf.drawString(0, posy, fps.getKey() + ": " + fps.getValue(), Color.blue);
      posy += 25;
    }*/
  }
  
  public void renderNode(int node, Matrix4f stackedMatrix) {
    
    Node n = nodes.get(node);

    Matrix4f localTransform = new Matrix4f(stackedMatrix);
    Matrix4f auxTransform = new Matrix4f();
    n.getLocalTransform(auxTransform);
    localTransform.mul(auxTransform);
    
    //TODO spheres etc...
    StackedSphere ss = spheres.get(node);
    if(ss != null) {
      ss.render(null, localTransform, this);
    }
    
    Set<Integer> childs = this.childs.get(node);
    if(childs != null) {
      for(int child : childs) {
        renderNode(child, localTransform);
      }
    }
  }
  
  public void setFPS(String thread, float fps) {
    perThreadFPSs.put(thread, fps);
  }
 
}

