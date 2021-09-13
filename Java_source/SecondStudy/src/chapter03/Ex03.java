package chapter03;

public class Ex03 {
  public static void main(String[] args) {
    int num = 10;
    /*
     * int num2 = ++num; // 연산 -> 대입 System.out.println(num2);
     * System.out.println("num:" + num);
     */

    int num3 = num++; // 대입 -> 연산
    System.out.println(num3);
    System.out.println(num);
  }
}
