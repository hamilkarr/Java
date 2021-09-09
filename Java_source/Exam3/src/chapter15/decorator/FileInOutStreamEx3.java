package chapter15.decorator;

import java.io.*;

public class FileInOutStreamEx3 {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("nodejs.zip");
    BufferedInputStream bis = new BufferedInputStream(fis);

    FileOutputStream fos = new FileOutputStream("nodejs_copied.zip");
    BufferedOutputStream bos = new BufferedOutputStream(fos);

    long millis = System.currentTimeMillis();
    int i;
    while ((i = bis.read()) != -1) {
      bos.write(i);
    }

    millis = System.currentTimeMillis() - millis;
    System.out.println("소요 시간 :" + millis + "ms");

    bos.close();
    bis.close();
  }
}
