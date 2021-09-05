package chapter10th.BookShelf;

public interface Queue {
  void enQueue(String title);

  String deQueue();

  int getSize();
}
