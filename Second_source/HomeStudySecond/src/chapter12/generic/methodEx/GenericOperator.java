package chapter12.generic.methodEx;

public class GenericOperator<T> { // <T> 인스턴스가 힙에 올라갈때
  T num1;
  T num2;

  public <T, V> double add(T num1, V num2) { // 호출될때 마다 자료형 투입 -> 스택에서 실행될 때 결정

    // T,V -> 숫자는 맞다. 단 정수인지 실수인지 알수 없을뿐..
    // 숫자 -> Integer,Float,Double,Long ...
    // 숫자 Wrapper 클래스의 공통점 -> Number 를 상속받고 있다.
    double num11 = ((Number) num1).doubleValue();
    double num22 = ((Number) num2).doubleValue();

    return num11 + num22;
  }

  public static <T, V> double addStatic(T num1, V num2) {
    double num11 = ((Number) num1).doubleValue();
    double num22 = ((Number) num2).doubleValue();

    return num11 + num22;
  }
}