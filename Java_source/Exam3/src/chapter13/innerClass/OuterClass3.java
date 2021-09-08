package chapter13.innerClass;

public class OuterClass3 {
  public InnerMyClass outerMethod() {
    int num = 20;
    return new InnerMyClass() {
      public void method() {
        System.out.println("지역 내부 클래스");
      }
    };
    // class InnerClass implements InnerMyClass {
    // public void method() {
    // System.out.println("지역 내부 클래스");
    // System.out.println(num);
    // }
    // }

    // InnerClass in = new InnerClass();
    // return in;
  }
}