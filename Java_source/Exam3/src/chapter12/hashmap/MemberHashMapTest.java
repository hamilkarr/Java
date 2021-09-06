package chapter12.hashmap;

import chapter12.collection.Member;

public class MemberHashMapTest {
  public static void main(String[] args) {
    MemberHashMap list = new MemberHashMap();
    list.addMember(new Member(1003, "이름3"));
    list.addMember(new Member(1001, "이름1"));
    list.addMember(new Member(1004, "이름4"));
    list.addMember(new Member(1002, "이름2"));

    list.shoMembers();
    System.out.println();

    list.removeMember(1004);
    list.shoMembers();
  }
}
