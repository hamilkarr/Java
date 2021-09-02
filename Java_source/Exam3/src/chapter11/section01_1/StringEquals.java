package chapter11.section01_1;

public class StringEquals {
  public static void main(String[] args) {
    String str1 = new String("abc");
    String str2 = new String("abc");

    System.out.println(str1 == str2);
    System.out.println(str1.equals(str2));

    Integer i1 = new Integer(100); // Integer 생성자는 JAVA 9 버전 이후 더이상 사용되지 않는다.
    Integer i2 = new Integer(100);

    System.out.println(i1 == i2);
    System.out.println(i1.equals(i2));
  }
}
