package chapter10.sub1;

public interface A {
  int num = 10; // 멤버변수의 상수화: public static final(정적 상수)

  void methodA();

  // abstract 붙이지 않아도 컴파일러가 자동으로 public abstract 추가
  void methodB();
}
