package chapter10.section02;

public class InterfaceEx1 implements A, B {

  @Override
  public void methodB() {
    System.out.println("MethodB");

  }

  @Override
  public void methodA() {
    System.out.println("MethodA");
  }

  @Override
  public void method() {
    System.out.println("공통 메서드");
  }
}
