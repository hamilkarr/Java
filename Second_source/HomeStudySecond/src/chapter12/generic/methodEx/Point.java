package chapter12.generic.methodEx;

public class Point<T, V> {
  T x;
  V y;
  // 좌표 x,y는 정수일수도 실수 일수도 있다. 그래서 제너릭 자료형 매개변수를 사용함.

  Point(T x, V y) {
    this.x = x;
    this.y = y;
  }

  public T getX() {
    return x;
  }

  public V getY() {
    return y;
  }
}
