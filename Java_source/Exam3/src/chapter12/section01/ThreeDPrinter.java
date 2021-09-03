package chapter12.section01;

public class ThreeDPrinter {
  private Material material;

  public void setMaterial(Material material) {
    this.material = material;
  }

  public Material getMaterial() {
    return material;
  }

  @Override
  public String toString() {
    return material.toString();
  }

}
