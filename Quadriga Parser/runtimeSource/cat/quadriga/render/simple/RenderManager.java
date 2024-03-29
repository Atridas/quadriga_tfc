package cat.quadriga.render.simple;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;

import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import cat.quadriga.render.simple.materials.BaseMaterial;
import cat.quadriga.render.simple.materials.MaterialManager;

public final class RenderManager {
  private Map<Integer, Node> nodes = new HashMap<Integer, Node>();
  private Map<Integer, Integer> parents = new HashMap<Integer, Integer>();
  private Map<Integer, Set<Integer>> childs = new HashMap<Integer, Set<Integer>>();
  private Map<Integer, StaticMesh> meshes = new HashMap<Integer, StaticMesh>();
  private Map<Integer, StackedSphere> spheres = new HashMap<Integer, StackedSphere>();
  private Map<Integer, Box> boxes = new HashMap<Integer, Box>();

  public final TextureManager textureManager = new TextureManager(this);
  public final FontManager fontManager = new FontManager(this);
  
  private Map<String, Float> perThreadFPSs = new HashMap<String, Float>();
  public boolean renderFPS = false;
  
  private final Matrix4f viewMatrix = new Matrix4f();
  private final Matrix4f projectionMatrix = new Matrix4f();
  private final Vector3f cameraPosition = new Vector3f();
  
  private static Map<String, RenderManager> instances = new HashMap<String, RenderManager>();
  public final static RenderManager instance = new RenderManager();
  private static StaticMesh axis;
  private static final MaterialManager materialManager = new MaterialManager();
  private static final ShaderManager shaderManager = new ShaderManager();
  private static int width, height;
  
  
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
      node = new Node(id, this);
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
      if(parent>=0)nodes.get(parent).removeChild(child);
    }
    
    Set<Integer> childs = this.childs.get(parent);
    if(childs == null) {
      childs = new HashSet<Integer>();
      this.childs.put(parent, childs);
    }
    childs.add(child);
    parents.put(child,parent);
    if(parent>=0)nodes.get(parent).childs.add(nodes.get(child));
  }
  
  public void setSphere(int position, float radi) {
    StackedSphere sphere = new StackedSphere(radi, 30, 30);
    spheres.put(position, sphere);
    
    nodes.get(position).sphere = sphere;
  }
  
  public void changeSphere(int position, float radi) {
    spheres.get(position).radi = radi;
  }
  
  public void deleteSphere(int position) {
    spheres.remove(position);
    nodes.get(position).sphere = null;
  }
  
  public void setBox(int position) {
    Box box = new Box();
    boxes.put(position, box);
    
    nodes.get(position).box = box;
  }
  
  public void deleteBox(int position) {
    boxes.remove(position);
    nodes.get(position).box = null;
  }
  
  public void setText(int position, String fontFile, String text) {
    Font font = fontManager.getFont(fontFile);

    Node n = nodes.get(position);
    n.font = font;
    n.text = text;
  }
  
  public void deleteText(int position) {

    Node n = nodes.get(position);
    n.font = null;
    n.text = null;
  }
  
  public void setMaterial(int position, BaseMaterial material) {
    Node n = nodes.get(position);
    n.material = material;
  }
  
  public BaseMaterial getMaterial(int position) {
    Node n = nodes.get(position);
    return n.material;
  }
  
  public static MaterialManager getMaterialManager() {
    return materialManager;
  }
  
  public static ShaderManager getShaderManager() {
    return shaderManager;
  }
  
  void activateTexture(int target, int texture, int unit) {
    //if(lastTexture != texture) {
      glActiveTexture(GL_TEXTURE0 + unit);
      glBindTexture(target, texture);
    //  lastTexture = texture;
    //}
  }

  public void setPerspective(float fovy, float zNear, float zFar) {
    setPerspective(fovy, (float)width / height, zNear, zFar);
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
  
  public void setOrtho(
      float left, float right, 
      float top,  float bottom,
      float near, float far)
  {
    projectionMatrix.setColumn(0, 
        2 / (right-left),
        0,
        0,
        0);
    projectionMatrix.setColumn(1, 
        0,
        2 / (top-bottom),
        0,
        0);
    projectionMatrix.setColumn(2, 
        0,
        0,
        -2 / (far-near),
        0);
    projectionMatrix.setColumn(3, 
        -(right + left)/ (right-left),
        -(top + bottom)/ (top-bottom),
        -(far + near  )/ (far-near  ),
        1);
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
  
  public static void initGL(int w, int h) {
    width = w;
    height = h;
    try {
      Display.setDisplayMode(new DisplayMode(width,height));
      
      Display.create();

      glEnable(GL_CULL_FACE);
      
      glBlendFunc(GL_SRC_ALPHA, GL_ONE);
      
      /*try {
        Font f = new Font("resources/fonts/font0.fnt", instance);
        
        String helloWorld = "Hello World!";
        
        ByteBuffer bb = BufferUtils.createByteBuffer(helloWorld.length() * f.getVertexSize());
        IntBuffer ib = BufferUtils.createIntBuffer(helloWorld.length() * 6);
        Texture[] texs = new Texture[f.numTextures()];
        
        f.fillBuffers(helloWorld, bb, ib, texs);
        
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }*/
      
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
    
    BaseMaterial axisMaterial = materialManager.getMaterial("resources/materials/color.xml");
    
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
    textureManager.getTexture2D("resources/fonts/font0_0.png").activate(0);
    

    glEnable(GL_DEPTH_TEST);
    glDisable(GL_BLEND);

    Matrix4f identity = new Matrix4f();
    identity.setIdentity();
    for(int node : childs.get(-1)) {
      nodes.get(node).renderNode(identity);
      //renderNode(node, id);
    }


    setOrtho(0, width, 0, height, -1, 1);
    glDisable(GL_DEPTH_TEST);
    glEnable(GL_BLEND);
    
    if(renderFPS) {
      
      identity.mul(projectionMatrix);
      
      Font font = fontManager.getFont("resources/fonts/font14.fnt");
      String debugInfo = "";
      for(Entry<String, Float> fps : perThreadFPSs.entrySet()) {
        
        debugInfo += fps.getKey() + ": " + fps.getValue() + "\n";
      }
      fontManager.printString(font, debugInfo, identity);
    }
    renderTexts();
  }
  
  private void renderTexts() {
    Matrix4f matrix = new Matrix4f();
    Vector3f translation = new Vector3f();
    
    for(Node node: nodes.values())
    {
      if(node.font != null && node.text != null) {
        matrix.setIdentity();
        node.getLocalTranslation(translation);
        matrix.setTranslation(translation);
        
        matrix.mul(projectionMatrix, matrix);
        
        fontManager.printString(node.font, node.text, matrix);
      }
      
    }
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

