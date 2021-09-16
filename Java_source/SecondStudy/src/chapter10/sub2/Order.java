package chapter10.sub2;

public class Order implements Buy, Sell {

  @Override
  public void sell() { // 접근제어자 -> 재정의 -> 가시성이 동일, 혹은 큰거로만 가능
    System.out.println("Sell!");

  }

  @Override
  public void buy() {
    // TODO Auto-generated method stub
    System.out.println("Buy!");
  }

  @Override
  public void order() {
    // TODO Auto-generated method stub
    Buy.super.order();
  }

  // @Override
  // public void order() {
  // System.out.println("Order-order 메서드");
  // }

}
