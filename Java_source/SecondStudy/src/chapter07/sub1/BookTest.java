package chapter07.sub1;

public class BookTest {
  public static void main(String[] args) {
    Book[] books = new Book[4];
    books[0] = new Book(100, "책1");
    books[1] = new Book(101, "책2");
    books[2] = new Book(102, "책3");
    books[3] = new Book(103, "책4");

    Book[] books2 = new Book[4];
    // System.arraycopy(books, 0, books2, 0, 4);
    for (int i = 0; i < books2.length; i++) {
      books2[i] = new Book(books[i].getBookNo(), books[i].getTitle());
    }

    System.out.println("=========books========");
    books[0].setBookNo(104);
    books[0].setTitle("책5");
    for (int i = 0; i < books.length; i++) {
      books[i].showInfo();
    }

    System.out.println("=========books2=========");
    for (int j = 0; j < books2.length; j++) {
      books2[j].showInfo();
    }

    for (Book book : books2) {
      book.showInfo();
    }
  }
}
