package chapter15.standardinoutput;

import java.io.Console;

public class ConsoleEx10 {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("아이디 : ");
    String memID = console.readLine();

    System.out.println("비밀번호 : ");
    char[] password = console.readPassword();
    String pass = new String(password);

    System.out.println("아이디 : " + memID);
    System.out.println("비밀번호 : " + pass);
  }
}
