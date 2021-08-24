package chapter6;

public class StaticEx1 {
  public static void main(String[] args) {
    Student st1 = new Student("이름1", 15000);
    Student st2 = new Student("이름2", 25000);

    Student.studentNum = 1000;
    System.out.println(st2.studentNum);
    System.out.println(Student.studentNum);
  }
}
