package chapter15.inoutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx2 {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("input.txt")) {
      byte[] bs = new byte[10];
      int i;
      while ((i = fis.read(bs)) != -1) {
        /*
         * for (byte b : bs) { System.out.println((char) b); }
         */
        for (int j = 0; j < i; j++) {
          System.out.print((char) bs[j]);
        }
        System.out.println(": 읽은 바이트 수 - " + i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
