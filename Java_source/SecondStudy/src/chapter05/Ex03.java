package chapter05;

public class Ex03 {
  public static int add(int num1, int num2) {
    int num3 = 10;
    return num1 + num2 + num3;
  }

  public static void main(String[] args) {
    int n1 = 10;
    int n2 = 20;

    int result = add(n1, n2);
    System.out.println(result);
  }
}
