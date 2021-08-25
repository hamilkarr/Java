package chapter6_1;

public class StudentTest {
  public static void main(String[] args) {
    Student st1 = new Student();
    Student st2 = new Student();
    Student st3 = new Student();

    System.out.println("st1 학번 = " + st1.getStudentID());
    System.out.println("st2 학번 = " + st2.getStudentID());
    System.out.println("st3 학번 = " + st3.getStudentID());

  }
}
