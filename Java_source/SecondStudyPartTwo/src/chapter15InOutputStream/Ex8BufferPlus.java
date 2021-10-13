package chapter15InOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class Ex8BufferPlus {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("a.zip");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("copied.zip");
        BufferedOutputStream bos = new BufferedOutputStream(fos);) {
      long milis = System.currentTimeMillis();

      int i;
      while ((i = bis.read()) != -1) {
        bos.write(i);
      }
      bos.flush();

      long gap = System.currentTimeMillis() - milis;
      System.out.println("소요 시간: " + (gap / 1000));
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
