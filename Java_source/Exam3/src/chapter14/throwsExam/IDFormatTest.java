package chapter14.throwsExam;

public class IDFormatTest {
  private String userID;
  private String password;

  public String getUserID() {
    return userID;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) throws PasswordException {
    if (password == null) {
      throw new PasswordException("비밀번호가 null 이면 안됩니다.");
    }
    if (password.matches("[^a-zA-z]+") && password.matches("[!@#$%^&*]") && password.matches("[0-9")) {
      throw new PasswordException("문자열 이외에 특수문자 또는 숫자를 함께 입력하세요.");
    }
    if (password.length() <= 5) {
      throw new PasswordException("비밀번호는 6자리 이상 입력하세요.");
    }

    this.password = password;
  }

  public void setUserID(String userID) throws IDFormatException {
    if (userID == null) {
      throw new IDFormatException("아이디가 null 입니다.");
    }
    if (userID.length() < 8 || userID.length() > 20) {
      throw new IDFormatException("아이디는 8~20 자리로 입력하세요.");

    }
    this.userID = userID;
  }

  public static void main(String[] args) {
    IDFormatTest ex = new IDFormatTest();
    // 아이디 null X , 자리수 8~20
    String userID = null;
    try {
      ex.setUserID(userID);
    } catch (IDFormatException e) {
      System.out.println(e);
    }

    userID = "abcd";
    try {
      ex.setUserID(userID);
    } catch (IDFormatException e) {
      System.out.println(e);
    }

    String password = null;
    try {
      password = null;
      ex.setPassword(password);
    } catch (PasswordException e) {
      System.out.println(e);
    }

    try {
      password = "abcd1234!";
      ex.setPassword(password);
    } catch (PasswordException e) {
      System.out.println(e);
    }
  }
}
