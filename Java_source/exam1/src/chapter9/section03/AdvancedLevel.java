package chapter9.section03;

public class AdvancedLevel extends PlayerLevel {

  @Override
  void run() {
    System.out.println("빨리 달립니다.");

  }

  @Override
  void jump() {
    System.out.println("높이 점프합니다.");

  }

  @Override
  void turn() {
    System.out.println("Turn할 줄 모르지롱");

  }

  @Override
  void showLevelMessage() {
    System.out.println("==== 중급자 레벨입니다. ====");

  }

}
