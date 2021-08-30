package chapter10.section01.ex02;

public class Calculator implements Calc {

  @Override
  public int add(int num1, int num2) {
    return num1 + num2;
  }

  @Override
  public int substract(int num1, int num2) {
    return num1 - num2;
  }

  @Override
  public int times(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public int divide(int num1, int num2) {
    // int는 0 포함. 나누기는 0으로 나눌수 없기 때문에 오류 발생할 수 있음
    if (num1 == 0 || num == 2) {
      return Calc.ERROR;
    } else {
      return (int) (num1 / num2);
    }
  }

  public void showInfo() {
    System.out.println("일반 계산기");
  }

}
