package chapter11.section01;

public class Student {
  int studentID;
  String name;

  Student(int studentID, String name) {
    this.studentID = studentID;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    Student s = (Student) obj;
    if (s.studentID == studentID) {
      return true;
    }
    return super.equals(obj);
  }

  @Override
  public String toString() {
    return "학번 : " + studentID + ", 이름 : " + name;
  }
}
