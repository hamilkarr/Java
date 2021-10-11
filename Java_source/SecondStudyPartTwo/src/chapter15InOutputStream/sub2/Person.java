package chapter15InOutputStream.sub2;

import java.io.Serializable;

public class Person implements Serializable {
  public String name;
  // public transient int age;
  public int age;
  public String address;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "이름:" + name + ", 나이: " + age;
  }
}
