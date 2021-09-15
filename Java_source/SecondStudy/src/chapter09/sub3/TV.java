package chapter09.sub3;

public abstract class TV {
  // TV 클래스 -> 다른 클래스에서 공유하기 위한 기능으로만 사용될 경우
  // 인스턴스를 만들지 못하게 하기위해 -> abstract
  void turnOn() {
    System.out.println("전원 켜기");
  }

  void turnOff() {
    System.out.println("전원 끄기");
  }
}
