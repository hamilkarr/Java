package chapter10.section04;

public interface Queue {
  void enQueue(String title); // 책을 가장 끝에 추가

  String deQueue(); // 첫번째 책을 제거
}
