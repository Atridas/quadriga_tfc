package cat.quadriga.render.simple;

import javax.vecmath.Matrix4f;

public interface RenderableObject {
  Matrix4f getLocalTransform();
}
