package chapter04;

public class Ex08 {
  public static void main(String[] args) {
    for (int i = 1; i <= 9; i++) {
      /*
       * if (i > 5) { break; }
       */
      if (i % 2 == 1) {
        continue;
      }
      System.out.println("------" + i + "단--------");
      for (int j = 1; j <= 9; j++) {
        System.out.println(i + " X " + j + " = " + (i * j));
      }
    }
  }
}
