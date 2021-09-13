package Library;

public class CustomerHashMapTest {
  public static void main(String[] args) {
    CustomerHashMap customerHashMap = new CustomerHashMap();

    Customer customer1 = new Customer(8001, "흑우1", "010-1111-1111", "1111@naver.com");
    Customer customer2 = new Customer(8002, "흑우2", "010-2222-2222", "2222@naver.com");

    customerHashMap.addCustomer(customer1);
    customerHashMap.addCustomer(customer2);

    customerHashMap.showAllCustomer();
  }
}
