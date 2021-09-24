package chapter12Collection.sub2Collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;

import chapter12Collection.sub2Collection.Member;

public class MemberHashMap {
  private HashMap<Integer, Member> members;

  public MemberHashMap() {
    members = new HashMap<>();
  }

  // 추가
  void addMember(Member member) {
    members.put(member.getMemberID(), member);
  }

  // 삭제
  boolean removeMember(int memberID) {
    // containsKey : 키값이 존재하는지 여부 체크
    if (members.containsKey(memberID)) {
      members.remove(memberID);
      return true;
    }
    return false;
  }

  // 출력
  void showMembers() {
    // Key 값이 Set 자료형 -> Set 에서 Iterator 사용
    Iterator<Integer> ir = members.keySet().iterator();
    while (ir.hasNext()) {
      int key = ir.next();
      // Member member = members.get(key);
      System.out.println(members.get(key));
    }
  }
}
