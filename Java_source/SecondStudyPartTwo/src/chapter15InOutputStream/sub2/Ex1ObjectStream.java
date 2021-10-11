package chapter15InOutputStream.sub2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Ex1ObjectStream {
  public static void main(String[] args) {
    Person person1 = new Person("이름1", 40);
    Person person2 = new Person("이름2", 20);

    try (FileOutputStream fos = new FileOutputStream("object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);) {
      oos.writeObject(person1);
      oos.writeObject(person2);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try
  }
}
