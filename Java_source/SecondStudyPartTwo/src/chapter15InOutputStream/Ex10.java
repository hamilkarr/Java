package chapter15InOutputStream;

import java.io.FileWriter;

public class Ex10 {
  public static void main(String[] args) {
    try (FileWriter fw = new FileWriter("output2.txt");) {
      fw.write("가나다라마바사");
      fw.write("아자차카타파하");
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
