package trashCan;

import java.util.HashSet;
import java.util.Iterator;

import Library.Book;

public class BookHashSet {
  private HashSet<Book> hashSet;

  public BookHashSet() {
    hashSet = new HashSet<Book>();
  }

  public void addBook(Book book) {
    hashSet.add(book);
  }

  public boolean removeBook(int bookID){
    Iterator<Book> ir = hashSet.iterator();

    while(ir.hasNext()){
      Book book = ir.next();
      int tempID = book.getBookID();
      if(tempID == bookID) {
        hashSet.remove(book)
        return true;
      }
    }
    System.out.println(bookID + "가 존재하지 않습니다.");
    return false;
  }

  public void showAllBook() {
    for (Book book : hashSet) {
      System.out.println(book);
    }
  }
}
