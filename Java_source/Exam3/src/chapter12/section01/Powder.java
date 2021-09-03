package chapter12.section01;

public class Powder extends Material {
  public void doPrinting() {
    System.out.println("Powder로 출력합니다...");
  }

  public void showInfo() {
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Powder 재료";
  }

}
