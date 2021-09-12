package chapter15.standardinoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
  public static void main(String[] args) {
    /*
     * int i; try { System.out.println("문자를 입력하시오 : "); InputStreamReader isr = new
     * InputStreamReader(System.in); while ((i = isr.read()) != -1) {
     * System.out.print((char) i); } } catch (IOException e) { e.printStackTrace();
     * }
     */

    int i;
    try {
      System.out.println("문자를 입력하시오 : ");
      FileWriter isr = new FileWriter(System.in);
      while ((i = isr.read()) != -1) {
        System.out.print((String) i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
