package chapter12Collection.sub2Collection.hashSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex2 {
  public static void main(String[] args) {
    Comparator<String> com = new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        return o1.compareTo(o2) * -1;
      }

    };
    TreeSet<String> list = new TreeSet<>();
    list.add(new String("이름1"));
    list.add(new String("이름3"));
    list.add(new String("이름2"));
    list.add(new String("이름4"));

    for (String s : list) {
      System.out.println(s);
    }

  }
}
