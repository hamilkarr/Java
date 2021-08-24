package access;

import Chapter5.AccessEx1;

public class AccessTest extends AccessEx1 {
  public AccessTest() {
    System.out.println(num4);
  }

  public static void main(String[] args) {
    AccessTest t = new AccessTest();
    AccessEx1 ex1 = new AccessEx1();
    System.out.println(ex1.num1);
    System.out.println(t.num4);

  }
}
