package chapter09.sub5;

public class Ex01 {
  Ex01Abstract ex2 = new Ex01Abstract() {
    int add(int num1, int num2) {
      return num1 + num2;
    }
  };

  public static void main(String[] args) {
    int num3 = 30; // 지역 변수 -> main 함수가 호출 -> 스택 -> 스택종료 -> 제거
    // 지역 내부 클래스에서 사용하는 지역 변수 -> 항상 접근 가능하게 변경
    // 상수화 되어 -> 데이터 영역에 남아 있게 된다.
    Ex01Abstract ex1 = new Ex01Abstract() { // 힙 영역
      int add(int num1, int num2) {
        return num1 + num2 + num3;
      }
    };

    Ex01 ex = new Ex01();
    System.out.println(ex.ex2.add(20, 30));
  }
}
