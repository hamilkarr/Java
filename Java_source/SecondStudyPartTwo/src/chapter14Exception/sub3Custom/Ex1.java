package chapter14Exception.sub3Custom;

public class Ex1 {
  public static void main(String[] args) {
    String memID = "abcefgh";
    String password = "1234";
    try {
      login(memID, password);
    } catch (MemberIDException | MemberPassException e) {
      // TODO Auto-generated catch block
      System.out.println(e.getMessage());
    }
  }

  public static boolean login(String memID, String password) throws MemberIDException, MemberPassException {
    // 아이디가 6자리 이상 인지 체크 - 아니면 MemberIDException 발생
    if (memID.length() < 6) {
      throw new MemberIDException("아이디는 6자리 이상 입력해 주세요");
    }
    if (password.length() < 6) {
      throw new MemberPassException("비밀번호 6자리 이상 입력해 주세요.");
    }

    return true;
  }
}
