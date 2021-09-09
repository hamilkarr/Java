package chapter15.inoutputStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx6 {
  public static void main(String[] args) {
    try (FileWriter fw = new FileWriter("output3.txt")) {

      char[] chs = { 'A', 'B', 'C', 'D', 'F', 'G' };
      fw.write("안녕하세요.");
      fw.write("65");
      fw.write(chs, 1, 3);

      fw.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
