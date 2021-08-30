package chapter8;

public class Customer {
  protected int customerID;
  protected String customerName;
  protected String customerGrade;
  protected int bonusPoint;
  protected double bonusRatio;

  public Customer() {
    customerGrade = "SILVER";
    bonusRatio = 0.01;
    System.out.println("Customer 생성자");
  }

  public int calcPrice(int price) {
    int bonus = (int) (price * bonusRatio); // 적립 비율에 따른 적립금
    bonusPoint += bonus;

    return price;
  }

  public void showInfo() {
    System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.");
  }

  public double getBonusRatio() {
    return bonusRatio;
  }

  public void setBonusRatio(double bonusRatio) {
    this.bonusRatio = bonusRatio;
  }

  public int getBonusPoint() {
    return bonusPoint;
  }

  public void setBonusPoint(int bonusPoint) {
    this.bonusPoint = bonusPoint;
  }

  public String getCustomerGrade() {
    return customerGrade;
  }

  public void setCustomerGrade(String customerGrade) {
    this.customerGrade = customerGrade;
  }

  public String getCutomerName() {
    return customerName;
  }

  public void setCutomerName(String customerName) {
    this.customerName = customerName;
  }

  public int getCustomerID() {
    return customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }
}
