package chapter2nd;

public class IfExample2 {
  public static void main(String[] args) {
    int age = 13;
    int charge;
    if (age < 8) {
      charge = 1000;
      System.out.println("취학전 아동입니다.");
    } else if (age < 14) {
      charge = 2000;
      System.out.println("초등학생 입니다.");
    }
  }
}
