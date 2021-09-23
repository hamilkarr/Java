package chapter12Collection.sub2Collection.hashSet;

import java.util.TreeSet;
import chapter12Collection.sub2Collection.Member;

public class Ex3 {
  public static void main(String[] args) {
    TreeSet<Member> list = new TreeSet<>();
    list.add(new Member(1002, "이름3"));
    list.add(new Member(1000, "이름4"));
    list.add(new Member(1001, "이름2"));
    list.add(new Member(1003, "이름1"));

    for (Member member : list) {
      System.out.println(member);
    }
  }
}
