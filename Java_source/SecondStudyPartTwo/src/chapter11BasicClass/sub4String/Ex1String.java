package chapter11BasicClass.sub4String;

public class Ex1String {
  public static void main(String[] args) {
    String text1 = new String("ABC");
    String text2 = new String("ABC");

    System.out.println(text1 == text2);

    String text3 = "ABC";
    String text4 = "ABC";

    System.out.println(text3 == text4);
  }
}
