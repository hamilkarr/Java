package chapter11BasicClass.sub6ClassClass;

public class NewInstanceTest {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
    Book book1 = new Book();
    System.out.println(book1);

    Class bClass = Class.forName("chapter11BasicClass.sub6ClassClass.Book");
    Book book2 = (Book) bClass.newInstance();
    System.out.println(book2);
  }
}
