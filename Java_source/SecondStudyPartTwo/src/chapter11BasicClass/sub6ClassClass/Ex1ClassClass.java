package chapter11BasicClass.sub6ClassClass;

public class Ex1ClassClass {
  public static void main(String[] args) throws ClassNotFoundException {

    // 1. Object 클래스 - getClass() 2. 모든 클래스에는 정적 상수가 있음 -> class
    // -> 이것을 통해 Class 인스턴스 반환

    Book book = new Book("책1", 20000);
    Class cls = book.getClass();
    System.out.println(cls.getName());

    Class cls2 = Book.class; // Book클래스에 숨어있던 class 상수
    System.out.println(cls2.getName());

    Class cls3 = Class.forName("chapter11BasicClass.sub6ClassClass.Book");
    System.out.println(cls3.getName());
  }
}
