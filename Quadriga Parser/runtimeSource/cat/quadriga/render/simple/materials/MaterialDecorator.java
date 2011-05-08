package cat.quadriga.render.simple.materials;

public abstract class MaterialDecorator extends BaseMaterial {
  final protected BaseMaterial baseMaterial;
  final protected BaseMaterial activateShortcut;
  final protected BaseMaterial preRenderShortcut;
  final protected BaseMaterial cleanUpShortcut;
  
  public MaterialDecorator(BaseMaterial base) {
    baseMaterial      = base;
    activateShortcut  = base.activateShortcut();
    preRenderShortcut = base.preRenderShortcut();
    cleanUpShortcut   = base.cleanUpShortcut();
  }

  public void setParameter(String parameterName, Object param) {
    baseMaterial.setParameter(parameterName, param);
  }
  
  public boolean hasParameters() {
    return baseMaterial.hasParameters();
  }
}
