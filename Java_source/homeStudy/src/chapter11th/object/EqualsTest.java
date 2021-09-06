package chapter11th.object;

class Student {
  int studentID;
  String studentName;

  Student(int studentID, String studentName) {
    this.studentID = studentID;
    this.studentName = studentName;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student) {
      Student student = (Student) obj;
      if (this.studentID == student.studentID) {
        System.out.println(student.studentID);
        return true;
      } else {
        // System.out.println(this.studentID);
        // System.out.println(student.studentID);
        return false;
      }
    } else {
      return false;
    }
  }
}

public class EqualsTest {
  public static void main(String[] args) {
    Student student1 = new Student(1000, "Vedro");
    Student student2 = new Student(1001, "Vedro");
    System.out.println(student1.equals(student2));
    System.out.println(student1.hashCode());
    System.out.println(student2.hashCode());
  }
}
