package Library;

public class Customer {
  private int customerID;
  private String customerPhoneNumber;
  private String customerName;
  private String customerEmail;

  public Customer(int customerID, String customerName, String string, String customerEmail) {
    this.customerID = customerID;
    this.customerName = customerName;
    this.customerPhoneNumber = string;
    this.customerEmail = customerEmail;
  }

  public int getCustomerID() {
    return customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public String getCustomerPhoneNumber() {
    return customerPhoneNumber;
  }

  public void setCustomerPhoneNumber(String customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  @Override
  public String toString() {
    return customerID + " , 고객이름: " + customerName + " 연락처: " + customerPhoneNumber + " 이메일: " + customerEmail;
  }

  // private int customerID;
  // private int customerPhoneNumber;
  // private String customerName;
  // private String customerEmail;
}
