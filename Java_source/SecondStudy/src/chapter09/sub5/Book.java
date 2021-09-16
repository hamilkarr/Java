package chapter09.sub5;

public class Book {
  public int num;
  public String title;

  public Book(int num, String title) {
    this.num = num;
    this.title = title;
  }

  public int getNum() {
    return num;
  }

  @Override
  public boolean equals(Object obj) {
    Book book = (Book) obj;
    if (book.getNum() == num) {
      return true;
    } else
      return false;
  }

  @Override
  public int hashCode() {
    return num;
  }

  @Override
  public String toString() {
    return "도서 번호: " + num + ", 도서 제목: " + title;
  }
}
