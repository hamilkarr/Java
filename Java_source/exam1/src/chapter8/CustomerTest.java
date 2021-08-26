package chapter8;

public class CustomerTest {
  public static void main(String[] args) {
    System.out.println("-------- 실버고객 --------");
    Customer customerLee = new Customer(); // 적립률 1%, SILVER
    customerLee.setCustomerID(1000);
    customerLee.setCutomerName("실버고객");
    customerLee.calcPrice(10000);

    customerLee.showInfo();

    System.out.println("--------- VIP 흑우 ---------");
    VIPCustomer customerKim = new VIPCustomer();
    customerKim.setCustomerID(1001);
    customerKim.setCutomerName("블랙카우");
    System.out.println("할인 적용 판매가 : " + customerKim.calcPrice(50000));
    System.out.println("할인 적용 판매가 : " + customerKim.calcPrice(100000));
    customerKim.showInfo();

    System.out.println("---------- BLACKCOW --------");
    VIPCustomer2 customerPark = new VIPCustomer2();
    customerPark.setAgentID(1002);
    customerPark.setCutomerName("흑우");
    customerPark.setAgentID(1000);
    customerPark.calcPrice(200000);

    customerPark.showInfo();
  }
}
