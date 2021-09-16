package chapter10.sub2;

public interface Sell {
  void sell();

  default void order() {
    System.out.println();
  }
}
