package chapter12Collection.sub1Generic;

public class Powder extends Material {
  public void doPrinting() {
    System.out.println("파우더로로 프린팅!");
  }

  @Override
  public String toString() {
    return "파우더!";
  }
}
