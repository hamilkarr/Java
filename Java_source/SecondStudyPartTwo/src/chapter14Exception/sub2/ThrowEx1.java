package chapter14Exception.sub2;

public class ThrowEx1 {
  public void method() {
    /*
     * 외부에서는 예외가 발생 했는지 알수 없음 메서드가 독립적으로 동작 -> 문제 없음. // 다른 메서드에서 호출이 자주 되고 각각 실행되는
     * 문맥이 다를 경우 예외도 각각 다르게 처리해야함
     */

    try {
      Class.forName("chapter14Exception.sub1.ResourceEx2");
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void method2() throws ClassNotFoundException {
    Class.forName("chapter14Exception.sub1.REsourceEx2");
  }
}
