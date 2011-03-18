package cat.quadriga.render.simple;

import java.io.File;
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
  
  private final Map<String, Material> materials = new HashMap<String, Material>();
  
  public Material getMaterial(String file) {
    Material material = materials.get(file);
    if(material != null) {
      return material;
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
      
      NodeList nl = vsXML.getElementsByTagName("file");
      String vs = "";
      for(int i = 0; i < nl.getLength(); ++i) {
        f = Utils.findFile( ((Element)nl.item(i)).getTextContent() );
        vs += Utils.readFile(f);
      }
      
      nl = fsXML.getElementsByTagName("file");
      String fs = "";
      for(int i = 0; i < nl.getLength(); ++i) {
        f = Utils.findFile( ((Element)nl.item(i)).getTextContent() );
        fs += Utils.readFile(f);
      }
      
      
      material.shader = new ShaderObject(vs, fs);
      
      Element uniformsXML = (Element)materialXML.getElementsByTagName("uniforms").item(0);
      if(uniformsXML == null) {
        logger.warning("shader without uniforms");
      } else {
        nl = uniformsXML.getChildNodes();
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
              
            } else if("uv".compareTo(element.getTagName()) == 0) {
              material.uvName = element.getTextContent();
              
            } else if("uv2".compareTo(element.getTagName()) == 0) {
              material.uv2Name = element.getTextContent();
              
            } else if("tangent".compareTo(element.getTagName()) == 0) {
              material.tangentName = element.getTextContent();
              
            } else if("bitangent".compareTo(element.getTagName()) == 0) {
              material.bitangentName = element.getTextContent();
            } //TODO else 
          }
        }
      }
      
      materials.put(file, material);
      if(alias != null) {
        materials.put(alias, material);
      }
    } catch(Exception e) {
      logger.warning(e.toString());
      material = null;
    }
    
    return material;
  }
  
  public void cleanUp() {
    for(Material material : materials.values()) {
      material.cleanUp();
    }
    materials.clear();
  }
}
