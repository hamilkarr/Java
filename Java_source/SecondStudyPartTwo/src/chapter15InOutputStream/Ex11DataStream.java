package chapter15InOutputStream;

import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ex11DataStream {
  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("data.txt"); DataOutputStream dos = new DataOutputStream(fos);) {

      dos.writeByte(100);
      dos.writeUTF("안녕하세요");
      dos.writeInt(12345);
    } catch (Exception e) {
      e.printStackTrace();
    }
    try (FileInputStream fis = new FileInputStream("data.txt"); DataInputStream dis = new DataInputStream(fis)) {
      byte num1 = dis.readByte();
      System.out.println(num1);
      String str1 = dis.readUTF();
      System.out.println(str1);
      int num2 = dis.readInt();
      System.out.println(num2);
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
