package cat.quadriga.render.simple;

import java.util.logging.Logger;

import org.lwjgl.opengl.GL11;

public abstract class Texture {
  private static Logger logger = Logger.getLogger(Texture2D.class.getCanonicalName());
  
  protected int id;
  protected final RenderManager rm;
  
  protected Texture(RenderManager rm) {
    this.rm = rm;
  }

  
  public void activate() {
    assert !finalized;
    rm.activateTexture(getTarget(), id);
  }
  
  public static void noTexture() {
    GL11.glBindTexture(GL11.GL_TEXTURE_2D, 0);
  }
  
  public static enum FilterQuality {LOW, MID, HIGH, ULTRA}
  
  protected abstract int getTarget();
  
  protected static int getMinParameter(FilterQuality quality) {
    switch(quality) {
    case LOW:
      return GL11.GL_NEAREST_MIPMAP_NEAREST;
    case MID:
      return GL11.GL_NEAREST_MIPMAP_LINEAR;
    case HIGH:
      return GL11.GL_LINEAR_MIPMAP_NEAREST;
    case ULTRA:
      return GL11.GL_LINEAR_MIPMAP_LINEAR;
    default:
      logger.warning("Unknown Filter passed: " + quality);
      return GL11.GL_NEAREST_MIPMAP_NEAREST;
    }
  }
  
  protected static int getMagParameter(FilterQuality quality) {
    switch(quality) {
    case LOW:
    case MID:
      return GL11.GL_NEAREST;
    case HIGH:
    case ULTRA:
      return GL11.GL_LINEAR;
    default:
      logger.warning("Unknown Filter passed: " + quality);
      return GL11.GL_NEAREST;
    }
  }
  
  public void changeMinFilter(FilterQuality quality) {
    assert !finalized;
    int param = getMinParameter(quality);
    
    GL11.glTexParameteri(getTarget(), GL11.GL_TEXTURE_MIN_FILTER, param);
  }
  
  public void changeMagFilter(FilterQuality quality) {
    assert !finalized;
    int param = getMagParameter(quality);
    
    GL11.glTexParameteri(getTarget(), GL11.GL_TEXTURE_MAG_FILTER, param);
  }
  
  private volatile boolean finalized = false;
  public void cleanUp() {
    assert !finalized;
    
    GL11.glDeleteTextures(id);
    finalized = true;
  }
  
  @Override
  public void finalize() {
    if(!finalized)
      cleanUp();
  }
  
  /*public static class TextureProxy extends Texture {
    
    private int target;
    
    protected TextureProxy(Texture original) {
      super(original.rm);
      id = original.id;
      target = original.getTarget();
    }

    @Override
    protected int getTarget() {
      return target;
    }
    
  }*/
}
