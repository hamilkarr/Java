package chapter15InOutputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
  public static void main(String[] args) throws IOException {
    System.out.println("문장 입력: ");
    int i;

    InputStreamReader isr = new InputStreamReader(System.in);
    while (true) {
      // char ch = (char) System.in.read();
      char ch = (char) isr.read();
      System.out.print(ch);
    }
  }
}
