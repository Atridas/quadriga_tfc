package cat.quadriga.render.simple;

import java.io.File;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import cat.quadriga.Utils;

public class MaterialManager {
  private static Logger logger = Logger.getLogger(MaterialManager.class.getCanonicalName());
  
  private final Map<String, SoftReference<Material>> materials = new HashMap<String, SoftReference<Material>>();
  
  public Material getMaterial(String file) {
    Material material = null;
    SoftReference<Material> mat = materials.get(file);
    if(mat != null) {
      material = mat.get();
      if(material != null) {
        return material;
      }
    }
    
    try {
      String alias = null;
      material = new Material();
      
      File f = null;
      logger.info("Parsing " + file);
      
      f = Utils.findFile(file);
      
      
      DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      Document doc = db.parse(f);
      doc.getDocumentElement().normalize();
      
      Element materialXML = doc.getDocumentElement();
      if("material".compareTo(materialXML.getTagName()) != 0) {
        throw new Exception("Root element is not \"material\".");
      }
      
      Node name = materialXML.getAttributes().getNamedItem("name");
      if(name != null) {
        alias = name.getNodeValue();
      }

      Element vsXML = (Element)materialXML.getElementsByTagName("vertex_shader").item(0);
      Element fsXML = (Element)materialXML.getElementsByTagName("fragment_shader").item(0);
      if(vsXML == null) {
        throw new Exception("\"vertex_shader\" not found.");
      }
      if(fsXML == null) {
        throw new Exception("\"fragment_shader\" not found.");
      }
      
      
      InputStream is;
      NodeList nl = vsXML.getElementsByTagName("file");
      String vs = "";
      for(int i = 0; i < nl.getLength(); ++i) {
        is = Utils.findInputStream( ((Element)nl.item(i)).getTextContent() );
        vs += Utils.readInputStream(is);
      }
      
      nl = fsXML.getElementsByTagName("file");
      String fs = "";
      for(int i = 0; i < nl.getLength(); ++i) {
        is = Utils.findInputStream( ((Element)nl.item(i)).getTextContent() );
        fs += Utils.readInputStream(is);
      }
      
      
      material.shader = new ShaderObject(vs, fs);
      
      Element uniformsXML = (Element)materialXML.getElementsByTagName("uniforms").item(0);
      if(uniformsXML == null) {
        logger.warning("shader without uniforms");
      } else {
        nl = uniformsXML.getChildNodes();
        
        int maxUnit = -1;
        
        for(int i = 0; i < nl.getLength(); ++i) {
          Node node = nl.item(i);
          if(node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            if("world".compareTo(element.getTagName()) == 0) {
              material.worldMatrixName = element.getTextContent();
              
            } else if("view".compareTo(element.getTagName()) == 0) {
              material.viewMatrixName = element.getTextContent();
              
            } else if("projection".compareTo(element.getTagName()) == 0) {
              material.projMatrixName = element.getTextContent();
              
            } else if("world_view".compareTo(element.getTagName()) == 0) {
              material.worldViewMatrixName = element.getTextContent();
              
            } else if("view_projection".compareTo(element.getTagName()) == 0) {
              material.viewProjMatrixName = element.getTextContent();
              
            } else if("world_view_projection".compareTo(element.getTagName()) == 0) {
              material.worldViewProjMatrixName = element.getTextContent();
              
              
            } else if("texture".compareTo(element.getTagName()) == 0) {
              String unit = element.getAttribute("unit");
              if(unit == null) {
                maxUnit++;
                logger.warning(
                    "texture uniform " + element.getTextContent()
                    + " has no unit! Setting it to " + maxUnit);
                material.textures.put(maxUnit, element.getTextContent());
              } else {
                try {
                  int u = Integer.parseInt(unit);
                  material.textures.put(u, element.getTextContent());
                } catch(NumberFormatException e) {
                  maxUnit++;
                  logger.warning(
                      "texture uniform " + element.getTextContent()
                      + " has ill-formated unit! Setting it to " + maxUnit);
                  material.textures.put(maxUnit, element.getTextContent());
                }
              }
            } //TODO else 
          }
        }
      }
      
      Element attributesXML = (Element)materialXML.getElementsByTagName("attributes").item(0);
      if(attributesXML == null) {
        logger.warning("shader without uniforms");
      } else {
        nl = attributesXML.getChildNodes();
        for(int i = 0; i < nl.getLength(); ++i) {
          Node node = nl.item(i);
          if(node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            if("color".compareTo(element.getTagName()) == 0) {
              material.colorName = element.getTextContent();
              
            } else if("position".compareTo(element.getTagName()) == 0) {
              material.positionName = element.getTextContent();
              
            } else if("normal".compareTo(element.getTagName()) == 0) {
              material.normalName = element.getTextContent();
              
            } else if("st".compareTo(element.getTagName()) == 0) {
              material.stName = element.getTextContent();
              
            } else if("st2".compareTo(element.getTagName()) == 0) {
              material.st2Name = element.getTextContent();
              
            } else if("tangent".compareTo(element.getTagName()) == 0) {
              material.tangentName = element.getTextContent();
              
            } else if("bitangent".compareTo(element.getTagName()) == 0) {
              material.bitangentName = element.getTextContent();
            } //TODO else 
          }
        }
      }
      
      materials.put(file, new SoftReference<Material>(material));
      if(alias != null) {
        materials.put(alias, new SoftReference<Material>(material));
      }
    } catch(Exception e) {
      logger.warning(e.toString());
      material = null;
    }
    
    return material;
  }
  
  public void cleanUp() {
    for(SoftReference<Material> mat : materials.values()) {
      Material material = mat.get();
      if(material != null)
        material.cleanUp();
    }
    materials.clear();
  }
}
