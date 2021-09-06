package chapter12.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import chapter12.collection.Member;

public class MemberHashMap {
  private HashMap<Integer, String> memberList;

  public MemberHashMap() {
    memberList = new HashMap<>();
  }

  // 추가
  public void addMember(Member member) {
    memberList.put(member.getMemberID(), member.getMemberName());
  }

  // 제거
  public boolean removeMember(int memberID) {
    if (memberList.containsKey(memberID)) {
      memberList.remove(memberID);
      return true;
    } else {
      return false;
    }
  }

  // 출력
  public void shoMembers() {
    Set<Integer> set = memberList.keySet();
    Iterator<Integer> ir = set.iterator();
    while (ir.hasNext()) {
      int memID = ir.next();
      String memNm = memberList.get(memID);
      System.out.println("아이디: " + memID + ", 회원 아름: " + memNm);
    } // 회원 아이디

  }
}
