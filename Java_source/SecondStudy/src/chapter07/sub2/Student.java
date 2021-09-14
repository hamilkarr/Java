package chapter07.sub2;

import java.util.ArrayList;

public class Student {
  private int studentID;
  private String name;
  private ArrayList<Subject> subjects;

  public Student(int studentID, String name) {
    this.studentID = studentID;
    this.name = name;
    subjects = new ArrayList<Subject>();
  }

  public void addSubject(String title, int score) {
    subjects.add(new Subject(title, score));
  }

  public void showInfo() {
    System.out.println("학번: " + studentID + " , 이름: " + name);
    for (Subject subject : subjects) {
      subject.showSubjects();
    }
    // for (int i = 0; i < subjects.size(); i++) {
    // Subject subject = subjects.get(i);
    // subject.showSubjects();
    // }
    System.out.println("=======================");

  }
}
