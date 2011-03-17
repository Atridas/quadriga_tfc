package cat.quadriga.render.simple;

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
  
  public void getLocalTransform(Matrix4f out) {
    if(!matrixUpdated) {
      localTransform.setIdentity();
      localTransform.setRotation(rotation);
      localTransform.setScale(scale);
      localTransform.setTranslation(translation);
    }
    out.set( localTransform );
  }
  
}
