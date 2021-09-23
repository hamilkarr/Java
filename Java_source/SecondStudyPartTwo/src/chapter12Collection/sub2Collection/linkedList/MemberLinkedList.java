package chapter12Collection.sub2Collection.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import chapter12Collection.sub2Collection.Member;

public class MemberLinkedList {
  private LinkedList<Member> members;

  public MemberLinkedList() {
    members = new LinkedList<Member>();
  }

  // 회원 추가
  public void addMember(Member member) {
    members.add(member);
  }

  // 마지막 회원 제거
  public void popMember() {
    members.pop();
  }

  // 회원 제거
  public boolean removeMember(int memberID) {
    Iterator<Member> ir = members.iterator();
    while (ir.hasNext()) {
      Member member = ir.next();
      if (member.getMemberID() == memberID) {
        members.remove(member);
        return true;
      }
    }
    return false;
  }

  // 회원 출력
  public void showMembers() {
    for (Member member : members) {
      System.out.println(member);
    }
  }
}
