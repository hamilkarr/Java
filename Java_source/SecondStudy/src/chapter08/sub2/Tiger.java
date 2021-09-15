package chapter08.sub2;

public class Tiger extends Animal {
  @Override
  void move() {
    System.err.println("호랑이가 네발로 걷습니다.");
  }

  void hunting() {
    System.out.println("호랑이가 사냥을 합니다.");
  }
}
