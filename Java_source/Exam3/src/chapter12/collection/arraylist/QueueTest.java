package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class QueueTest {
  public static void main(String[] args) {
    Queue<Member> queue = new Queue<>();
    queue.enQueue(new Member(1001, "이름1"));
    queue.enQueue(new Member(1002, "이름2"));
    queue.enQueue(new Member(1003, "이름3"));

    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
    System.out.println(queue.deQueue());
  }
}
