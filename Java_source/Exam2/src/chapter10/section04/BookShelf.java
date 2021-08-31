package chapter10.section04;

public class BookShelf extends Shelf implements Queue {

  @Override
  public void enQueue(String title) {
    shelf.add(title);

  }

  @Override
  public String deQueue() {
    /*
     * ArrayList .remove(인덱스 번호) .remove(인스턴스) .remove(인스턴스,값)
     */
    return shelf.remove(0);
  }

}
