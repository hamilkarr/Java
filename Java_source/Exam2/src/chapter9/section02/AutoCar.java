package chapter9.section02;

public class AutoCar extends Car {

  @Override
  void refuel() {
    System.out.println("휘발유를 주유합니다.");
  }

  @Override
  void run() {
    System.out.println("차가 달립니다.");
  }

  void load() {
    System.out.println("짐을 싣습니다.");
  }
}
