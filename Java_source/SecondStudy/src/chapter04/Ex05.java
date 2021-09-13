package chapter04;

public class Ex05 {
  public static void main(String[] args) {
    int num = 1;
    int total = 0;
    while (num <= 100) {
      total += num;
      num++;
    }
    System.out.println(total);
  }
}
