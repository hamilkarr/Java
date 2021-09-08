package chapter15;

import java.io.IOException;

public class Ex1 {
  public static void main(String[] args) {
    try {
      System.out.println("문자 1개를 입력하세요 : ");
      int i = System.in.read();
      System.out.println(i);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
