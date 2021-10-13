package chapter11BasicClass.sub6ClassClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
  public static void main(String[] args) throws ClassNotFoundException {
    Class strClass = Class.forName("java.lang.String");

    Constructor[] cons = strClass.getConstructors();
    for (Constructor con : cons) {
      System.out.println(con);
    }
    System.out.println("=============================================");
    Field[] fields = strClass.getFields();
    for (Field field : fields) {
      System.out.println(field);
    }
    System.out.println("=============================================");
    Method[] methods = strClass.getMethods();
    for (Method method : methods) {
      System.out.println(method);
    }
  }
}
