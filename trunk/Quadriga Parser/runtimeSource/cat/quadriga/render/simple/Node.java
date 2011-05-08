package cat.quadriga.render.simple;

import java.util.ArrayList;
import java.util.List;

import javax.vecmath.Matrix4f;
import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;

public class Node {
  private Vector3f translation = new Vector3f();
  private Quat4f rotation = new Quat4f(0, 0, 0, 1);
  private float scale = 1.0f;
  
  private Matrix4f localTransform = new Matrix4f(
                                      1, 0, 0, 0, 
                                      0, 1, 0, 0, 
                                      0, 0, 1, 0, 
                                      0, 0, 0, 1);
  private boolean matrixUpdated = true;
  
  private Matrix4f matrixAux = new Matrix4f();
  
  public final int id;
  public final RenderManager rm;
  public StaticMesh staticMesh;
  public StackedSphere sphere;
  public Box box;
  public Font font;
  public String text;
  public final List<Node> childs = new ArrayList<Node>();
  
  public Node(int id, RenderManager rm) {
    this.id = id;
    this.rm = rm;
  }
  
  public void setTranslation(Vector3f translation) {
    this.translation.set(translation);
    matrixUpdated = false;
  }
  
  public void setRotation(Quat4f rotation) {
    this.rotation.set(rotation);
    matrixUpdated = false;
  }
  
  public void setScale(float scale) {
    this.scale = scale;
    matrixUpdated = false;
  }
  
  public void getLocalTranslation(Vector3f translation) {
    translation.set( this.translation );
  }
  
  public void getLocalTransform(Matrix4f out) {
    if(!matrixUpdated) {
      localTransform.setIdentity();
      localTransform.setRotation(rotation);
      localTransform.setScale(scale);
      localTransform.setTranslation(translation);
    }
    out.set( localTransform );
  }
  
  public void multLocalTransform(Matrix4f out) {
    if(!matrixUpdated) {
      localTransform.setIdentity();
      localTransform.setRotation(rotation);
      localTransform.setScale(scale);
      localTransform.setTranslation(translation);
    }
    out.mul( localTransform );
  }
  
  public void removeChild(int id) {
    for(int i = 0; i < childs.size(); i++) {
      if(childs.get(i).id == id) {
        childs.remove(i);
        return;
      }
    }
  }
  
  public void renderNode(Matrix4f stackedMatrix) {
    
    matrixAux.set(stackedMatrix);
    multLocalTransform(matrixAux);
    
    //TODO spheres etc...
    if(sphere != null) {
      sphere.render(null, matrixAux, rm);
    }
    if(box != null) {
      box.render(null, matrixAux, rm);
    }
    if(font != null && text != null) {
      //rm.fontManager.printString(font, text, matrixAux);
    }
    

    for(Node child : childs) {
      child.renderNode(matrixAux);
    }
    
  }
  
}
