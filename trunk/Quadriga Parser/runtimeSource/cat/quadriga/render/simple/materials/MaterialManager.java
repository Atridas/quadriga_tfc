package cat.quadriga.render.simple.materials;

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
import cat.quadriga.render.simple.RenderManager;
import cat.quadriga.render.simple.ShaderObject;

public class MaterialManager {
  private static Logger logger = Logger.getLogger(MaterialManager.class.getCanonicalName());
  
  private final Map<String, SoftReference<BaseMaterial>> materials = new HashMap<String, SoftReference<BaseMaterial>>();
  
  public BaseMaterial getMaterial(String file) {
    BaseMaterial material = null;
    SoftReference<BaseMaterial> mat = materials.get(file);
    if(mat != null) {
      material = mat.get();
      if(material != null) {
        return material;
      }
    }
    
    try {
      String alias = null;
      
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
      
      ShaderMaterial sm = new ShaderMaterial();
      ShaderObject so = RenderManager.getShaderManager().getShader(vs, fs);
      sm.shader = so;
      material = sm;
      
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
              //material.worldMatrixName = element.getTextContent();
              WorldMatrixMaterial wmm = new WorldMatrixMaterial(material);
              wmm.world = so.getUniform(element.getTextContent());
              material = wmm;
              
            } else if("view".compareTo(element.getTagName()) == 0) {
              //material.viewMatrixName = element.getTextContent();
              ViewMatrixMaterial vmm = new ViewMatrixMaterial(material);
              vmm.view = so.getUniform(element.getTextContent());
              material = vmm;
              
            } else if("projection".compareTo(element.getTagName()) == 0) {
              //material.projMatrixName = element.getTextContent();
              ProjectionMatrixMaterial pmm = new ProjectionMatrixMaterial(material);
              pmm.projection = so.getUniform(element.getTextContent());
              material = pmm;
              
            } else if("world_view".compareTo(element.getTagName()) == 0) {
              //material.worldViewMatrixName = element.getTextContent();
              WorldViewMatrixMaterial wvmm = new WorldViewMatrixMaterial(material);
              wvmm.worldView = so.getUniform(element.getTextContent());
              material = wvmm;
              
            } else if("view_projection".compareTo(element.getTagName()) == 0) {
              //material.viewProjMatrixName = element.getTextContent();
              ViewProjMatrixMaterial vpmm = new ViewProjMatrixMaterial(material);
              vpmm.viewProj = so.getUniform(element.getTextContent());
              material = vpmm;
              
            } else if("world_view_projection".compareTo(element.getTagName()) == 0) {
              //material.worldViewProjMatrixName = element.getTextContent();
              WorldViewProjMatrixMaterial wvmm = new WorldViewProjMatrixMaterial(material);
              wvmm.worldViewProj = so.getUniform(element.getTextContent());
              material = wvmm;
              
            } else if("texture".compareTo(element.getTagName()) == 0) {
              TextureUnitMaterial tum = new TextureUnitMaterial(material);
              tum.textureUniform = so.getUniform(element.getTextContent());
              material = tum;
              
              String unit = element.getAttribute("unit");
              if(unit == null) {
                maxUnit++;
                logger.warning(
                    "texture uniform " + element.getTextContent()
                    + " has no unit! Setting it to " + maxUnit);
                //material.textures.put(maxUnit, element.getTextContent());
                tum.textureUnit = maxUnit;
              } else {
                try {
                  int u = Integer.parseInt(unit);
                  //material.textures.put(u, element.getTextContent());
                  tum.textureUnit = u;
                } catch(NumberFormatException e) {
                  maxUnit++;
                  logger.warning(
                      "texture uniform " + element.getTextContent()
                      + " has ill-formated unit! Setting it to " + maxUnit);
                  //material.textures.put(maxUnit, element.getTextContent());
                  tum.textureUnit = maxUnit;
                }
              }
            } else if("vector3f".compareTo(element.getTagName()) == 0) {
              //material.worldViewProjMatrixName = element.getTextContent();
              Vector3fUniformMaterial v3fm = new Vector3fUniformMaterial(material);
              v3fm.uniformID = so.getUniform(element.getTextContent());
              v3fm.parameterName = element.getAttribute("name");
              material = v3fm;
              
            } //TODO else 
          }
        }
      }
      
      Element attributesXML = (Element)materialXML.getElementsByTagName("attributes").item(0);
      if(attributesXML == null) {
        logger.warning("shader without uniforms");
      } else {
        nl = attributesXML.getChildNodes();
        String tangent = null;
        String bitangent = null;
        
        for(int i = 0; i < nl.getLength(); ++i) {
          Node node = nl.item(i);
          if(node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            if("color".compareTo(element.getTagName()) == 0) {
              //material.colorName = element.getTextContent();
              ColorMaterial cm = new ColorMaterial(material);
              cm.color = so.getAttrib(element.getTextContent());
              material = cm;
              
            } else if("position".compareTo(element.getTagName()) == 0) {
              //material.positionName = element.getTextContent();
              PositionMaterial pm = new PositionMaterial(material);
              pm.position = so.getAttrib(element.getTextContent());
              material = pm;
              
            } else if("normal".compareTo(element.getTagName()) == 0) {
              //material.normalName = element.getTextContent();
              NormalMaterial nm = new NormalMaterial(material);
              nm.normal = so.getAttrib(element.getTextContent());
              material = nm;
              
            } else if("st".compareTo(element.getTagName()) == 0) {
              //material.stName = element.getTextContent();
              TextureCoordsMaterial tcm = new TextureCoordsMaterial(material);
              tcm.tex = so.getAttrib(element.getTextContent());
              material = tcm;
              
            } else if("st2".compareTo(element.getTagName()) == 0) {
              //material.st2Name = element.getTextContent();
              TextureCoords2Material tc2m = new TextureCoords2Material(material);
              tc2m.tex2 = so.getAttrib(element.getTextContent());
              material = tc2m;
              
            } else if("tangent".compareTo(element.getTagName()) == 0) {
              //material.tangentName = element.getTextContent();
              tangent = element.getTextContent();
              
            } else if("bitangent".compareTo(element.getTagName()) == 0) {
              //material.bitangentName = element.getTextContent();
              bitangent = element.getTextContent();

            } //TODO else 
          }
        }
        
        if(tangent != null && bitangent != null) {
          TangentMaterial tm = new TangentMaterial(material);
          tm.tangent   = so.getUniform( tangent );
          tm.bitangent = so.getUniform(bitangent);
          material = tm;
        } else if(tangent != null) {
          logger.warning("shader with tangent and no bitangent");
        } else if(bitangent != null) {
          logger.warning("shader with bitangent and no tangent");
        }
      }
      
      if(!material.hasParameters()) {
        materials.put(file, new SoftReference<BaseMaterial>(material));
        if(alias != null) {
          materials.put(alias, new SoftReference<BaseMaterial>(material));
        }
      }
    } catch(Exception e) {
      logger.warning(e.toString());
      material = null;
    }
    
    return material;
  }
  
  public void cleanUp() {
    for(SoftReference<BaseMaterial> mat : materials.values()) {
      BaseMaterial material = mat.get();
      if(material != null)
        material.cleanUp();
    }
    materials.clear();
  }
}
