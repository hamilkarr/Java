package chapter13th.lambda;

public class TestStringConCat {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "World";
    StringConCat concat2 = (s, v) -> System.out.println(s + "," + v);
    concat2.makeString(s1, s2);
  }
}
