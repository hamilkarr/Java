package chapter10.section03;

public class CustomerTest {
  public static void main(String[] args) {
    Customer c = new Customer();
    System.out.println(c.getPrice());

    Buy.description();

    // private Void rivateMethod() {
    // System.out.println("Buy 인터페이스 내부에서만 작동함");
    // }
  }
}
