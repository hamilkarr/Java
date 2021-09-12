
package Library;

public class Book {
  private int bookID;
  private String bookName;
  private String author;
  private String genre;
  private boolean isRent;

  public Book(int bookID, String bookName, String author, String genre, boolean isRent) {
    this.bookID = bookID;
    this.bookName = bookName;
    this.author = author;
    this.genre = genre;
    this.isRent = isRent;
  }

  public int getBookID() {
    return bookID;
  }

  public void setBookID(int bookID) {
    this.bookID = bookID;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public boolean isRent() {
    return isRent;
  }

  public void setRent(boolean isRent) {
    this.isRent = isRent;
  }

  @Override
  public String toString() {
    return bookID + " , 책이름: " + bookName + " 작가: " + author + " 장르: " + genre + " 대여 여부: " + isRent;

    // //private int bookID;
    // private String bookName;
    // private String author;
    // private String genre;
    // private boolean isRent;
  }
}