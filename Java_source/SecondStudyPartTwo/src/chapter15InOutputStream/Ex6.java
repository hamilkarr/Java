package chapter15InOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("output.txt"); InputStreamReader isr = new InputStreamReader(fis);) {
      int i;
      while ((i = fis.read()) != -1) {
        System.out.println((char) i);
      }
    } catch (IOException e) {
      // TODO: handle exception
    }
  }
}
