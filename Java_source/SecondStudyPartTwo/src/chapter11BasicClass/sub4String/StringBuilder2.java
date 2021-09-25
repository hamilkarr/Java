package chapter11BasicClass.sub4String;

public class StringBuilder2 {
  public static void main(String[] args) {
    String str = new String("Java");

    StringBuilder buffer = new StringBuilder(str);
    buffer.append(" and");
    buffer.append(" android");
    buffer.append(" programing is fun!!!");

    System.out.println(buffer);
  }
}
