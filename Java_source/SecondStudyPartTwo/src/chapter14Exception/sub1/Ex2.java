package chapter14Exception.sub1;

public class Ex2 {
  public static void main(String[] args) {
    try {
      int num1 = 10;
      int num2 = 0;
      System.out.println(num1 / num2);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
    System.out.println("실행되나요??");
  }
}
