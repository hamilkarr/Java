package Chapter5;

// import Chapter4.SwitchEx1;
// import Chapter4.*; // Chapter4 모든 클래스 다불러오기
// import java.util.*;
// java.util.ArrayList

public class StudentTest {
  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();
    System.out.println("student1 = " + student1);
    System.out.println("student2 = " + student2);

    student1.setStudentName("이름1");
    student2.setStudentName("이름2");

    System.out.println("student1 = " + student1.getStudentName());
    System.out.println("student2 = " + student2.getStudentName());

    /*
     * SwitchEx1 ex1 = new SwitchEx1(); System.out.println(ex1);
     * 
     * IfEx1 ex2 = new IfEx1();
     */

  }
}
