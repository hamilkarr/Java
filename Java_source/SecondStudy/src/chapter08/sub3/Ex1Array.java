package chapter08.sub3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class Ex1Array {
  ArrayList<String> lists3 = new ArrayList<String>();

  public static void main(String[] args) {
    Collection<String> list1 = new ArrayList<String>();
    list1.add("테스트1");
    list1.add("테스트2");
    list1.add("테스트1");
    Collection<String> list2 = new HashSet<String>();
    list2.add("테스트1");
    list2.add("테스트2");
    list2.add("테스트1");

    System.out.println("===========list1==========");
    Scanner scan = new Scanner(System.in);
    String key = scan.nextLine();
    for (String s : list1) {
      if (s.indexOf(key) != -1) {
        System.out.println(s);
      } else {
        System.out.println("찾는 도서가 없습니다.");
      }
      // System.out.println(s);
    }

    /*
     * ㅌ
     */
  }
}
