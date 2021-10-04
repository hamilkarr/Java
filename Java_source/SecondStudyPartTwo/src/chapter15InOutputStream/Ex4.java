package chapter15InOutputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex4 {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("a.txt");) {
      int i;
      while ((i = fis.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
