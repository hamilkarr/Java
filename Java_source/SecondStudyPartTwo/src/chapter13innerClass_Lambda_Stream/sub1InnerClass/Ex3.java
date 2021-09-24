package chapter13innerClass_Lambda_Stream.sub1InnerClass;

public class Ex3 {
  public static void main(String[] args) {
    OuterClass3 out = new OuterClass3();

    // outerMethod가 호출 -> 스택 -> 종료 -> 반환하고 제거
    // num -> 제거
    // in -> new InnerClass() - Heap -> 여전히 outerMethod의 지역변수 num을 정상적으로
    // 사용 -> num가 제거되지 않았다...
    // 스택 X -> 데이터 영역
    // 지역 내부 클래스에서 지역변수를 참조, 사용 -> 자동적으로 상수화
    // public final 자동으로 앞에 추가함

    InnerAbstractClass in = out.outerMethod(100);
    in.innerMethod();

  }
}
