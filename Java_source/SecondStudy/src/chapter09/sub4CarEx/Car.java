package chapter09.sub4CarEx;

public abstract class Car {
  abstract void drive();

  abstract void stop();

  public void startCar() {
    System.out.println("시동 켜기");
  }

  public void turnOff() {
    System.out.println("시동 끄기");
  }

  public final void run() {
    startCar();
    drive();
    stop();
    turnOff();
  }
}
