package transPortation;

public class TransTest {
  public static void main(String[] args) {
    Trans[] t = new Trans[3];

    t[0] = new Human();
    t[1] = new Subway();
    t[2] = new Car();

    for (Trans tz : t) {
      tz.move();
      if (tz instanceof Human) {
        Human human = (Human) tz;
        human.beHealthy();
        System.out.println("=======================");
      } else if (tz instanceof Subway) {
        Subway subway = (Subway) tz;
        subway.flatSpeed();
        System.out.println("=======================");
      } else if (tz instanceof Car) {
        Car car = (Car) tz;
        car.maintenanceCost();
      }
    }
  }
}
