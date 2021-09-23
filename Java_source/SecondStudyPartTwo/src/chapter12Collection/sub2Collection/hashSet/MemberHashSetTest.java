package chapter12Collection.sub2Collection.hashSet;

import chapter12Collection.sub2Collection.Member;

public class MemberHashSetTest {
  public static void main(String[] args) {
    MemberHashSet list = new MemberHashSet();
    list.addMember(new Member(1000, "이름1"));
    list.addMember(new Member(1001, "이름2"));
    list.addMember(new Member(1002, "이름3"));
    list.addMember(new Member(1000, "이름1"));

    list.showMembers();
  }
}
