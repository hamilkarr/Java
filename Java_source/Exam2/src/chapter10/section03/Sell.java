package chapter10.section03;

public interface Sell {
  void sell();

  void pay();

  default int getPrice() {
    return 10000;
  }

  default void showInfo() {
    System.out.println("Sell 인터페이스");
  }
}
