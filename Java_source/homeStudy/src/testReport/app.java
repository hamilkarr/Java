package testReport;

/* 
1. 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
*/

public class app {
  public static void main(String[] args) {

    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        if (i <= i) {
          break;
        }
        System.out.println(i + "X" + j + "=" + i * j);
      }
      System.out.println();
    }
  }
}