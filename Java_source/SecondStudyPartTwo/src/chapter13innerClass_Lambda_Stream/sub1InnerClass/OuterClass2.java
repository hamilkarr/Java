package chapter13innerClass_Lambda_Stream.sub1InnerClass;

public class OuterClass2 {
  public int num = 100;
  public static int num2 = 200;

  static class InnerClass {
    public void innerMethod() {
      num2 = 300;
      System.out.println("정적 내부 클래스 메소드");
    }
  }

  public void outerMethod() {

  }

  public static void outerStaticMethod() {

  }
}
