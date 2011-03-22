package cat.quadriga.render.simple;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.logging.Logger;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.GLU;
import org.newdawn.slick.opengl.ImageDataFactory;
import org.newdawn.slick.opengl.LoadableImageData;

import cat.quadriga.Utils;

public class Texture2D extends Texture {
  private static Logger logger = Logger.getLogger(TextureManager.class.getCanonicalName());
  
  public final int width;
  public final int height;
  
  public final boolean hasAlpha;

  public Texture2D(String resourceName, RenderManager rm) throws IOException {
    this(resourceName, resourceName.substring(resourceName.lastIndexOf('.')+1).toUpperCase(), false, rm);
  }

  public Texture2D(String resourceName, boolean greyscale, RenderManager rm) throws IOException {
    this(resourceName, resourceName.substring(resourceName.lastIndexOf('.')+1).toUpperCase(), greyscale, rm);
  }

  public Texture2D(String resourceName, String format, RenderManager rm) throws IOException {
    this(resourceName, format, false, rm);
  }
  
  public Texture2D(String resourceName, String format, boolean greyscale, RenderManager rm) throws IOException {
    super(rm);
    
    logger.info("Loading texture " + resourceName + " with format " + format);
    
    InputStream is = Utils.findInputStream(resourceName);
    
    LoadableImageData loader = ImageDataFactory.getImageDataFor(format);
    ByteBuffer bb = loader.loadImage(is);
    
    width = loader.getWidth();
    height = loader.getHeight();
    hasAlpha = loader.getDepth() == 32;

    IntBuffer temp = BufferUtils.createIntBuffer(16);
    GL11.glGetInteger(GL11.GL_MAX_TEXTURE_SIZE, temp);
    int max = temp.get(0);

    if ((width > max) || (height > max)) {
      throw new IOException("Attempt to allocate a texture to big for the current hardware");
    }

    int glFormat = hasAlpha ? GL11.GL_RGBA : GL11.GL_RGB;
    //int componentCount = hasAlpha ? 4 : 3;
    
    

    /*while(bb.hasRemaining()) {
      int b = bb.get() & 0xFF; 
      System.out.print(b);
      System.out.print("," );
      b = bb.get() & 0xFF; 
      System.out.print(b);
      System.out.print("," );
      b = bb.get() & 0xFF; 
      System.out.print(b);
      System.out.print("," );
      if(hasAlpha) {
        b = bb.get() & 0xFF; 
        System.out.print(b);
      }
      System.out.print("\n" );
    }
    bb.rewind();*/
    
    
    
    id = GL11.glGenTextures();
    
    
    activate();
    
    if(GLContext.getCapabilities().OpenGL30) {
      
      GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 
          0,               //mipmap level
          (greyscale)? GL11.GL_LUMINANCE : glFormat, 
          width, height, 
          0,               //Border
          glFormat, 
          GL11.GL_UNSIGNED_BYTE,            
          bb);
      
      GL30.glGenerateMipmap(GL11.GL_TEXTURE_2D);
    } else {
      GLU.gluBuild2DMipmaps(GL11.GL_TEXTURE_2D, 
          (greyscale)? GL11.GL_LUMINANCE : glFormat, 
          width, height, 
          glFormat, 
          GL11.GL_UNSIGNED_BYTE,            
          bb);
    }

    changeMagFilter(FilterQuality.MID);
    changeMinFilter(FilterQuality.MID);
  }
  
  public Texture2D(RenderManager rm) {
    super(rm);
    
    ByteBuffer bb = BufferUtils.createByteBuffer(256 * 256 * 3);
    
    byte[] baux = new byte[3];
    for(int i = 0; i < 256; ++i) {
      for(int j = 0; j < 256; ++j) {
        baux[0] = (byte)((i     % 16) * 16);
        baux[1] = (byte)((j     % 16) * 16);
        baux[2] = (byte)(((i+j) % 16) * 16);
        bb.put(baux);
      }
    }
    bb.rewind();
    
    width = 256;
    height = 256;
    hasAlpha = false;

    int glFormat = GL11.GL_RGB;
    id = GL11.glGenTextures();
    
    
    activate();
    
    if(GLContext.getCapabilities().OpenGL30) {
      
      GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 
          0,               //mipmap level
          glFormat, 
          width, height, 
          0,               //Border
          glFormat, 
          GL11.GL_UNSIGNED_BYTE,            
          bb);
      
      GL30.glGenerateMipmap(GL11.GL_TEXTURE_2D);
    } else {
      GLU.gluBuild2DMipmaps(GL11.GL_TEXTURE_2D, 
          glFormat, 
          width, height, 
          glFormat, 
          GL11.GL_UNSIGNED_BYTE,            
          bb);
    }

    changeMagFilter(FilterQuality.MID);
    changeMinFilter(FilterQuality.MID);
  }

  @Override
  protected int getTarget() {
    return GL11.GL_TEXTURE_2D;
  }
}
