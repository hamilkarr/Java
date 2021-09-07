package chapter13.Stream;

import java.util.ArrayList;

public class StreamExCollection {
  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
    list.add(new Student(1001, "이름1", 20));
    list.add(new Student(1002, "이름2", 22));
    list.add(new Student(1003, "이름3", 25));
    list.add(new Student(1004, "이름4", 32));

    list.stream().forEach(s -> System.out.println(s.getStudentName()));
    System.out.println("================================");
    list.stream().filter(s -> s.getStudentAge() < 30).map(s -> s.getStudentName()).forEach(s -> System.out.println(s));
    System.out.println("==========================");
    int age = list.stream().filter(s -> s.getStudentAge() < 30).mapToInt(s -> s.getStudentAge()).max().getAsInt();
    System.out.println(age);
    System.out.println("============================");
  }
}
