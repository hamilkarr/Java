package chapter06.section3;

public class Student {
  public static int serialNum = 1000;
  public int studentID;
  public String name;

  public Student() {
    studentID = ++serialNum;
  }

  public int getStudentID() {
    return studentID;
  }

  public void showInfo() {
    System.out.println("학번: " + studentID + ", 이름:" + name);
  }
}
