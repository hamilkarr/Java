package chapter8th;

public class VIPCustomer extends Customer {
  private int agentID;
  double discountRatio;

  public VIPCustomer(int customerID, String customerName, int agentID) {
    super(customerID, customerName);
    customerGrade = "VIP";
    bonusRatio = 0.05;
    discountRatio = 0.1;
    System.out.println("VIPCustomer(int, String, int) 생성자 호출");
  }

  public int getAgentID() {
    return agentID;
  }
}
