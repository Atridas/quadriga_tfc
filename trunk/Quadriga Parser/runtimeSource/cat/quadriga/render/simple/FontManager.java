package cat.quadriga.render.simple;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.vecmath.Matrix4f;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

import static org.lwjgl.opengl.GL11.GL_UNSIGNED_INT;
import static org.lwjgl.opengl.GL11.glDrawElements;
import static org.lwjgl.opengl.GL15.*;

public class FontManager {
  private static Logger logger = Logger.getLogger(FontManager.class.getCanonicalName());
  
  private Map<String, SoftReference<Font>> fonts = new HashMap<String, SoftReference<Font>>();
  private static Font defaultFont = new Font.NullFont();
  public final RenderManager rm;
  
  private int vertexBuffer = -1, indexBuffer = -1;
  private int vbLen = 0, ibLen = 0;
  
  private int u_WVPmatrix, a_position, a_texCoord, a_channel, a_page, u_tex0;
  
  private ShaderObject shader = null;
  
  public FontManager(RenderManager rm) {
    this.rm = rm;
  }
  
  public Font getFont(String file) {
    Font font = null;
    SoftReference<Font> fo = fonts.get(file);
    if(fo != null) {
      font = fo.get();
      if(font != null) {
        return font;
      }
    }
    
    
    try {
      font = new Font(file, rm);
    } catch (IOException e) {
      font = defaultFont;
      logger.warning(e.toString());
    } catch (Exception e) {
      font = defaultFont;
      logger.warning("Returning default font");
    }
    fonts.put(file, new SoftReference<Font>(font));
    return font;
  }
  
  public void printString(String font, String text, Matrix4f WVPmatrix) {
    printString(getFont(font), text, WVPmatrix);
  }
  
  public void printString(Font font, String text, Matrix4f WVPmatrix) {
    int len = text.length();
    int buffer1Size = Font.getVertexSize() * len * 4;
    ByteBuffer buffer1 = BufferUtils.createByteBuffer(buffer1Size);
    IntBuffer  buffer2 = BufferUtils.createIntBuffer(len * 6);
    
    Texture tex[] = new Texture[font.numTextures()];
    
    font.fillBuffers(text, buffer1, buffer2, tex);
    
    buffer1.rewind();
    buffer2.rewind();
    
    //Actualitzar el buffer de vertexos
    if(vbLen < buffer1Size) {
      if(vertexBuffer == -1) {
        vertexBuffer = glGenBuffers();
      }
      vbLen = buffer1Size;
      glBindBuffer(GL_ARRAY_BUFFER, vertexBuffer);
      glBufferData(GL_ARRAY_BUFFER, buffer1, GL_DYNAMIC_DRAW);
      
    } else {
      glBindBuffer(GL_ARRAY_BUFFER, vertexBuffer);
      glBufferSubData(GL_ARRAY_BUFFER, 0, buffer1);
    }
    
    //Actualitzar el buffer de indexos
    if(ibLen < len * 6) {
      if(indexBuffer == -1) {
        indexBuffer = glGenBuffers();
      }
      ibLen = len * 6;
      glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, indexBuffer);
      glBufferData(GL_ELEMENT_ARRAY_BUFFER, buffer2, GL_DYNAMIC_DRAW);
      
      //printBuffers(buffer1, buffer2);
    } else {
      glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, indexBuffer);
      glBufferSubData(GL_ELEMENT_ARRAY_BUFFER, 0, buffer2);
    }
    
    
    if(shader == null) {
      //shader = new ShaderObject(Font.VERTEX_SHADER, Font.FRAGMENT_SHADER_1_TEX);
      shader = RenderManager.getShaderManager().getShader(
                      Font.VERTEX_SHADER, 
                      Font.FRAGMENT_SHADER_1_TEX);
      u_WVPmatrix = shader.getUniform("u_WorldViewProj");
      u_tex0      = shader.getUniform("u_page0");
      a_position  = shader.getAttrib("a_position");
      a_texCoord  = shader.getAttrib("a_texCoord");
      a_channel   = shader.getAttrib("a_channel");
      a_page      = shader.getAttrib("a_page");
    }
    
    for(int i = 0; i < tex.length; ++i) {
      tex[i].activate(i);
    }
    
    shader.activate();

    shader.setUniform(u_WVPmatrix, WVPmatrix);
    shader.setTextureUniform(u_tex0, 0);
    
    Font.setAttributes(shader, a_position, a_texCoord, a_channel, a_page);
    
    glDrawElements(GL11.GL_TRIANGLES, len * 6, GL_UNSIGNED_INT, 0);
  }
  
  
  
  static void printBuffers(ByteBuffer bb, IntBuffer ib) {
    bb.rewind();
    ib.rewind();
    while(bb.hasRemaining()) {
      System.out.println(bb.position());
      System.out.println("p: " + bb.getInt() + ", " + bb.getInt());
      System.out.println("page: " + bb.getInt());
      System.out.println("t: " + bb.getFloat() + ", " + bb.getFloat());
      System.out.println("channel: "  + bb.get() 
                                      + ", " + bb.get()
                                      + ", " + bb.get()
                                      + ", " + bb.get());
    }
    
    System.out.println("\n");
    
    while(ib.hasRemaining()) {
      System.out.println(
          ib.get() + ", " + ib.get() + ", " + ib.get() 
        + " : "
        + ib.get() + ", " + ib.get() + ", " + ib.get());
    }
    bb.rewind();
    ib.rewind();
  }
  
}
