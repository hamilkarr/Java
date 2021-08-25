package chapter6_1;

public class Student2 {
  static int serialNum;
  int studentID;
  int CardNum;

  public Student2() {
    studentID = ++serialNum;
    CardNum = studentID + 100;
  }

  public int getCardNum() {
    return CardNum;
  }

}
