package cat.quadriga.render.simple;

public abstract class VertexType {
  public abstract int getVertexSize();
  public int getPositionStride() {return 0;}
  public int getNormalStride()   {return 0;}
  public int getColorStride()    {return 0;}
  public int getUVStride()       {return 0;}
  public int getUV2Stride()      {return 0;}
  public int getTangentStride()  {return 0;}
  public int getBitangentStride(){return 0;}

}
