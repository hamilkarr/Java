package chapter12th.collection.hashset;

import chapter12th.collection.Member;

public class MemberHashSetTest {
  public static void main(String[] args) {
    MemberHashSet memberHashSet = new MemberHashSet();

    Member memberLee = new Member(100, "이순신");
    Member memberKim = new Member(102, "김유신");
    Member memberShin = new Member(101, "신사임당");

    memberHashSet.addMember(memberLee);
    memberHashSet.addMember(memberKim);
    memberHashSet.addMember(memberShin);

    memberHashSet.showAll();

    Member memberLee2 = new Member(100, "이몽룡");
    memberHashSet.addMember(memberLee2);
    memberHashSet.showAll();
  }
}
