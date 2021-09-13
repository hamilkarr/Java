package chapter04;

public class Ex01 {
  public static void main(String[] args) {
    char grade;
    int score = 80;

    if (score >= 90) {
      grade = 'a';
    } else if (score >= 80) {
      grade = 'b';
    } else if (score >= 70) {
      grade = 'c';
    } else {
      grade = 'f';
    }
    System.out.println(grade);
  }
}
