package chapter12.section01;

public class Plastic extends Material {

  public void doPrinting() {
    System.out.println("Plastic로 출력합니다...");
  }

  public void showInfo() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Plastic 재료";
  }
}
