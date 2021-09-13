package chapter05.sub2;

public class Student {
  int studentID = 1001;
  String Name;
  Subject kor;

  public Student() {
    studentID = 1001;
    Name = "이름1";
  }

  public Student(int sID, String nm) {
    studentID = sID;
    Name = nm;
  }

  public void showInfo() {
    System.out.println("학번: " + studentID + ", 이름: " + Name);
  }
}
