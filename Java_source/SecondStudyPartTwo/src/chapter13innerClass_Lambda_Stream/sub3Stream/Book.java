package chapter13innerClass_Lambda_Stream.sub3Stream;

public class Book {
  private String bookname;
  private int price;

  public Book(String bookname, int price) {
    this.bookname = bookname;
    this.price = price;
  }

  public String getBookname() {
    return bookname;
  }

  public void setBookname(String bookname) {
    this.bookname = bookname;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "책 이름: " + bookname + ", 판매가: " + price;
  }
}
