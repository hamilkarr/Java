package chapter7_1;

public class ArrayEx5 {
  public static void main(String[] args) {
    Book[] books1 = new Book[3];
    Book[] books2 = new Book[3];

    books1[0] = new Book("책1", "저자1");
    books1[1] = new Book("책2", "저자2");
    books1[2] = new Book("책3", "저자3");

    // 인스턴스를 생성 -> 대입
    for (int i = 0; i < books2.length; i++) {
      books2[i] = new Book(books1[i].getBookName(), books1[i].getAuthor());
    }

  }
}
