package chapter11.sub3;

public class StudentTest {
  public static void main(String[] args) {
    Student st1 = new Student(1000, "이름1");
    Student st2 = new Student(1001, "이름2");

    System.out.println(st1 == st2);
    System.out.println(st1.equals(st2));

    System.out.println("st1: " + st1.hashCode());
    System.out.println("st2: " + st2.hashCode());

    /*
     * 집합 자료형 중복 X 순서 X
     */
  }
}
