package chapter14Exception.sub2;

public class Ex5 {
  public static void main(String[] args) /* throws ClassNotFoundException */ {
    ThrowEx1 ex1 = new ThrowEx1();
    ex1.method();

    try {
      ex1.method2();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // ex1.method2();
  }
}
