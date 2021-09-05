package chapter10th.section01;

public abstract class Calculator implements Calc {

  @Override
  public int add(int num1, int num2) {
    // TODO Auto-generated method stub
    return num1 + num2;
  }

  @Override
  public int minus(int num1, int num2) {
    // TODO Auto-generated method stub
    return num1 - num2;
  }

}
