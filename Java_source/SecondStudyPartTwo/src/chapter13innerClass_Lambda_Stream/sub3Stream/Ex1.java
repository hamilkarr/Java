package chapter13innerClass_Lambda_Stream.sub3Stream;

import java.util.Arrays;

public class Ex1 {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    Arrays.stream(nums).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

    String[] texts = { "A", "AB", "ABC", "DEF" };
    Arrays.stream(texts).filter(s -> s.length() >= 2).forEach(s -> System.out.println(s));
  }
}
