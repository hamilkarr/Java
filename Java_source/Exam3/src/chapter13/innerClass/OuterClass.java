package chapter13.innerClass;

public class OuterClass {
  public int num = 10;
  private static int snum = 20;
  private InnerClass in;

  public OuterClass() {
    in = new InnerClass();
  }

  class InnerClass {
    int inNum = 10;
    static int inSNum = 20;

    void innerMethod() {
      System.out.println("OuterClass num : " + num);
      System.out.println("OuterClass snum : " + snum);

      System.out.println("InnerCalss inNum : " + inNum);
      System.out.println("InnerCalss inSNum : " + inSNum);
    }

    static void 
  }
}
