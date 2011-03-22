package cat.quadriga.render.simple;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class TextureManager {
  private static Logger logger = Logger.getLogger(TextureManager.class.getCanonicalName());
  
  private Map<String, SoftReference<Texture>> textures = new HashMap<String, SoftReference<Texture>>();
  Texture defaultTexture = null;
  private final RenderManager rm;
  
  
  public TextureManager(RenderManager renderManager) {
    rm = renderManager;
  }
  
  public Texture getTexture2D(String resourceName) {
    return getTexture2D(resourceName, resourceName.substring(resourceName.lastIndexOf('.')+1).toUpperCase(), false);
  }

  public Texture getTexture2D(String resourceName, boolean greyscale) {
    return getTexture2D(resourceName, resourceName.substring(resourceName.lastIndexOf('.')+1).toUpperCase(), greyscale);
  }

  public Texture getTexture2D(String resourceName, String format) {
    return getTexture2D(resourceName, format, false);
  }
  
  public Texture getTexture2D(String resourceName, String format, boolean greyscale) {
    SoftReference<Texture> softTex = textures.get(resourceName);
    Texture tex;
    if(softTex != null) {
      tex = softTex.get();
      if(tex != null)
        return tex;
    }
    
    try {
      tex = new Texture2D(resourceName, format, greyscale, rm);
    } catch (Exception e) {
      logger.severe("Error loading texture " + e.toString());
      if(defaultTexture == null) {
        defaultTexture = new Texture2D(rm);
      }
      tex = defaultTexture;
    }
    textures.put(resourceName, new SoftReference<Texture>(tex));
    
    return tex;
  }
  
  
  
}
