package chapter12.practics;

import java.util.HashSet;
import java.util.Iterator;

class Student {
  private int studentID;
  private String studentName;

  public Student(int studentID, String studentName) {
    this.studentID = studentID;
    this.studentName = studentName;
  }

  public int getStudentID() {
    return studentID;
  }

  public void setStudentID(int studentID) {
    this.studentID = studentID;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  @Override
  public String toString() {
    return studentName + " 학생님의 아이디는 " + studentID + " 입니다.";
  }

}

class StudentHashSet {
  private HashSet<Student> hashSet;

  StudentHashSet() {
    hashSet = new HashSet<Student>();
  }

  public void addStudent(Student student) {
    hashSet.add(student);
  }

  public boolean removeStudent(int studentID) {
    Iterator<Student> ir = hashSet.iterator();

    while (ir.hasNext()) {
      Student student = ir.next();
      int tempID = student.getStudentID();
      if (tempID == studentID) {
        hashSet.remove(student);
        return true;
      }
    }
    System.out.println(studentID + " 가 존재하지 않습니다.");
    return false;
  }

  public void showAllStudent() {
    for (Student student : hashSet) {
      System.out.println(student);
    }
    System.out.println();
  }
}

public class StudentTest {
  public static void main(String[] args) {
    StudentHashSet set = new StudentHashSet();

    set.addStudent(new Student(100, "홍길동"));
    set.addStudent(new Student(200, "강감찬"));
    set.addStudent(new Student(300, "이순신"));
    set.addStudent(new Student(400, "정약용"));
    set.addStudent(new Student(100, "송중기"));

    set.showAllStudent();
  }
}
