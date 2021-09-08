package chapter12th.collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

import chapter12th.collection.Member;

public class MemberTreeSet {
  private TreeSet<Member> treeset;

  public MemberTreeSet() {
    treeset = new TreeSet<Member>(new Member());
  }

  public void addMember(Member member) {
    treeset.add(member);
  }

  public boolean removeMember(int memberID) {
    Iterator<Member> iterator = treeset.iterator();
    while (iterator.hasNext()) {
      Member member = iterator.next();
      int tempID = member.getMemberID();
      if (memberID == tempID) {
        treeset.remove(member);
        return true;
      }
    }
    System.out.println(memberID + " 가 존재하지 않습니다");
    return false;
  }

  public void showAll() {
    for (Member member : treeset) {
      System.out.println(member);
    }
    System.out.println();
  }
}
