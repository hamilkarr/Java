package chapter10.section03;

public interface Buy {
  void buy();

  void pay();

  default int getPrice() {
    description();
    // privateMethod();
    return 10000;
  }

  default void showInfo() {
    System.out.println("Buy 인터페이스");
  }

  static void description() {
    System.out.println("Buy 인터페이스");
  }

}
