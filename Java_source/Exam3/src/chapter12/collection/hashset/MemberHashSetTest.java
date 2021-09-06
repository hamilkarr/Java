package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
  public static void main(String[] args) {
    MemberHashSet list = new MemberHashSet();
    list.addMember(new Member(1001, "이름1"));
    list.addMember(new Member(1002, "이름2"));
    list.addMember(new Member(1003, "이름3"));
    list.addMember(new Member(1002, "이름2"));
    list.addMember(new Member(1002, "이름4"));

    list.showMembers();
  }
}
