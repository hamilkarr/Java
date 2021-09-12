package chapter15.standardinoutput;

import java.io.IOException;

public class Ex7 {
  public static void main(String[] args) throws IOException {
    System.out.println("문자를 입력하시오 ");
    System.out.println("프로그램을 종료하려면 x를 입력하시오");
    /*
     * int i = System.in.read(); // unsigned byte System.out.println((char) i);
     */

    while (true) {
      char i = (char) System.in.read();
      if (i == 'X' || i == 'x') {
        System.exit(i);
      }
      System.out.print(i);
    }
  }
}
