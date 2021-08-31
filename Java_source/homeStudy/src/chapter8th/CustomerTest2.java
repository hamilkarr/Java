package chapter8th;

public class CustomerTest2 {
  public static void main(String[] args) {
    VIPCustomer customerKim = new VIPCustomer();
    // customerKim.setCustomerID(10020);
    // customerKim.setCustomerName("킴유신");
    customerKim.bonusPoint = 10000;
    System.out.println(customerKim.showInfo());
  }
}
