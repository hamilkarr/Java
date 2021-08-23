package Chapter4;

public class LoopEx3 {
  public static void main(String[] args) {
    int num = 0;
    while (true) { // 항상 참이므로 무한반복
      System.out.println(num);
      if (num >= 1000)
        break;
      num++;
    }
  }
}
