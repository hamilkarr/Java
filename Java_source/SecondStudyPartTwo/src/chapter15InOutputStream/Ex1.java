package chapter15InOutputStream;

import java.io.IOException;

public class Ex1 {
  public static void main(String[] args) throws IOException {
    char ch = (char) System.in.read();

    // byte - unsigned byte -> 양수 0~255 더이상 읽을 데이터가 없는 경우 -1을 반환
    // short,int,long ....
    // short -> int -> (short)

    System.out.println(ch);
  }
}
