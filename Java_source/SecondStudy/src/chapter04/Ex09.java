package chapter04;

public class Ex09 {
  public static void main(String[] args) {
    int i = 1;
    while (i <= 9) { // 1단~9단
      int j = 1;
      while (j <= 9) {
        System.out.println(i + 'X' + j + 'X' + '=' + i * j);
        j++;
      }
      i++;
    }
  }
}
