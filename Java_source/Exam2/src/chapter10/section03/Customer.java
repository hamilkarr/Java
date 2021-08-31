package chapter10.section03;

public class Customer implements Buy, Sell {

  @Override
  public void buy() {
    System.out.println("Buy 메서드");
  }

  @Override
  public void sell() {
    // TODO Auto-generated method stub

  }

  @Override
  public void showInfo() {
    // TODO Auto-generated method stub
    System.out.println("Customer 클래스");
  }

  @Override
  public int getPrice() {
    return Buy.super.getPrice();
  }

  @Override
  public void pay() {
    // TODO Auto-generated method stub

  }
}
