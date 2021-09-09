package chapter15.inoutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx4 {
  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("output.txt")) {
      /*
       * fos.write('A'); fos.write('B'); fos.write('C');
       */
      char ch = 'A';
      byte[] bs = new byte[26];
      for (int i = 0; i < 26; i++) {
        bs[i] = (byte) ch;
        ch++;
      }
      fos.write(bs);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
