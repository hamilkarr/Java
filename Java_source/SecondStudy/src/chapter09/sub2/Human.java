package chapter09.sub2;

public class Human extends Mammal {

  @Override
  void breeds() {
    System.out.println("Human Breeds");

  }

  @Override
  void move() {
    System.out.println("사람이 두발로 걷습니다.");

  }

}
