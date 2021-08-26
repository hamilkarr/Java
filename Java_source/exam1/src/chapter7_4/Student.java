package chapter7_4;

import java.util.ArrayList;

public class Student {
  private int studentID; // 학번
  private String studentName; // 이름
  private ArrayList<Subject> subjects; // 수강과목

  Student(int studentID, String studentName) {
    this.studentID = studentID;
    this.studentName = studentName;
    subjects = new ArrayList<>();
  }

  public void addSubject(String name, int score) {
    subjects.add(new Subject(name, score));
  }

  public void showInfo() {
    int total = 0;
    for (Subject sub : subjects) {
      total += sub.getScore();
      System.out.println("학생" + studentName + "의" + sub.getName() + "과목 성적은" + sub.getScore() + "입니다.");
    }

    System.out.println("학생" + studentName + "의 총점 : " + total);
  }
}
