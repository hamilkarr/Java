package chapter6;

public class Student {
  static int studentNum; // 학번

  String name; // 학생 이름
  int money; // 차비

  public Student(String name, int money) {
    this.name = name;
    this.money = money;
  }

  public static int getStudentNum() {
    // name = "이름"; <<<<<<<<<<
    return studentNum;
  }

  public void rideBus(Bus bus) {
    bus.collect(this); // this 는 Student s
  }

  public void rideSubway(Subway subway) {
    subway.collect(this);
  }

  public void showInfo() {
    System.out.println(this.name + " : " + this.money);
  }
}
