package chapter13.innerClass;

public class OuterClass3Test {
  public static void main(String[] args) {
    OuterClass3 out = new OuterClass3();
    InnerMyClass in = out.outerMethod();
    in.method();
  }
}
