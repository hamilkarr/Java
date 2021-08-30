package chapter10.section01.ex02;

public class CalculatorTest {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.println(c.add(10, 20));

    Calc c2 = new Calculator();
    System.out.println(c2.substract(30, 40));
    Calculator c3 = (Calculator) c2;
    c3.showInfo();
  }
}
