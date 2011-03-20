package cat.quadriga.render.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.vecmath.Matrix4f;

public class StackedSphere {
  public float radi;
  public int stacks;
  public int slices;

  private static Map<Integer, Map<Integer, StaticMesh>> meshes = new HashMap<Integer, Map<Integer, StaticMesh>>();
  
  private static Material defaultMaterial = null;
  
  public StackedSphere(float radi, int stacks, int slices) {
    this.radi = radi;
    this.stacks = stacks;
    this.slices = slices;
    
    if(defaultMaterial == null) {
      defaultMaterial = RenderManager.getMaterialManager().getMaterial("resources/materials/color.xml");
    }
    
    findStaticMesh(stacks, slices);
  }
  
  private static StaticMesh findStaticMesh(int stacks, int slices) {
    Map<Integer,StaticMesh> forSlices = meshes.get(stacks);
    if(forSlices == null) {
      forSlices = new HashMap<Integer, StaticMesh>();
      meshes.put(stacks, forSlices);
    }
    
    StaticMesh mesh = forSlices.get(slices);
    if(mesh == null) {
      mesh = createMesh(stacks,slices);
      forSlices.put(slices, mesh);
    }
    return mesh;
  }
  
  public void render(Material material, Matrix4f world, RenderManager rm) {
    StaticMesh mesh = findStaticMesh(stacks, slices);
    
    if(material == null) {
      material = defaultMaterial;
    }
    
    mesh.setMaterial(material);
    
    Matrix4f scale = new Matrix4f(radi,0,0,0,
                                  0,radi,0,0,
                                  0,0,radi,0,
                                  0,0,0,   1);
    
    Matrix4f aux = new Matrix4f(world);
    aux.mul(scale);
    
    mesh.render(aux, rm);
  }
  
  // xyz, nx, ny, nz, u, v
  public static final int VERTEX_SIZE = 8 * Float.SIZE;
  
  private static StaticMesh createMesh(int stacks, int slices) {
    List<Vertex> vertexBuffer = new ArrayList<Vertex>();
    for (int stackNumber = 0; stackNumber <= stacks; ++stackNumber)
    {
      for (int sliceNumber = 0; sliceNumber < slices; ++sliceNumber) 
      {
        float theta = (float)(stackNumber * Math.PI / stacks);
        float phi = (float)(sliceNumber * 2 * Math.PI / slices);
        float sinTheta = (float) Math.sin(theta);
        float sinPhi = (float) Math.sin(phi);
        float cosTheta = (float) Math.cos(theta);
        float cosPhi = (float) Math.cos(phi);
        
        float x = cosPhi * sinTheta;
        float y = sinPhi * sinTheta;
        float z = cosTheta;
        
        vertexBuffer.add(new Vertex.PositionNormalColor(
                            x, y, z,    //pos
                            x, y, z,    //normal
                            Math.abs(x), Math.abs(y), Math.abs(z), 1  //color
                            ));
      }
    }
    List<Integer> indexBuffer = new ArrayList<Integer>();
    for (int stackNumber = 0; stackNumber < stacks; ++stackNumber)
    {
      for (int sliceNumber = 0; sliceNumber <= slices; ++sliceNumber)
      {
        //indexBuffer.add((stackNumber * slices) + (sliceNumber % slices));
        //indexBuffer.add(((stackNumber + 1) * slices) + (sliceNumber % slices));
        
        indexBuffer.add((stackNumber * slices) + (sliceNumber % slices));
        indexBuffer.add(((stackNumber + 1) % stacks * slices) + (sliceNumber % slices));
        indexBuffer.add(((stackNumber + 1) % stacks * slices) + ((sliceNumber+1) % slices));
        
        indexBuffer.add((stackNumber * slices) + (sliceNumber % slices));
        indexBuffer.add(((stackNumber + 1) % stacks * slices) + ((sliceNumber+1) % slices));
        indexBuffer.add(((stackNumber) * slices) + ((sliceNumber+1) % slices));
        
      }
    }
    
    Vertex[] vb = vertexBuffer.toArray(new Vertex[vertexBuffer.size()]);
    int[] indexes = new int[indexBuffer.size()];
    for(int i = 0; i < indexes.length; ++i) {
      indexes[i] = indexBuffer.get(i);
    }
    
    return new StaticMesh(defaultMaterial, vb, indexes);
  }
  
  public static synchronized void cleanUp() {
    for(Map<Integer, StaticMesh> map : meshes.values()) {
      for(StaticMesh mesh : map.values()) {
        mesh.cleanUp();
      }
    }
  }
}
