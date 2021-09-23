package chapter12Collection.sub2Collection.linkedList;

import chapter12Collection.sub2Collection.Member;

public class MemberLinkedListTest {
  public static void main(String[] args) {
    MemberLinkedList list = new MemberLinkedList();
    list.addMember(new Member(1000, "이름1"));
    list.addMember(new Member(1001, "이름2"));
    list.addMember(new Member(1002, "이름3"));

    list.showMembers();
    System.out.println("===================");

    list.popMember();
    list.showMembers();
  }
}
