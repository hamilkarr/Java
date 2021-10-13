package chapter14Exception.sub2;

import java.io.*;

public class Ex3 {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("a.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr)) {
      int ch;
      while ((ch = br.read()) != -1) {
        System.out.println(ch);
      }
    } catch (IOException e) {
      // TODO: handle exception
    }
  }
}
