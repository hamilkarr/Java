package chapter12;

import java.util.ArrayList;
import java.util.List;

class Book {
  private String name;
  private int price;

  public Book(String name, int price) {
    this.name = name;
    this.setPrice(price);
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class LibraryTest {
  public static void main(String[] args) {
    List<Book> bookList = new ArrayList<>();

    bookList.add(new Book("자바", 25000));
    bookList.add(new Book("파이썬 ", 15000));
    bookList.add(new Book("안드로이드", 30000));

    int total = bookList.stream().mapToInt(b -> b.getPrice()).sum();
    System.out.println("책 가격의 합 = " + total);

    bookList.stream().filter(b -> b.getPrice() >= 20000).map(b -> b.getName()).sorted()
        .forEach(s -> System.out.println(s));
  }

}
