package testReport;

public class QuestionSecond {
  public static void main(String[] args) {

    int studentNum;
    int roomNum;
    for (studentNum = 1; studentNum <= 40; studentNum++) {
      if (studentNum % 10 == 0) {
        roomNum = 9;
      } else {
        roomNum = (studentNum % 10) - 1;
      }
      System.out.println("학생: " + studentNum + ", 방번호 " + roomNum + "번");
    }
  }
}
