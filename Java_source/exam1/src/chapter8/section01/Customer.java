package chapter8.section01;

public class Customer {
  private int customerID;
  private String customerName;
  private String customerGrade;
  int bonusPoint;
  double bonusRatio;

  public Customer() {
    customerGrade = "SILVER";
    bonusRatio = 0.01;
  }

  public int calcPrice(int price) {
    bonusPoint += price * bonusRatio;
    return price;
  }
}
