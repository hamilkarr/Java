package chapter15InOutputStream;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex7Buffer {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("a.zip");
        FileOutputStream fos = new FileOutputStream("coppied.zip");) {
      long milis = System.currentTimeMillis(); // 시작시간

      int i;
      while ((i = fis.read()) != -1) {
        fos.write(i);
      }
      long gap = System.currentTimeMillis() - milis;
      System.out.println("걸린시간: " + (gap / 1000));

    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
