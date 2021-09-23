package chapter12Collection.sub1Generic;

public class GenericOperator {
  public static <T, V> double addStatic(T num1, V num2) {

    // T,V -> 숫자는 맞지만, 정수인지 실수인지 알수 없다.
    // -> 숫자(Integer, Double, Float, Long....)
    // 숫자 Wrapper 자료형의 공통점 -> Number 클래스를 상속받고 있다.

    double num11 = ((Number) num1).doubleValue();
    double num22 = ((Number) num2).doubleValue();

    return num11 + num22;
  }
}
