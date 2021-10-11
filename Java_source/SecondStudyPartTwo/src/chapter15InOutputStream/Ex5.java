package chapter15InOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Ex5 {
  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("output.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos)) {
      osw.write("가"); // char는 정수 (양의 정수-2byte)
      osw.write('나');
      osw.write('다');
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
