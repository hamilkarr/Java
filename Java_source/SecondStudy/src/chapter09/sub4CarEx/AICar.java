package chapter09.sub4CarEx;

public class AICar extends Car {

  @Override
  void drive() {
    System.out.println("AI가 알아서 운전을 합니다.");

  }

  @Override
  void stop() {
    System.out.println("AI가 알아서 차를 멈춥니다.");

  }

}
