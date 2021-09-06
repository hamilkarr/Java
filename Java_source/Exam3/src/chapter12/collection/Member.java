package chapter12.collection;

import java.util.Comparator;

public class Member implements /* Comparable<Member> */ Comparator<Member> {
  private int memberID;
  private String memberName;

  public Member() {
  }

  // 생성자 초기화
  public Member(int memberID, String memberName) {
    this.memberID = memberID;
    this.memberName = memberName;
  }

  public int getMemberID() {
    return memberID;
  }

  public void setMemberID(int memberID) {
    this.memberID = memberID;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  // toString()의 기본 출력값은 클래스명+ 인스턴스 주소
  @Override
  public String toString() {
    return "회원 아이디 : " + memberID + ", 회원 이름 : " + memberName + ", 해쉬코드 : " + hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    Member member = (Member) obj;
    if (member.getMemberID() == memberID) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    // 아이디가 동일하면 동일 인물
    return memberID;
  }

  // @Override
  // public int compareTo(Member o) {
  // // 오름차순
  // /*
  // * System.out.println("memberId : " + memberID + "o.getMemberID" +
  // * o.getMemberID()); return memberID - o.getMemberID();
  // */

  // return memberName.compareTo(o.getMemberName()); // 회원명으로 오름차순
  // }

  @Override
  public int compare(Member o1, Member o2) {
    // TODO Auto-generated method stub
    return o1.getMemberID() - o2.getMemberID();
  }

}
