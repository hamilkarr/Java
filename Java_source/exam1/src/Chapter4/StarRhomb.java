package Chapter4;

public class StarRhomb {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      if (i % 2 == 0) {
        continue;
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
