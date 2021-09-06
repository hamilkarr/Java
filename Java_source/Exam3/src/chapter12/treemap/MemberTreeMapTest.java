package chapter12.treemap;

import chapter12.collection.Member;

public class MemberTreeMapTest {
  public static void main(String[] args) {
    MemberTreeMap list = new MemberTreeMap();
    list.addMember(new Member(1001, "이름1"));
    list.addMember(new Member(1002, "이름2"));
    list.addMember(new Member(1003, "이름3"));
    list.addMember(new Member(1004, "이름4"));

    list.showMembers();
  }
}
