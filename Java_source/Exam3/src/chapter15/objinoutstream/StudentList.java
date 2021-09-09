package chapter15.objinoutstream;

import java.io.Serializable;
import java.util.ArrayList;

public class StudentList implements Serializable {

  private ArrayList<Student> list;

  private String name2;

  public StudentList() {
    list = new ArrayList<Student>();
  }

  public void addStudent(Student s) {
    list.add(s);
  }

  public void showList() {
    for (Student s : list) {
      System.out.println(s);
    }
  }
}
