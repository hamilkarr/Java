package chapter09.sub4CarEx;

public class TestCarEx1 {
  public static void main(String[] args) {
    ManualCar mCar = new ManualCar();
    AICar aiCar = new AICar();

    mCar.run();
    System.out.println("================================");
    aiCar.run();
  }
}
