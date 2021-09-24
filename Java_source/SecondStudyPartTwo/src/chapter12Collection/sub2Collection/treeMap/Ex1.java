package chapter12Collection.sub2Collection.treeMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

public class Ex1 {
  public static void main(String[] args) {
    // Integer - 정렬의 기준이 이미 내장정의 (Comparable - compareTo)
    // @Functional Interface -> 람다식

    // Comparator<Integer> com = new Comparator<>() {

    // @Override
    // public int compare(Integer o1, Integer o2) {
    // return o1.compareTo(o2) * -1;
    // }

    // };

    // TreeMap<Integer, String> list = new TreeMap<>(com);

    TreeMap<Integer, String> list = new TreeMap<>((Integer o1, Integer o2) -> o1.compareTo(o2) * -1);
    list.put(1002, "이름3");
    list.put(1000, "이름1");
    list.put(1001, "이름2");
    list.put(1003, "이름4");

    Iterator<Integer> ir = list.keySet().iterator();
    while (ir.hasNext()) {
      int key = ir.next();
      String value = list.get(key);
      System.out.println("아이디: " + key + ", 이름: " + value);
    }
  }
}
