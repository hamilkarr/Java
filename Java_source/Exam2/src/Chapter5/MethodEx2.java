package Chapter5;

public class MethodEx2 {
  public static void main(String[] args) {
    divide(10, 2);
  }

  static void divide(int num1, int num2) {
    if (num2 == 0) {
      return;
    }
    int result = num1 / num2;
    System.out.println(result);
  }
}
