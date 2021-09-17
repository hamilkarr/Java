package chapter11BasicClass.sub4String;

public class Ex3StringBuilder {
  public static void main(String[] args) {
    String text1 = "AB";
    System.out.println("text1: " + text1);
    System.out.println("text1: " + System.identityHashCode(text1));

    StringBuilder sb = new StringBuilder(text1);
    System.out.println("sb: " + System.identityHashCode(sb));
    sb.append("CD");
    System.out.println("sb1: " + System.identityHashCode(sb));
    sb.append("EF");
    System.out.println(sb);
    System.out.println("sb2: " + System.identityHashCode(sb));

    text1 = sb.toString();
    System.out.println("text1: " + text1);
    System.out.println("text1: " + System.identityHashCode(text1));
  }
}
