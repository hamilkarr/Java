package chapter12Collection.sub2Collection;

public class Member implements Comparable<Member> {
  private int memberID;
  private String memberName;

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

  @Override
  public String toString() {
    return "아이디: " + memberID + ", 회원명: " + memberName;
  }

  @Override
  public boolean equals(Object obj) {
    Member member = (Member) obj;
    if (member.getMemberID() == memberID) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return memberID;
  }

  @Override
  public int compareTo(Member o) {
    return this.memberName.compareTo(o.getMemberName()) * -1;
  }

}
