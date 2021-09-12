package chapter12;

import chapter12.Member;

public class MemberHashMapTest {
  public static void main(String[] args) {
    MemberHashMap memberHashMap = new MemberHashMap();

    Member memberLee = new Member(1000, "이름1");
    Member memberSon = new Member(1001, "이름2");
    Member memberPark = new Member(1002, "이름3");
    Member memberHong = new Member(1003, "이름4");

    memberHashMap.addMember(memberLee);
    memberHashMap.addMember(memberSon);
    memberHashMap.addMember(memberPark);
    memberHashMap.addMember(memberHong);

    memberHashMap.showAllMember();

    memberHashMap.removeMember(1004);
    memberHashMap.showAllMember();
  }
}
