package chapter12Collection.sub1Generic;

public class GenericPrinter<T extends Material> {
  T material;

  public void addMaterial(T material) {
    this.material = material;
  }

  public T getMaterial() {
    return material;
  }

  public void printing() { // 각 재료별 인쇄 기능
    material.doPrinting();
  }

  @Override
  public String toString() {
    return material.toString();
  }
}
