package chapter11.section01_1;

class Student {
  int studentID;
  String studentName;

  public Student(int studentID, String studentName) {
    this.studentID = studentID;
    this.studentName = studentName;
  }

  public String toString() {
    return studentID + "," + studentName;
  }
}

public class EqualsTest {

}
