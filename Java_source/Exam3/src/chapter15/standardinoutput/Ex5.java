package chapter15.standardinoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex5 {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new 
    InputStreamReader(System.in));
    int i;
    System.out.println("문자를 입력하시오...");
    while ((i = br.read())!=-1) {
      System.out.println((char));
    }
  }
}
