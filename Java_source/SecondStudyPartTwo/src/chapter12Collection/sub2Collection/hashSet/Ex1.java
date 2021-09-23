package chapter12Collection.sub2Collection.hashSet;

import java.util.HashSet;

public class Ex1 {
  public static void main(String[] args) {
    HashSet<String> list = new HashSet<>();
    list.add(new String("이름1"));
    list.add(new String("이름2"));
    list.add(new String("이름3"));
    list.add(new String("이름1"));

    for (String s : list) {
      System.out.println(s);
    }
  }
}
