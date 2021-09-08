package chapter13.lambda;

public class LambdaEx1 {
  public static void main(String[] args) {
    AddNumber test1 = (x, y) -> x + y;
    System.out.println(test1.add(10, 30));

    AddNumber test2 = new AddNumber() {
      public int add(int num1, int num2) {
        return num1 + num2;
      }
    };
    System.out.println(test2.add(10, 30));

    PrintString test3 = s -> s;
    System.out.println(test3.print("테스트"));
  }
}
