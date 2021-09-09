package chapter15.decorator;

import java.io.*;

public class FileInputSteamEx2 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("nodejs.zip");
    FileOutputStream fos = new FileOutputStream("nodejs_copied.zip");

    long millis = System.currentTimeMillis();
    int i;
    while ((i = fis.read()) != -1) {
      fos.write(i);
    }
    millis = System.currentTimeMillis() - millis;
    System.out.println(" 소요시간 :" + millis + "ms");

    fis.close();
    fos.close();
  }
}
