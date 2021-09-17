package chapter11BasicClass.sub6ClassClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Ex3 {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
      InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    Class cls = Class.forName("chapter11BasicClass.sub6ClassClass.Book");
    Constructor<Book> c = cls.getDeclaredConstructor(String.class, int.class);
    Book book = c.newInstance("책1", 20000);
    System.out.println(book);

  }
}
