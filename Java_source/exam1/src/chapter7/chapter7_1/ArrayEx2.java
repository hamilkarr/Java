package chapter7.chapter7_1;

public class ArrayEx2 {
  public static void main(String[] args) {
    Book[] library = new Book[5]; // Book 참조 자료형 인스턴스 주소가 저장될 공간 5개

    library[0] = new Book("책이름1", "저자1");
    library[1] = new Book("책이름2", "저자2");
    library[2] = new Book("책이름3", "저자3");
    library[3] = new Book("책이름4", "저자4");
    library[4] = new Book("책이름5", "저자5");
    for (int i = 0; i < library.length; i++) {
      System.out.println(library[i]);
    }
  }
}
