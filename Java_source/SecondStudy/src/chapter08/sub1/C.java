package chapter08.sub1;

public class C extends B {
  int numC = 30;

  void methodC() {
    System.out.println("메서드C");
  }

  C() {
    super();
    // System.out.println("생성자C");
  }

  public void method() {
    System.out.println("C 클래스의 메서드");
  }

  int add(int num1, int num2) {
    return num1 + num2;
  }
}
