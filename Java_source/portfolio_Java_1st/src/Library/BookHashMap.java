package Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import Library.Book;

public class BookHashMap {
  private HashMap<Integer, Book> hashMap;

  public BookHashMap() {
    hashMap = new HashMap<Integer, Book>();
  }

  public void addBook(Book book) {
    hashMap.put(book.getBookID(), book);
  }

  /*
   * public HashMap<Integer, Book> getListByBookName() { HashMap<Book> retList =
   * new HashMap<>(); return null; }
   */
  // public ArrayList<Book> getListByBookName(String BookName);
  // getListByBookName = new Arr
  // // {
  // // ArrayList<Book> retList = new ArrayList<>();
  // // return null;
  // // }

  public boolean removeBook(int bookID) {
    if (hashMap.containsKey(bookID)) {
      hashMap.remove(bookID);
      return true;
    }
    System.out.println(bookID + "가 존재하지 않습니다.");
    return false;
  }

  public void showAllBook() {
    Iterator<Integer> ir = hashMap.keySet().iterator();
    while (ir.hasNext()) {
      int key = ir.next();
      Book book = hashMap.get(key);
      System.out.println(book);
    }
    System.out.println();
  }

  public Object stream() {
    return null;
  }

}
