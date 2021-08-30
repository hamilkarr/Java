package chapter6.chapter6_1;

public class SingleTonTest {
  public static void main(String[] args) {
    SingleTon s1 = SingleTon.getInstance();
    SingleTon s2 = SingleTon.getInstance();
    // s1, s2는 동일한 인스턴스, 동일한 주소
    System.out.println("s1 : " + s1);
    System.out.println("s2 : " + s2);
  }
}
