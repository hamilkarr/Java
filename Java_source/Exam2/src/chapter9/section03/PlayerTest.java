package chapter9.section03;

public class PlayerTest {
  public static void main(String[] args) {
    Player player = new Player(); // 초보자 레벨
    player.play(2);

    player.upgradeLevel(new AdvancedLevel());
    player.play(3);

    player.upgradeLevel(new SuperLevel());
    player.play(4);

  }
}
