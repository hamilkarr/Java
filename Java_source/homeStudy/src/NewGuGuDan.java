public class NewGuGuDan {
  public static void main(String[] args) {
    for (int i = 11; i < 20; i++) {
      for (int j = 11; j < 20; j++) {
        if (i < j) {
          continue;
        }
        System.out.println(i + " X " + j + "=" + i * j);

      }
      System.out.println();
    }
  }
}
