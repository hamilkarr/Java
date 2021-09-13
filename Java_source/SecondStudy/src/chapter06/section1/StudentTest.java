package chapter06.section1;

public class StudentTest {
  public static void main(String[] args) {
    Student st1 = new Student(1001, "이름1");
    st1.showInfo();

    Student st2 = new Student();
    st2.showInfo();

  }
}
