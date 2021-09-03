package chapter12.section01.ex02;

public class Ex1<T, V, K> {
  private T data;

  public void setData(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public <V, K> double add(V num1, K num2) {
    double n1 = ((Number) num1).doubleValue();
    double n2 = ((Number) num2).doubleValue();
    return n1 + n2;
  }

  public static <V, K> double minus(V num1, K num2) {
    double n1 = ((Number) num1).doubleValue();
    double n2 = ((Number) num2).doubleValue();
    return n1 - n2;
  }
}
