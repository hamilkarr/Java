package chapter11BasicClass.sub4String;

public class Ex2String {
  public static void main(String[] args) {
    String text1 = new String("ABC");
    System.out.println("text1 before: " + System.identityHashCode(text1));
    String text2 = new String("DEF");

    text1 += text2;
    System.out.println("text1 after1: " + System.identityHashCode(text1));
    text1 += "GHI";
    System.out.println("text1 after2: " + System.identityHashCode(text1));
    text1 += "JKL";
    System.out.println("text1 after3: " + System.identityHashCode(text1));
    System.out.println(text1);

    String text3 = "ABC";
    String text4 = "DEF";
    text3 += text4;
    System.out.println(text3);

  }
}
