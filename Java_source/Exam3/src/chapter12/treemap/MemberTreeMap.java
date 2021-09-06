package chapter12.treemap;

import java.util.Comparator;
import java.util.Iterator;

import java.util.TreeMap;

import chapter12.collection.Member;

class IntegerDescOrder implements Comparator<Integer> {

  @Override
  public int compare(Integer o1, Integer o2) {
    return o1.compareTo(o2) * -1; // 정수의 내림차순
  }

}

public class MemberTreeMap {
  private TreeMap<Integer, Member> memberList;

  public MemberTreeMap() {
    memberList = new TreeMap<>(new IntegerDescOrder());
  }

  // 추가
  public void addMember(Member member) {
    memberList.put(member.getMemberID(), member);
  }

  // 삭제
  public boolean removeMember(int memberID) {
    if (memberList.containsKey(memberID)) {
      memberList.remove(memberID);
      return true;
    } else {
      return false;
    }
  }

  // 출력
  public void showMembers() {
    // Set<Integer> set = memberList.keySet();
    // Iterator ir = set.iterator();
    Iterator<Integer> ir = memberList.keySet().iterator();
    while (ir.hasNext()) {
      int memberID = ir.next();
      Member member = memberList.get(memberID);
      System.out.println(member);
    }
  }
}
