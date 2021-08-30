package chapter10.section01.ex02;

public interface Calc {
  double PI = 3.14;
  int ERROR = -1; // 컴파일시 public static final 자동 추가

  int add(int num1, int num2); // public abstract 를 컴파일러가 자동 추가해 준다.

  int substract(int num1, int num2);

  int times(int num1, int num2);

  int divide(int num1, int num2);
}
