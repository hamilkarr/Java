package chapter15InOutputStream.sub3;

import java.io.File;
import java.io.IOException;

public class Ex5 {
  public static void main(String[] args) throws IOException, InterruptedException {
    File file = File.createTempFile("temp_", ".tmp", new File("D:\\"));

    Thread.sleep(5000);

    file.deleteOnExit();
  }
}
