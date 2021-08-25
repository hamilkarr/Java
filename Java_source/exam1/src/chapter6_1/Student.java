package chapter6_1;

public class Student {
  static int serialNum; // 학번
  int studentID;

  public Student() { // 인스턴스를 생성할 때마다 학번 serialNum 증감
    studentID = ++serialNum;
  }

  public int getSerialNum() {
    return serialNum;
  }

  public int getStudentID() {
    return studentID;
  }
}
