package chapter11BasicClass.sub2;

public class Book {
  String name;
  int price;

  public Book(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public void showInfo() {

  }

  @Override
  public String toString() {
    return "책 제목: " + name + ", 가격: " + price;
  }
}
