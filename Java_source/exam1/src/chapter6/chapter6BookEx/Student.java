package chapter6.chapter6BookEx;

public class Student {
  public static int serialNum = 1000;
  public int studentID;
  public String studentName;
  public int grade;
  public String address;

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String name) {
    studentName = name;
  }
}
