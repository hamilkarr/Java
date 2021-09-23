package chapter12Collection.sub2Collection.arrayList;

import java.util.ArrayList;

import chapter12Collection.sub2Collection.*;

public class MemberArrayList {
  private ArrayList<Member> members;

  public MemberArrayList() {
    members = new ArrayList<Member>();
  }

  // 회원 추가
  public void addMember(Member member) {
    members.add(member);
  }

  // 회원 삭제
  public boolean removeMember(int memberID) {
    for (int i = 0; i < members.size(); i++) {
      Member member = members.get(i);
      if (member.getMemberID() == memberID) { // remove
        members.remove(i);
        return true;
      }
    }
    return false;
  }

  // 회원 조회
  public void showMembers() {
    for (Member member : members) {
      System.out.println(member);
    }
  }
}
