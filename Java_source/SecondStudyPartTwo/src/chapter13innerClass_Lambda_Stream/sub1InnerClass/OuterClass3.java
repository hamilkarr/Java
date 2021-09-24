package chapter13innerClass_Lambda_Stream.sub1InnerClass;

public class OuterClass3 {
  public InnerAbstractClass outerMethod(int num) {
    class Innerclass extends InnerAbstractClass {
      public void innerMethod() {
        System.out.println("num: " + num);
        System.out.println("지역 내부 클래스 메서드");
      }
    }
    InnerClass in = new Innerclass();
    return in;

  }
}
