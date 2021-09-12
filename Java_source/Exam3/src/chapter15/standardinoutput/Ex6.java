package chapter15.standardinoutput;

import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {
  /*
   * public static void main(String[] args) throws UnsupportedEncodingException {
   * 
   * // Scanner scanner = new Scanner(System.in); Scanner scanner = new
   * Scanner(new InputStreamReader((System.in), "UTF-8"));
   * System.out.println("문자를 입력하시오 : "); while (true) { String text =
   * scanner.nextLine(); System.out.println(text); } }
   */

  public static void main(String[] args) throws IOException { // BufferedReader 변수 선언
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
    // readLine()을 사용하여 Enter키를 입력하기 전까지의 값을 입력받는다
    String brStr = br.readLine();
    // BufferedReader는 String변수만 받으므로 숫자로 변환하려면
    // Integer.parseInt를 사용하여 String을 Int로 변환해야합니다
    int brInt = Integer.parseInt(br.readLine());
    // 결과 출력
    System.out.println("brStr : " + brStr);
    System.out.println("brInt : " + brInt);
  }

}
