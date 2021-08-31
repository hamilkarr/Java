package chapter8th;

public class CustomerTest1 {
  public static void main(String[] args) {
    Customer customerLee = new Customer();
    customerLee.setCustomerID(10010);
    customerLee.setCustomerName("이순신");
    customerLee.bonusPoint = 1000;
    System.out.println(customerLee.showInfo());

    VIPCustomer customerKim = new VIPCustomer();
    customerKim.setCustomerID(100020);
    customerKim.setCustomerName("김유신");
    customerKim.bonusPoint = 20000;
    System.out.println(customerKim.showInfo());
  }
}
