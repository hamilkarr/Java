package chapter12th.collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
  private int memberID;
  private String memberName;

  public Member() {
  }

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

  public String toString() {
    return memberName + " 회원님의 아이디는 " + memberID + " 입니다.";
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member member = (Member) obj;
      if (this.memberID == member.memberID) {
        return true;
      } else {
        return false;
      }
    }
    return false;

  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return memberID;
  }

  @Override
  public int compareTo(Member member) {
    return (this.memberName.compareTo(member.memberName));
  }

  @Override
  public int compare(Member member1, Member member2) {
    return member1.memberID - member2.memberID;
  }

}
