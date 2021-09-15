package chapter09.sub3;

public class Ex01AbstractTest {
  Ex01Abstract ex2 = new Ex01Abstract() {
    int add(int num1, int num2) {
      return num1 + num2;
    }
  };

  public static void main(String[] args) {
    // 추상클래스를 생성할수 있는 경우
    // 1. 지역 내부 클래스 -> 메서드 안
    // 2. 클래스의 변수로 지정
    // + 미 구현된 부분을 구현함으로서
    // 인스턴스를 생성할 수 있다.

    int num3 = 30; // 지역 내부메서드 내의 변수는 상수화 된다.

    Ex01Abstract ex = new Ex01Abstract() {
      int add(int num1, int num2) {
        return num1 + num2 + num3;
      }
    };

    System.out.println(ex.add(10, 20));

    Ex01AbstractTest ex1test = new Ex01AbstractTest();
    System.out.println(ex1test.ex2.add(30, 50));
  }
}
