package chapter12Collection.sub1Generic;

public class ThreeDPrinter {
  Object material;

  void addMaterial(Object material) {
    this.material = material;
  }

  public Object getMaterial() {
    return material;
  }

  @Override
  public String toString() {
    return material.toString();
  }
}
