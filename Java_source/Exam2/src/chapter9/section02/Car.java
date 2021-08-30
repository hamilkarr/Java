package chapter9.section02;

public abstract class Car {
  /*
   * abstract void run();
   * 
   * abstract void refuel();
   * 
   * void stop() { System.out.println("차가 멈춥니다."); }
   */
  public abstract void drive();

  public abstract void stop();

  public abstract void wiper();

  public void startCar() {
    System.out.println("시동을 켭니다.");
  }

  public void turnOff() {
    System.out.println("시동을 끕니다.");
  }

  final public void run() {
    startCar();
    drive();
    wiper();
    stop();
    turnOff();
  }
}
