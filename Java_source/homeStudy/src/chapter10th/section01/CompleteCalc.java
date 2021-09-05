package chapter10th.section01;

public class CompleteCalc extends Calculator {

  @Override
  public int times(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public int divide(int num1, int num2) {
    if (num2 != 0) {
      return num1 / num2;
    }
    return ERROR;
  }

  @Override
  public int square(int num1) {
    // TODO Auto-generated method stub
    return num1 * num1;
  }

  public void showInfo() {
    System.out.println("Calc 인터페이스를 구현했습니다.");
  }

  /*
   * @Override public void description() { System.out.println("완벽한 계산기 입니다."); }
   */

}
