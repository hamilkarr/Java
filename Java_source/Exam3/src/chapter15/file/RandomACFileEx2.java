package chapter15.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomACFileEx2 {
  public static void main(String[] args) throws IOException {
    RandomAccessFile file = new RandomAccessFile("data2.dat", "rw");
    file.writeInt(100);
    System.out.println(file.getFilePointer());
    file.writeShort(20);
    file.writeBoolean(false);
    file.writeUTF("안녕하세요");

    file.seek(0);

    int num1 = file.readInt();
    short num2 = file.readShort();
    boolean bool = file.readBoolean();
    String text = file.readUTF();

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(bool);
    System.out.println(text);
  }
}
