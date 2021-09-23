package chapter12Collection.sub2Collection.arrayList;

import chapter12Collection.sub2Collection.Member;

public class MemberArrayListTest {
  public static void main(String[] args) {
    MemberArrayList list = new MemberArrayList();
    list.addMember(new Member(1000, "이름1"));
    list.addMember(new Member(1001, "이름2"));
    list.addMember(new Member(1002, "이름3"));

    list.showMembers();

    System.out.println("=========================");
    list.removeMember(1001);
    list.showMembers();

  }
}
