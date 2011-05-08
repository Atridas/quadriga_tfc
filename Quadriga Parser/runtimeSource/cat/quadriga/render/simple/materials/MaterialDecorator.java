package cat.quadriga.render.simple.materials;

public abstract class MaterialDecorator extends BaseMaterial {
  protected BaseMaterial activateShortcut;
  protected BaseMaterial preRenderShortcut;
  
  public MaterialDecorator(BaseMaterial base) {
    activateShortcut = base.activateShortcut();
    preRenderShortcut = base.preRenderShortcut();
  }
}
