package chapter13.innerClass;

public class OuterClass2 {
  int num = 10;
  static int sNum = 20;

  static class innerClass {
    void method() {
      // num =20;
      // outerMethod2();
      // sNum = 30;
      // outerMethod();
      System.out.println("static Inner Class Method");
    }
  }

  void outerMethod2() {
    num = 40;
  }

  static void outerMethod() {
    sNum = 30;
  }
}
