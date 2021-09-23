package chapter12Collection.sub2Collection.hashSet;

import java.util.HashSet;
import java.util.Iterator;

import chapter12Collection.sub2Collection.Member;

public class MemberHashSet {
  private HashSet<Member> members;

  public MemberHashSet() {
    members = new HashSet<Member>();
  }

  // 회원 추가
  public void addMember(Member member) {
    members.add(member);
  }

  // 회원 제거
  public boolean removeMember(int memberID) {
    // 순서가 없기 때문에, 인덱스 번호로 접근 불가능
    // 향상된 for문, 또는 Iterator를 통해서 반복 순회

    /*
     * for (Member member : members) { if (member.getMemberID() == memberID) {
     * members.remove(member); return true; } }
     */
    Iterator<Member> ir = members.iterator();
    // hasNext() -> 다음 요소가 있는지 여부 체크(true,false)
    // next() -> 다음 요소를 가져오는 메서드
    while (ir.hasNext()) {
      Member member = ir.next();
      if (member.getMemberID() == memberID) {
        members.remove(member);
        return true;
      }
    }
    return false;
  }

  public void showMembers() {
    for (Member member : members) {
      System.out.println(member);
    }
  }
}
