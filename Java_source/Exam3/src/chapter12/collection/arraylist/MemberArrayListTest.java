package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {
  public static void main(String[] args) {
    MemberArrayList list = new MemberArrayList();
    Member mem1 = new Member(1001, "이름1");
    Member mem2 = new Member(1002, "이름2");
    Member mem3 = new Member(1003, "이름3");
    // Member mem4 = new Member(2000, "낙하산");

    list.addMember(mem1);
    list.addMember(mem2);
    list.addMember(mem3);
    list.insertMember(4, new Member(2000, "낙하산"));

    list.showMembers();
    System.out.println("----------------------");
    list.removeMember(1002);
    list.showMembers();
  }
}
