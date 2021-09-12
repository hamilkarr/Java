package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 494 page

public class TryCatchFinallyEx {

  // public static void main(String[] args) {
  // try {
  // FileInputStream fis = new FileInputStream("a.txt");

  // } catch (FileNotFoundException e) {
  // System.out.println(e);

  // }
  // System.out.println("아무튼 실행됩니다.");
  // }

  // 496 page

  public static void main(String[] args) {
    // a.txt 직접 만든뒤 진행.

    FileInputStream fis = null;

    try {
      fis = new FileInputStream("a.txt");
    } catch (FileNotFoundException e) {
      System.out.println(e);
      return; // <- 함정
    } finally {
      if (fis != null) {
        try {
          fis.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      System.out.println("항상 실행됩니다.");
    }
    System.out.println("아무튼 실행됩니다.");
  }

}
