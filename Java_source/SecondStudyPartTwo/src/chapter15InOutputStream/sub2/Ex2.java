package chapter15InOutputStream.sub2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex2 {
  public static void main(String[] args) {
    try (FileInputStream fis = new FileInputStream("object.txt"); ObjectInputStream ois = new ObjectInputStream(fis);) {
      Person person1 = (Person) ois.readObject();
      Person person2 = (Person) ois.readObject();
      System.out.println("person1: " + person1);
      System.out.println("person2: " + person2);
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
