package chapter08.sub1;

public class Ex2Test {
  public static void main(String[] args) {
    C c = new C();
    c.numC = 20;
    // c.method();
    System.out.println(c.add(10, 15));

    C c2 = new C();
    c2.numC = 10;
    // c2.method();
    System.out.println(c2.add(30, 50));

    A a1 = new C();
    a1.method();
  }
}
