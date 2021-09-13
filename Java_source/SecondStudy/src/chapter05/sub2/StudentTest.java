package chapter05.sub2;

public class StudentTest {
  public static void main(String[] args) {
    Student st1 = new Student();
    // st1.studentID = 1001;
    st1.Name = "이름1";
    System.out.println(st1.studentID + "," + st1.Name);

    Student st2 = new Student();
    // st2.studentID = 1002;
    st2.Name = "이름2";
    System.out.println(st2.studentID + "," + st2.Name);

    Student st3 = st2; // st2의 주소를 대입
    st3.Name = "이름3";
    System.out.println(st3.studentID + " ," + st3.Name);
    System.out.println(st2.studentID + "," + st2.Name);
  }
}
