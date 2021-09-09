package chapter15.file;

import java.io.File;
import java.io.IOException;

public class Ex1 {
  public static void main(String[] args) throws IOException, InterruptedException {
    /*
     * 1.디렉토리 2. 임시파일 3. 종료시 파일삭제 4. 폴더 안의 파일 목록
     */
    /*
     * File dir = new File("D:\\testFold"); dir.mkdir();
     */
    /*
     * File tmpFile = File.createTempFile("prefix", ".tmp", dir);
     * Thread.sleep(5000); tmpFile.deleteOnExit();
     */

    File dir2 = new File("D:\\");
    File[] files = dir2.listFiles();
    for (File file : files) {
      System.out.println(file);
    }

  }
}
