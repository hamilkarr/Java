package chapter14Exception.sub2;

import java.io.*;

public class Ex1 {
  public static void main(String[] args) {
    FileInputStream fis = null;
    InputStreamReader isr = null;
    BufferedReader br = null;
    try {
      fis = new FileInputStream("a.txt");
      isr = new InputStreamReader(fis);

      System.out.println("여기는 실행 될까요?");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fis != null){
          fis.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
}
