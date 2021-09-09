package chapter15.inoutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx3 {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("input.txt")) {
      byte[] bs = new byte[26];
      int i = fis.read(bs, 2, 10);
      for (int j = 0; j < i; j++) {
        System.out.print((char) bs[j]);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
