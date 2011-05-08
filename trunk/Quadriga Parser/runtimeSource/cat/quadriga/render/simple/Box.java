package cat.quadriga.render.simple;


import javax.vecmath.Matrix4f;

import cat.quadriga.render.simple.materials.Material;

public class Box {
  private static boolean initialized;
  
  private static Material defaultMaterial;
  private static StaticMesh mesh;
  
  public Box() {
    if(!initialized) {
      init();
    }
  }
  
  private static synchronized void init() {
    if(!initialized) {
      initialized = true;
      
      Vertex[] vertexs = {
          new Vertex.PositionColor( +0.5f, -0.5f, 0.0f, 1,0,0,1),
          new Vertex.PositionColor( +0.5f, +0.5f, 0.0f, 1,1,0,1),
          new Vertex.PositionColor( +0.5f, +0.5f, 1.0f, 1,1,1,1),
          new Vertex.PositionColor( +0.5f, -0.5f, 1.0f, 1,0,1,1),

          new Vertex.PositionColor( -0.5f, -0.5f, 0.0f, 0,0,0,1),
          new Vertex.PositionColor( -0.5f, +0.5f, 0.0f, 0,1,0,1),
          new Vertex.PositionColor( -0.5f, +0.5f, 1.0f, 0,1,1,1),
          new Vertex.PositionColor( -0.5f, -0.5f, 1.0f, 0,0,1,1),
      };
      
      int[] indexes = { 0,1,2, 0,2,3, //front
                        7,6,5, 7,5,4, //back
                        
                        1,5,6, 1,6,2, //right
                        0,3,7, 0,7,4, //left
                        
                        2,6,7, 2,7,3, //top
                        0,4,1, 4,5,1  //bottom
      };
      
      
      defaultMaterial = RenderManager.getMaterialManager().getMaterial("resources/materials/color.xml");
      
      mesh = new StaticMesh(defaultMaterial, vertexs, indexes);
    }
  }
  
  public void render(Material material, Matrix4f world, RenderManager rm) {
    if(material == null) {
      mesh.setMaterial(defaultMaterial);
    } else {
      mesh.setMaterial(material);
    }
    mesh.render(world, rm);
  }
}
