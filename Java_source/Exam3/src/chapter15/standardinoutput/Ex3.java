package chapter15.standardinoutput;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
  public static void main(String[] args) {

    InputStreamReader isr = new InputStreamReader(System.in);
    try {
      System.out.println("문자를 입력하시오 : ");
      while (true) {
        int i = isr.read();
        System.out.print((char) i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
