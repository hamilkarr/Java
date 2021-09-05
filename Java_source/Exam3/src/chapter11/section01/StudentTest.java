package chapter11.section01;

public class StudentTest {
  public static void main(String[] args) {
    Student s1 = new Student(20001425, "이름1");
    Student s2 = new Student(20001425, "이름1");
    System.out.println("========================");
    System.out.println("s1과 s2 주소 일치? : " + (s1 == s2));
    System.out.println("s1과 s2의 equals ? : " + (s1.equals(s2)));
    System.out.println("========================");

  }
}
