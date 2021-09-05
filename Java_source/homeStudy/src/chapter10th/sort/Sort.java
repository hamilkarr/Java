package chapter10th.sort;

public interface Sort {
  void ascending(int[] arr);

  void descending(int[] arr);

  private static void titleMessage() {
    System.out.println("숫자를 정렬하는 알고리즘 입니다.");
  }

  default void description() {
    titleMessage();

  }

}
