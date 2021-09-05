package chapter8th.instansof;

import java.util.ArrayList;

public class CustomerTest {
  public static void main(String[] args) {
    ArrayList<Customer> customerList = new ArrayList<>();
    Customer customerLee = new Customer(10010, "이순신");
    Customer customerShin = new Customer(10011, "신사임당");
    GoldCustomer customerKim = new GoldCustomer(10012, "김유신");
    GoldCustomer customerYul = new GoldCustomer(10013, "이율곡");
    VIPCustomer customerHong = new VIPCustomer(10014, "홍길동", 12345);

    customerList.add(customerLee);
    customerList.add(customerShin);
    customerList.add(customerKim);
    customerList.add(customerYul);
    customerList.add(customerHong);

    System.out.println("===========고객정보 =========");
    for (Customer customer : customerList) {
      System.out.println(customer.showInfo());
    }
    System.out.println("=========== 고객등급별 보너스포인트===========");
    int price = 10000;
    for (Customer customer : customerList) {
      int cost = customer.calcPrice(price);

      System.out.println(customer.getCustomerName() + "님이" + cost + "원을 지불하셨습니다.");
      System.out.println(customer.showInfo());
    }
  }
}
