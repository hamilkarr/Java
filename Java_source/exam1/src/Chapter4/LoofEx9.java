package Chapter4;

public class LoofEx9 {
  public static void main(String[] args) {
    /*
     * for (int i = 1; i <= 9; i++) { for (int j = 1; j <= 9; j++) {
     * System.out.println(i + " X " + j + " = " + (i * j)); } System.out.println();
     * }
     */
    /* int i = 1;
    while (i <= 9) {
      int j = 1;
      while (j <= 9) {
        System.out.printli(i + " X " + j + " = " + (i * j));
        j++;
      }
      i++;
    } */
    int i = 1;
    do {
      int j = 1;
      do {
        System.out.println(i + " X " + j + " = " + (i*j));
        j++;
      }
      i++;
    }
  }
}
