package chapter14Exception.sub3Custom;

// 아이디 검증 예외

public class MemberIDException extends Exception {
  public MemberIDException(String message) {
    super(message);
  }
}
