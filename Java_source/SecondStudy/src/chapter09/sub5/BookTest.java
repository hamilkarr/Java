package chapter09.sub5;

import java.util.HashSet;

public class BookTest {
  public static void main(String[] args) {
    HashSet<Book> list = new HashSet<>();
    list.add(new Book(100, "책1"));
    list.add(new Book(101, "책2"));
    list.add(new Book(102, "책3"));
    list.add(new Book(100, "책1"));

    for (Book book : list) {
      System.out.println(System.identityHashCode(book));
      System.out.println(book);
    }

  }

}
