package cat.quadriga.render.simple;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.lwjgl.opengl.GL11;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import cat.quadriga.Utils;

public class Font {
  private static Logger logger = Logger.getLogger(Font.class.getCanonicalName());
  
  public final int width, height, lineHeight, highestChar;
  
  private final Map<Integer, Texture> pages = new HashMap<Integer, Texture>();
  private final Map<Character, Char> chars = new HashMap<Character, Char>();
  private final Map<Kerning, Integer> kernings = new HashMap<Kerning, Integer>();
  
  public Font(String path, RenderManager rm) throws IOException {
    File f = null;
    logger.info("Parsing " + path);
    
    f = Utils.findFile(path);
    
    String folder = path.substring(0, path.lastIndexOf('/')+1);
    
    
    DocumentBuilder db;
    try {
      db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      Document doc = db.parse(f);
      doc.getDocumentElement().normalize();
      
      Element materialXML = doc.getDocumentElement();
      if("font".compareTo(materialXML.getTagName()) != 0) {
        throw new Exception("Root element is not \"font\".");
      }

      Element infoXML = (Element)materialXML.getElementsByTagName("info").item(0);
      Element commonXML = (Element)materialXML.getElementsByTagName("common").item(0);
      Element pagesXML = (Element)materialXML.getElementsByTagName("pages").item(0);
      Element charsXML = (Element)materialXML.getElementsByTagName("chars").item(0);
      Element kerningsXML = (Element)materialXML.getElementsByTagName("kernings").item(0);
      if(infoXML == null) {
        throw new Exception("\"info\" not found.");
      }
      if(commonXML == null) {
        throw new Exception("\"common\" not found.");
      }
      if(pagesXML == null) {
        throw new Exception("\"pages\" not found.");
      }
      if(charsXML == null) {
        throw new Exception("\"chars\" not found.");
      }
      /*if(kerningsXML == null) {
        throw new Exception("\"kernings\" not found.");
      }*/

      width = Integer.parseInt( commonXML.getAttribute("scaleW") );
      height = Integer.parseInt( commonXML.getAttribute("scaleH") );
      lineHeight = Integer.parseInt( commonXML.getAttribute("lineHeight") ) + 1;

      NodeList nl = pagesXML.getElementsByTagName("page");
      for(int i = 0; i < nl.getLength(); ++i) {
        Element page = ((Element)nl.item(i));
        int id = Integer.parseInt( page.getAttribute("id") );
        String file = page.getAttribute("file");
        
        Texture tex = rm.textureManager.getTexture2D(folder + file, true);
        pages.put(id, tex);
      }
      
      int charMax = 0;
      nl = charsXML.getElementsByTagName("char");
      for(int i = 0; i < nl.getLength(); ++i) {
        Element charInfo = ((Element)nl.item(i));
        int id = Integer.parseInt( charInfo.getAttribute("id") );
        char idC = (char) id;
        charMax = (charMax > id)? charMax : id;
        
        Char charObj = new Char();

        charObj.x = (float)Integer.parseInt( charInfo.getAttribute("x") ) / width;
        charObj.y = (float)(height - Integer.parseInt( charInfo.getAttribute("y") )) / height;
        
        charObj.width = Integer.parseInt( charInfo.getAttribute("width") );
        charObj.height = Integer.parseInt( charInfo.getAttribute("height") );
        charObj.xoffset = Integer.parseInt( charInfo.getAttribute("xoffset") );
        charObj.yoffset = Integer.parseInt( charInfo.getAttribute("yoffset") );
        charObj.xadvance = Integer.parseInt( charInfo.getAttribute("xadvance") );
        charObj.page = Integer.parseInt( charInfo.getAttribute("page") );
        charObj.chanel = Integer.parseInt( charInfo.getAttribute("chnl") );
        if(charObj.chanel == 15) charObj.chanel = 0;

        charObj.fwidth  = (float) charObj.width / width;
        charObj.fheight = (float) charObj.height / height;
        
        chars.put(idC, charObj);
      }
      highestChar = charMax;
      
      if(kerningsXML != null) {
        nl = kerningsXML.getElementsByTagName("kerning");
        for(int i = 0; i < nl.getLength(); ++i) {
          Element kerningInfo = ((Element)nl.item(i));
          Kerning kerning = new Kerning();
          kerning.first = (char)Integer.parseInt( kerningInfo.getAttribute("first") );
          kerning.second = (char)Integer.parseInt( kerningInfo.getAttribute("second") );
          
          int amount = Integer.parseInt( kerningInfo.getAttribute("amount") );
          
          kernings.put(kerning, amount);
        }
      }
    } catch (Exception e) {
      logger.severe("Problem loading font " + e.toString());
      throw new IllegalArgumentException(e);
    }
  }
  
  public static int getVertexSize() {
    return 3 * Integer.SIZE / 8  // x, y .. textureId
         + 2 * Float.SIZE   / 8  // s, t
         + 4 * Byte.SIZE    / 8; // channel
  }
  
  public int numTextures() {
    return pages.size();
  }
  
