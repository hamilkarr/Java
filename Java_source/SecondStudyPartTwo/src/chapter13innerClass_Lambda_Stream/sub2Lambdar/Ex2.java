package chapter13innerClass_Lambda_Stream.sub2Lambdar;

/**
 * MyInterface
 */
interface MyInterface {
  int printNum(int num1, int num2);

}

public class Ex2 {
  public static void main(String[] args) {
    MyInterface my = (x, y) -> x;
  }
}
