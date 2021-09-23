package chapter12Collection.sub2Collection.hashSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Ex4 {
  public static void main(String[] args) {
    /*
     * Comparator<Integer> com = new Comparator<Integer>() {
     * 
     * @Override public int compare(Integer o1, Integer o2) { return
     * o2.compareTo(o1); }
     * 
     * }; TreeSet<Integer> list = new TreeSet<>(com);
     */
    TreeSet<Integer> list = new TreeSet<>((Integer o1, Integer o2) -> o1.compareTo(o2) * -1);
    // Integer -> 정렬의 기준이 정의되어 있다. (오름차순)

    list.add(Integer.valueOf(200));
    list.add(Integer.valueOf(100));
    list.add(Integer.valueOf(300));
    list.add(Integer.valueOf(400));

    for (Integer num : list) {
      System.out.println(num);
    }
  }
}
