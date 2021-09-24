package chapter14Exception.sub1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1 {
  public static void main(String[] args) {
    FileInputStream fis = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    try {
      fis = new FileInputStream("a.txt");
      // 리로스 열면 -> 닫아
      isr = new InputStreamReader(fis);
      br = new BufferedReader(isr);

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
        isr.close();
        fis.close();
      } catch (Exception e) {

      }
      System.out.println("무조건 실행!");
    }
    System.out.println("실행 되나요??");
  }
}