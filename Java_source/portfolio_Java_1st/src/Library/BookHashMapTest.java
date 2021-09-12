package Library;

public class BookHashMapTest {
  public static void main(String[] args) {
    BookHashMap bookHashMap = new BookHashMap();

    Book book1 = new Book(1001, "한강", "조정래", "대하사극", false);
    Book book2 = new Book(1002, "태백산맥", "조정래", "대하사극", false);
    Book book3 = new Book(1002, "몰라", "조정래", "단편사극", false);

    bookHashMap.addBook(book1);
    bookHashMap.addBook(book2);
    bookHashMap.addBook(book3);

    bookHashMap.showAllBook();

    /*
     * int totalPrice = bookList.stream().mapToInt(b->b.getPrice()).sum();
     * System.out.println("모든 책 가격의 합은 " + totalPrice + "원 입니다");
     * bookHashMap.stream().filter(b->b.getPrice() >=
     * 20000).map(b->b.getName()).sorted().forEach(s->System.out.println(s));
     */
  }
}
