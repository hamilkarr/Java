package chapter11.section02;

public class StringEx4 {
  public static void main(String[] args) {
    String fruit = new String("Apple");
    System.out.println("fruit : " + System.identityHashCode(fruit));
    StringBuilder buffer = new StringBuilder(fruit);
    System.out.println("befor buffer : " + System.identityHashCode(buffer));
    buffer.append(", melon");
    buffer.append(", mango");
    buffer.append(", banana");
    System.out.println("after buffer :" + System.identityHashCode(fruit));

    fruit = buffer.toString();
    System.out.println(fruit);
    System.out.println("fruit : " + System.identityHashCode(fruit));
  }
}
