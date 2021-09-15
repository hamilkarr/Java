package chapter08.sub1;

public class Ex1Test {
  public static void main(String[] args) {
    B b = new B();
    C c = new C();

    B bb = new C();
    A aa = new C(); // 묵시적 형변환

    C cc = (C) aa; // 다운 캐스팅

  }
}
