package chapter10th.section01;

public interface Buy {
  void buy();

  default void order() {
    System.out.println("구매주문");
  }
}
