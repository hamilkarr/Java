package Library;

import java.util.HashMap;
import java.util.Iterator;

public class CustomerHashMap {
  private HashMap<Integer, Customer> hashMap;

  public CustomerHashMap() {
    hashMap = new HashMap<Integer, Customer>();
  }

  public void addCustomer(Customer customer) {
    hashMap.put(customer.getCustomerID(), customer);
  }

  public boolean removeCustomer(int customerID) {
    if (hashMap.containsKey(customerID)) {
      hashMap.remove(customerID);
      return true;
    }
    System.out.println(customerID + " 가 존재하지 않습니다.");
    return false;
  }

  public void showAllCustomer() {
    Iterator<Integer> ir = hashMap.keySet().iterator();
    while (ir.hasNext()) {
      int key = ir.next();
      Customer customer = hashMap.get(key);
      System.out.println(customer);
    }
    System.out.println();
  }
}
