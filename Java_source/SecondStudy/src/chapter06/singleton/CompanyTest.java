package chapter06.singleton;

public class CompanyTest {
  public static void main(String[] args) {
    Company c1 = Company.getInstance();
    Company c2 = Company.getInstance();
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
  }
}
