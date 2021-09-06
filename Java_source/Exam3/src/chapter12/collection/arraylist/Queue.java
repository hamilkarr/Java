package chapter12.collection.arraylist;

import java.util.ArrayList;

public class Queue<T> {
  private ArrayList<T> dataList;

  public Queue() {
    dataList = new ArrayList<T>();
  }

  public void enQueue(T data) {
    dataList.add(data);
  }

  public T deQueue() {
    return dataList.remove(0);
  }
}
