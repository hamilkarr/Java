package chapter9.section02;

public class Bus extends Car {

  @Override
  void refuel() {
    System.out.println("천연 가스를 충전합니다.");
  }

  @Override
  void run() {
    System.out.println("버스가 달립니다.");
  }

  void takePassenger() {
    System.out.println("승객을 버스에 태웁니다.");
  }
}
