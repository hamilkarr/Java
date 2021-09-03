package chapter12.section01;

/* 
T - Type
E - Element
V - Value
K - Key
*/
public class GenericPrinter<T extends Material> {
  private T material;

  public T getMaterial() {
    return material;
  }

  public void setMaterial(T material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return material.toString();
  }

  public void printing() {
    material.doPrinting();
  }
}
