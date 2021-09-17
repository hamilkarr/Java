package chapter11BasicClass.sub3;

public class Student {
  private int studentID;
  private String name;

  public Student(int studentID, String name) {
    this.studentID = studentID;
    this.name = name;
  }

  @Override
  public String toString() {
    return "학번: " + studentID + ", 이름: " + name;
  }

  @Override
  public boolean equals(Object obj) {
    Student student = (Student) obj;
    if (student.studentID == studentID) {
      return true;
    } else
      return false;

  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return studentID;

}
