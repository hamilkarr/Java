package chapter10.sub2;

public interface Buy {
  int num = 30; // public static final

  void buy();

  default void order() {
    System.out.println("Buy-order 메서드");
    privateMethod();
  }

  static void showinfo() {
    System.out.println("static Buy!");
  }

  private void privateMethod() {
    System.out.println("헬로");
  }
}
