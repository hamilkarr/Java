package chapter12.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberArrayList {
  private ArrayList<Member> memberList;

  public MemberArrayList() {
    memberList = new ArrayList<>();
  }

  // 회원 추가
  public void addMember(Member member) {
    if (member != null) {
      memberList.add(member);
    }
  }

  // 회원 추가2
  public void insertMember(int index, Member member) {
    if (member != null && index >= 0 && index <= memberList.size()) {
      memberList.add(index, member);
    }
  }

  // 회원 삭제
  public boolean removeMember(int memberID) {
    // get : ArrayList 요소를 조회
    /*
     * for (int i = 0; i < memberList.size(); i++) { Member member =
     * memberList.get(i); if (member.getMemberID() == memberID) {
     * memberList.remove(i); return true; } } return false;
     */
    Iterator<Member> ir = memberList.iterator();
    while (ir.hasNext()) {
      Member member = ir.next();
      if (member.getMemberID() == memberID) {
        memberList.remove(member);
        return true;
      }
    }
    return false;
  }

  // 회원 목록 출력
  public void showMembers() {
    for (Member member : memberList) {
      System.out.println(member);
    }
  }
}
