package chapter12.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter12.collection.Member;

// 추가 삭제 조회
public class MemberHashSet {
  private HashSet<Member> memberList;

  public MemberHashSet() {
    memberList = new HashSet<>();
  }

  // 추가
  public void addMember(Member member) {
    memberList.add(member);
  }

  // 삭제
  public boolean removeMember(int memberID) {
    Iterator<Member> ir = memberList.iterator();

    /*
     * hasNext() : 다음 요소가 있는지 여부를 체크하는 메서드 next() : 다음 요소를 가져오는 메서드
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

  // 출력
  public void showMembers() {
    for (Member member : memberList) {
      System.out.println(member);
    }
  }
}
