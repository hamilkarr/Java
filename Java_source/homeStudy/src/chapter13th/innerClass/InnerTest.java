package chapter13th.innerClass;

class OutClass {
  private int num = 10;
  private static int sNum = 20;

  private InClass inClass;

  public OutClass() {
    inClass = new InClass();
  }

  public void usingClass() {
    inClass.inTest();
  }

  class InClass {
    int inNum = 100;
    static int sInNum = 200;

    void inTest() {
      System.out.println("인스턴스변수");
      System.out.println("정적변수");
    }

    static void sTest() {
    }
  }
}

public class InnerTest {
  public static void main(String[] args) {
    OutClass outClass = new OutClass();
    System.out.println("내부클래스호출");
    outClass.usingClass();
  }
}