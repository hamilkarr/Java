package chapter14;

import java.io.FileInputStream;

import java.io.IOException;

public class Ex1 {
  public static void main(String[] args) {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("test.java");

    } catch (IOException e) {
      e.printStackTrace();
      return; // return 으로 함수 종료해도 finally 실행
    } finally {
      try {
        fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      } catch (NullPointerException e) {
        e.printStackTrace();
      }
      System.out.println("무조건실행!!");
    }
    System.out.println("출력!");
  }
}
