package chapter14Exception.sub3Custom;

import java.io.*;

public class Ex2 {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("b.txt");
      // Throw new FileNotFoundException("지정.....");
      // FileNotFoundException e = new FileNotFoundException(....)
      // IOException e = new FileNotFoundException(...)
      // Exception e = new FileNotFoundException(...)
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
