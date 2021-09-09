package chapter15.decorator;

import java.io.*;

public class DataInOutputStreamEx5 {
  public static void main(String[] args) {
    try (
        // 파일쓰기
        FileOutputStream fos = new FileOutputStream("data.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        // 파일 읽기
        FileInputStream fis = new FileInputStream("data.dat");
        DataInputStream dis = new DataInputStream(fis)) {

      dos.writeInt(100);
      dos.writeBoolean(true);
      dos.writeUTF("안녕하세요");

      int num = dis.readInt();
      boolean bool = dis.readBoolean();
      String text = dis.readUTF();

      System.out.println("num = " + num);
      System.out.println("bool = " + bool);
      System.out.println("text = " + text);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
