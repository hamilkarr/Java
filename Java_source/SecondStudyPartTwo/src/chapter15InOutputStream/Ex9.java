package chapter15InOutputStream;

import java.io.FileReader;
import java.io.IOException;

public class Ex9 {
  public static void main(String[] args) {
    try (FileReader fr = new FileReader("output.txt")) {
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (IOException e) {
      // TODO: handle exception
    }
  }
}
