package chapter13.innerClass;

public class InnerClassEx1 {
  Ex1 ex2 = new Ex1() {
    public void method() {
      System.out.println("method2");
    }
  };

  public void method() {
    int num = 10;
    Ex1 ex1 = new Ex1() {
      public void method() {
        System.out.println(num + " method");
      }
    }
    ex1.method();
  }

  public static void main(String[] args) {
    InnerClassEx1 ex1 = new InnerClassEx1();
    ex1.method();
  }
}
