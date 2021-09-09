package chapter15.inoutputStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx5 {
  public static void main(String[] args) {
    try (FileReader fr = new FileReader("output2.txt")) {
      /*
       * int i; while ((i = fr.read()) != -1) { System.out.println((char) i); }
       */

      char[] chs = new char[12];
      int i;
      while ((i = fr.read(chs)) != -1) {
        for (int j = 0; j < i; j++) {
          System.out.print(chs[j]);
        }
        System.out.println(" 문자수 : " + i);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
