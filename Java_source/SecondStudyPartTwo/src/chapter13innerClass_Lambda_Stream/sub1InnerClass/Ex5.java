package chapter13innerClass_Lambda_Stream.sub1InnerClass;

interface interEx {
  void innerMethod(); // -> public abstract
}

public class Ex5 {
  public static void main(String[] args) {
    interEx ex = new interEx() {
      public void innerMethod() {
        System.out.println("메서드 호출");
      }
    };
  }
}
