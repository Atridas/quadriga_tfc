package cat.quadriga.render.simple;

import java.nio.ByteBuffer;

public abstract class Vertex {

  public abstract void writeToBuffer(ByteBuffer buffer);
  public abstract void readFromBuffer(ByteBuffer buffer);
  public abstract VertexType getVertexType();
  
  public static final class PositionColor extends Vertex {
    public float x, y, z;
    public float r, g, b, a;
    
    public PositionColor(){};
    
    public PositionColor(
        float x, float y, float z, 
        float r, float g, float b, float a) {
      this.x = x;
      this.y = y;
      this.z = z;
      
      this.r = r;
      this.g = g;
      this.b = b;
      this.a = a;
    }

    public static final VertexType type = new VertexType () {
                                            @Override
                                            public int getVertexSize() {
                                              return 7 * Float.SIZE / 8;
                                            }
                                        
                                            @Override
                                            public int getPositionStride() {return 0;}
                                        
                                            @Override
                                            public int getColorStride()    {return 3 * Float.SIZE / 8;}
                                          };
    
    @Override
    public VertexType getVertexType() {
      return type;
    }
                                          
    @Override
    public void writeToBuffer(ByteBuffer buffer) {
      buffer.putFloat(x);
      buffer.putFloat(y);
      buffer.putFloat(z);

      buffer.putFloat(r);
      buffer.putFloat(g);
      buffer.putFloat(b);
      buffer.putFloat(a);
    }

    @Override
    public void readFromBuffer(ByteBuffer buffer) {
      x = buffer.getFloat();
      y = buffer.getFloat();
      z = buffer.getFloat();

      r = buffer.getFloat();
      g = buffer.getFloat();
      b = buffer.getFloat();
      a = buffer.getFloat();
    }
    
    @Override
    public String toString() {
      return "{ v:[" + x + "," + y + "," + z + "] c:[" 
                     + r + "," + g + "," + b + "," + a + "] }";
    }
  }
  
  public static final class PositionNormalColor extends Vertex {
    public float x, y, z;
    public float nx, ny, nz;
    public float r, g, b, a;
    
    public PositionNormalColor(){};
    
    public PositionNormalColor(
        float  x, float  y, float  z, 
        float nx, float ny, float nz, 
        float  r, float  g, float  b, float a) {
      this.x = x;
      this.y = y;
      this.z = z;
      
      this.nx = nx;
      this.ny = ny;
      this.nz = nz;
      
      this.r = r;
      this.g = g;
      this.b = b;
      this.a = a;
    }

    public static final VertexType type = new VertexType () {
                                            @Override
                                            public int getVertexSize() {
                                              return 10 * Float.SIZE / 8;
                                            }
                                        
                                            @Override
                                            public int getPositionStride() {return 0;}
                                        
                                            @Override
                                            public int getNormalStride()   {return 3 * Float.SIZE / 8;}
                                        
                                            @Override
                                            public int getColorStride()    {return 6 * Float.SIZE / 8;}
                                          };
    
    @Override
    public VertexType getVertexType() {
      return type;
    }
                                          
    @Override
    public void writeToBuffer(ByteBuffer buffer) {
      buffer.putFloat(x);
      buffer.putFloat(y);
      buffer.putFloat(z);
      
      buffer.putFloat(nx);
      buffer.putFloat(ny);
      buffer.putFloat(nz);

      buffer.putFloat(r);
      buffer.putFloat(g);
      buffer.putFloat(b);
      buffer.putFloat(a);
    }

    @Override
    public void readFromBuffer(ByteBuffer buffer) {
      x = buffer.getFloat();
      y = buffer.getFloat();
      z = buffer.getFloat();
      
      nx = buffer.getFloat();
      ny = buffer.getFloat();
      nz = buffer.getFloat();

      r = buffer.getFloat();
      g = buffer.getFloat();
      b = buffer.getFloat();
      a = buffer.getFloat();
    }
    
    @Override
    public String toString() {
      return "{ v:[" + x + "," + y + "," + z + "] n:["  
                     +nx + "," +ny + "," +nz + "] c:["
                     + r + "," + g + "," + b + "," + a + "] }";
    }
  }
}
