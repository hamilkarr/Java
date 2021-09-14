package chapter06.singleton;

import java.util.Calendar;

public class Ex1 {
  public static void main(String[] args) {
    Calendar c1 = Calendar.getInstance();
    Calendar c2 = Calendar.getInstance();

    System.out.println(System.identityHashCode(c1));
    System.out.println(System.identityHashCode(c2));
  }
}
