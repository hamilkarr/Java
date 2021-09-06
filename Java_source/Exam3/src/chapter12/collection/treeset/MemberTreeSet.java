package chapter12.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import chapter12.collection.Member;

/* 
*/
public class MemberTreeSet {
  private TreeSet<Member> memberList;

  public MemberTreeSet() {
    memberList = new TreeSet<>(new Member());
  }

  // 추가
  public void addMember(Member member) {
    memberList.add(member);
  }

  // 삭제
  public boolean removeMember(int memberID) {
    Iterator<Member> ir = memberList.iterator();
    /*
     * hasNext() next()
     */
    while (ir.hasNext()) {
      Member member = ir.next();
      if (member.getMemberID() == memberID) {
        memberList.remove(member);
        return true;
      }
    }
    return false;
  }

  public void shwoMembers() {
    for (Member member : memberList) {
      System.out.println(member);
    }
  }

}
