package chapter6BookEx;

public class StudentTest1 {
  public static void main(String[] args) {
    Student studentLee = new Student();
    studentLee.setStudentName("이지원");
    System.out.println(studentLee.serialNum);
    studentLee.serialNum++;
  }
}
