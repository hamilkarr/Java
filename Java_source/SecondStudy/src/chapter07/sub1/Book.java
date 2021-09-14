package chapter07.sub1;

public class Book {
  int bookNo; // 도서번호
  String title; // 도서 제목

  public Book(int bookNo, String title) {
    this.bookNo = bookNo;
    this.title = title;
  }

  public int getBookNo() {
    return bookNo;
  }

  public void setBookNo(int bookNo) {
    this.bookNo = bookNo;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void showInfo() {
    System.out.println("도서 번호: " + bookNo + ", 도서 제목:" + title);
  }
}
