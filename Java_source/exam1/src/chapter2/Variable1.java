package chapter2;

public class Variable1 {
  public static void main(String[] args) {
    int num; // 선언(자료형 변수명 -> 자료형만큼 공간이 생성)
    // 용량만큼 숫자를 입력(2진수 32비트)
    num = 10;
    System.out.println(num);

    double num2 = 20000000000000000.0; //
    System.out.println(num2);

    Long num3 = 200000000000000L;
    // in
    System.out.println(num3);

    // 나이 - 정수
    int age = 40;
    System.out.println("나이는" + age);
  }

}
