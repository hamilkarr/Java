package multiArray;

import java.util.ArrayList;

public class ArrayEx6 {
  public static void main(String[] args) {
    ArrayList<TheBook> books = new ArrayList<TheBook>();
    books.add(new TheBook("자바프로그래밍 입문", 20000));
    books.add(new TheBook("데이터베이스 개론과 실습", 25000));
    books.add(new TheBook("서버 프로그램 구현", 0));

    for (int i = 0; i < books.size(); i++) {
      TheBook book = books.get(i);
      book.showTheBookInfo();
    }
  }
}