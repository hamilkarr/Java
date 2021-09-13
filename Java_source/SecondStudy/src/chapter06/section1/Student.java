package chapter06.section1;

public class Student {
  private int studentID;
  private String name;

  public Student() {
    this(1000, "이름없음");
    studentID = 2000;
  }

  public Student(int studentID, String name) {
    this.studentID = studentID;
    this.name = name;
  }

  public Student setStudentID(int studentID) {
    this.studentId = studentId;
    return this;
  }

  public void showInfo() {
    System.out.println("학번: " + studentID + " , 이름: " + name);

  }
}
