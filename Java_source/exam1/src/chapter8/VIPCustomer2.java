package chapter8;

public class VIPCustomer2 extends Customer {
  private double discountRatio; // 상품 할인률
  private int agentID; // 전문 상담원 ID
  private double bonusRatio;

  public VIPCustomer2() {
    bonusRatio = 0.05;
    customerGrade = "BLACKCOW";
    discountRatio = 0.1;

    System.out.println("VIPCustomer2 생성자");
  }

  public int getAgentID() {
    return agentID;
  }

  public void setAgentID(int agentID) {
    this.agentID = agentID;
  }

  public int calcPrice(int price) { // 메서드 오버라이드
    int bonus = (int) (price * bonusRatio); // 적립 비율에 따른 적립금
    bonusPoint += bonus;

    int discount = (int) (price * discountRatio);

    return price - discount;
  }

  @Override
  public void showInfo() {
    super.showInfo();
    System.out.println("상담원 아이디 : " + agentID);
  }

  @Override
  public void showInfo2() {

  }
}
