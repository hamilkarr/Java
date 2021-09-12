package Library;

import Library.Book;

public class BookHashSetTest {
  public static void main(String[] args) {
    BookHashSet bookHashSet = new BookHashSet();

    Book book1 = new Book(1001, 태백산맥, 조정래, 대하소설, false);
    Book book2 = new Book(1002, 한강, 조정래, 대하소설, No);
    Book book3 = new Book(1003, Hello, author, genre, isRent)

    bookHashSet.addBook(book1);
    bookHashSet.addBook(book2);
    bookHashSet.showAllBook();
  }
}
