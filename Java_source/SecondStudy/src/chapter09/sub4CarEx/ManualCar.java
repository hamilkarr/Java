package chapter09.sub4CarEx;

public class ManualCar extends Car {

  @Override
  void drive() {
    System.out.println("사람이 운전을 합니다.");

  }

  @Override
  void stop() {
    System.out.println("사람이 브레이크를 밟아서 차를 멈춥니다.");

  }

}
