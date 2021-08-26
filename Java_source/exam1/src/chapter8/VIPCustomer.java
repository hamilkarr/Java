package chapter8;

public class VIPCustomer {

  private int customerID;
  private String customerName;
  private String customerGrade;
  private int bonusPoint;
  private double bonusRatio;
  private double discountRatio; // 상품 할인 10%
  private int agentID; // 전문 상담원 ID

  public VIPCustomer() {
    customerGrade = "VIP";
    bonusRatio = 0.05;
    discountRatio = 0.1;
  }

  public int calcPrice(int price) {
    int bonus = (int) (price * bonusRatio); // 적빌 비율에 따른 적립금
    bonusPoint += bonus;

    int discount = (int) (price * discountRatio);

    return price - discount;
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

  public int getAgentID() {
    return agentID;
  }

  public void setAgentID(int agentID) {
    this.agentID = agentID;
  }
}
