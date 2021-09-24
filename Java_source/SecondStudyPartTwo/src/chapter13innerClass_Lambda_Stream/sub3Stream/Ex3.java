package chapter13innerClass_Lambda_Stream.sub3Stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Ex3 {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int total = Arrays.stream(nums).reduce(0, (a, v) -> a + v);
    System.out.println(total);
    System.out.println("===============================");

    String[] texts = { "AB", "A", "B", "C", "ABC", "ABCD" };
    String longtext = Arrays.stream(texts).reduce("", (a, v) -> a.length() >= v.length() ? a : v);
    // System.out.println(longtext);
    BinaryOperator<String> bi = new BinaryOperator<String>() {

      @Override
      public String apply(String t, String u) {
        return t.length() >= u.length() ? t : u;
      }

    };
    String longtext2 = Arrays.stream(texts).reduce(texts[0], bi);
    System.out.println(longtext2);

    String longtext3 = Arrays.stream(texts).reduce(bi).get(); // 초기값이 없는 reduce -> 중간연산
    System.out.println("longtext3:" + longtext3);

    String 
  }
}
