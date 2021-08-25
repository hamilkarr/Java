package testReport;

/* 
1. 변수 두 개를 선언해서 20과 3.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력해 보시오
*/
public class QuestionFirst {
  public static void main(String[] args) {

    int num1 = 20;
    double num2 = 3.0;

    int addCal = num1 + (int) num2;
    int subCal = num1 - (int) num2;
    int multiCal = num1 * (int) num2;
    int divCal = num1 / (int) num2;

    System.out.println("더하기: " + addCal);
    System.out.println("빼기: " + subCal);
    System.out.println("곱하기: " + multiCal);
    System.out.println("나누기: " + divCal);
  }
}