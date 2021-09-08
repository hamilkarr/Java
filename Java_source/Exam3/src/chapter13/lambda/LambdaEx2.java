package chapter13.lambda;

public class LambdaEx2 {
  public static void main(String[] args) {
    PrintString test2 = s -> s;
    showPrint(test2);

    PrintString test4 = getPrintString();
    System.out.println(test4);
  }

  public static void showPrint(PrintString test1) {
    test1 = s -> s;
    System.out.println(test1.print("테스트1"));
  }

  public static PrintString getPrintString() {
    PrintString test3 = s -> s;
    return test3;
  }
}
