package chapter9.section02;

public class CarTest {
  public static void main(String[] args) {
    /*
     * Bus bus = new Bus(); AutoCar autoCar = new AutoCar();
     * 
     * bus.run(); autoCar.run();
     * 
     * bus.refuel(); autoCar.refuel();
     * 
     * bus.takePassenger(); autoCar.load();
     * 
     * bus.stop(); autoCar.stop();
     */
    System.out.println("=== 자율 주행하는 자동차 ===");
    Car myCar = new AiCar();
    myCar.run();

    System.out.println("=== 사람이 운전하는 자동차 ===");
    Car hisCar = new ManualCar();
    hisCar.run();
  }
}
