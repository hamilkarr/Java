package chapter9;

/* 
구현되지 않은 메서드 정의
  1) 상속받은 클래스에 구현되지 않은 메서드를 구현
  2) 상속받은 클래스도 추상 클래스로 변형
*/

public abstract class NoteBook extends Computer {
  void monitor() {
    System.out.println("NoteBook 모니터");
  }

  void cpu() {
    System.out.println("NoteBook CPU");
  }

  void webcam() {
    System.out.println("NoteBook Webcam");
  }

}