  public void fillBuffers(CharSequence characters, ByteBuffer vertexBuffer, IntBuffer indexBuffer, Texture[] textures) {
    
    for(Entry<Integer, Texture> page : pages.entrySet()) {
      textures[page.getKey()] = page.getValue();
    }
    
    int x = 0, y = 0;
    char lastChar = 0;
    for(int i = 0; i < characters.length(); ++i) {
      char c = characters.charAt(i);
      Char charObj = chars.get(c);
      
      if(c == '\n') {
        x = 0;
        y += lineHeight;
        charObj = (charObj == null)? new Char() : charObj;
      }
      
      if(charObj == null) {
        logger.warning("Trying to print missing character '" + c + "' - " + (int)c);
        charObj = new Char();
      }

      Integer kerning = kernings.get(new Kerning(lastChar,c));
      if(kerning != null) x += kerning;

      int x0Coord = x                  + charObj.xoffset;
      int y0Coord = y                  + charObj.yoffset;
      int x1Coord = x + charObj.width  + charObj.xoffset;
      int y1Coord = y + charObj.height + charObj.yoffset;

      float s0 = charObj.x;
      float t0 = charObj.y;
      float s1 = charObj.x + charObj.fwidth;
      float t1 = charObj.y - charObj.fheight;
      
      //vertex 00
      vertexBuffer.putInt(x0Coord); //x
      vertexBuffer.putInt(y0Coord); //y
      
      vertexBuffer.putInt(charObj.page);   //page

      vertexBuffer.putFloat(s0);
      vertexBuffer.putFloat(t0);

      vertexBuffer.put((byte)(charObj.chanel & 8)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 4)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 2)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 1)); //channel
      
      //vertex 10
      vertexBuffer.putInt(x1Coord); //x
      vertexBuffer.putInt(y0Coord); //y

      vertexBuffer.putInt(charObj.page);   //page

      vertexBuffer.putFloat(s1);
      vertexBuffer.putFloat(t0);

      vertexBuffer.put((byte)(charObj.chanel & 8)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 4)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 2)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 1)); //channel
      
      //vertex 11
      vertexBuffer.putInt(x1Coord); //x
      vertexBuffer.putInt(y1Coord); //y

      vertexBuffer.putInt(charObj.page);   //page

      vertexBuffer.putFloat(s1);
      vertexBuffer.putFloat(t1);

      vertexBuffer.put((byte)(charObj.chanel & 8)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 4)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 2)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 1)); //channel
      
      //vertex 01
      vertexBuffer.putInt(x0Coord); //x
      vertexBuffer.putInt(y1Coord); //y

      vertexBuffer.putInt(charObj.page);   //page

      vertexBuffer.putFloat(s0);
      vertexBuffer.putFloat(t1);

      vertexBuffer.put((byte)(charObj.chanel & 8)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 4)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 2)); //channel
      vertexBuffer.put((byte)(charObj.chanel & 1)); //channel
      
      
      //triangles
      indexBuffer.put(i*4 + 0);
      indexBuffer.put(i*4 + 3);
      indexBuffer.put(i*4 + 1);

      indexBuffer.put(i*4 + 1);
      indexBuffer.put(i*4 + 3);
      indexBuffer.put(i*4 + 2);

      x += charObj.xadvance;
      lastChar = c;
    }
  }
  
  public static void setAttributes(
      ShaderObject shader,
      int position,
      int texCoord,
      int channel,
      int page)
  {
    int vsize = getVertexSize();
    shader.setAttribBufferedPointer(
        position, 2, GL11.GL_INT, false, vsize, 0);

    shader.setAttribBufferedPointer(
        page, 1, GL11.GL_INT, false, vsize, Integer.SIZE / 8 * 2);

    shader.setAttribBufferedPointer(
        texCoord, 2, GL11.GL_FLOAT, false, vsize, Integer.SIZE / 8 * 3);

    shader.setAttribBufferedPointer(
        channel, 4, GL11.GL_BYTE, false, vsize, Integer.SIZE / 8 * 3
                                              + Float.SIZE   / 8 * 2);
    
  }
  
  private static class Char {
    float x, y, fwidth, fheight; 
    int width, height, xoffset, yoffset, xadvance, page, chanel;
  }
  
  private class Kerning {
    char first, second;

    Kerning(){}
    Kerning(char f, char s){first = f; second = s;}
    
    @Override
    public int hashCode() {
      return first * highestChar + second;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Kerning other = (Kerning) obj;
      if (first != other.first)
        return false;
      if (second != other.second)
        return false;
      return true;
    }
  }
  
  private Font() {width = height = lineHeight = highestChar = 0;}
  
  static final class NullFont extends Font {

    public NullFont() {super();}
    public void fillBuffers(CharSequence characters, ByteBuffer vertexBuffer, IntBuffer indexBuffer, Texture[] textures) {}
    
  }
  

  public static final String VERTEX_SHADER = 
    "attribute vec2  a_position;\n"
  + "attribute vec2  a_texCoord;\n"
  + "attribute vec4  a_channel;\n"
  + "attribute float a_page;\n"
  + "\n"
  + "varying vec2 v_texCoord;\n"
  + "varying vec4 v_channel;\n"
  + "varying float v_page;\n"
  + "\n"
  + "uniform mat4 u_WorldViewProj;\n"
  + "\n"
  + "void main() {" 
  + "  gl_Position = u_WorldViewProj * vec4(a_position, 0, 1);\n"
  + "  v_texCoord  = a_texCoord;\n"
  + "  v_channel   = a_channel;\n"
  + "  v_page      = a_page;\n"
  + "}\n";
  

  public static final String FRAGMENT_SHADER_1_TEX =
    "varying vec2 v_texCoord;\n"
  + "varying vec4 v_channel;\n"
  + "//varying int  v_page;\n"
  + "\n"
  + "uniform sampler2D u_page0;\n"
  + "\n"
  + "void main() {" 
  + "  vec4 pixel = texture2D(u_page0, v_texCoord);\n"
  + "  float val  = dot(v_channel, pixel);\n"
  + "  if(val == 0.0) {\n"
  + "    val = pixel.x;\n"
  + "  }\n"
  + "  gl_FragColor = vec4(val,val,val,val);\n"
  + "}\n";
}
