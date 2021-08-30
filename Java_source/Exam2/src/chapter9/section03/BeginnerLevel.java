package chapter9.section03;

public class BeginnerLevel extends PlayerLevel {

  @Override
  void run() {
    System.out.println("천천히 달린다.");

  }

  @Override
  void jump() {
    System.out.println("Jump할 줄 모르지롱");

  }

  @Override
  void turn() {
    System.out.println("Turn할 줄 모르지롱");

  }

  @Override
  void showLevelMessage() {
    System.out.println("==== 초보자 레벨 입니다. ====");

  }

}
