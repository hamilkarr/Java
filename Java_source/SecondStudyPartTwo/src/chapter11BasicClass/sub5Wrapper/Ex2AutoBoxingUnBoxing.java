package chapter11BasicClass.sub5Wrapper;

public class Ex2AutoBoxingUnBoxing {
  public static void main(String[] args) {
    int num1 = 10;
    Integer num2 = Integer.valueOf(20);

    int result = num1 + num2; // 연산은 같은 자료형끼리만 가능. Integer num2 -> int num2 (언박싱)
    System.out.println(result);

    Integer result2 = num1; // int num1 -> Integer num1 (오토박싱)

  }
}
