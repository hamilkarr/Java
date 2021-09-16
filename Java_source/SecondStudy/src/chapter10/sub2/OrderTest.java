package chapter10.sub2;

public class OrderTest {
  public static void main(String[] args) {
    Order order = new Order();
    order.buy();
    order.sell();
    order.order();

    Buy.showinfo();

    System.out.println("========= Buy ========");
    Buy buy = order;
    buy.buy();

    System.out.println("======== Sell ========");
    Sell sell = order;
    sell.sell();
  }
}
