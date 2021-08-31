package chapter8_2;

import java.util.ArrayList;

public class AnimalTest {
  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<>();

    animals.add(new Human());
    animals.add(new Tiger());
    animals.add(new Eagle());

    for (Animal animal : animals) {
      animal.move();
      if (animal instanceof Human) {
        Human human = (Human) animal;
        human.readBook();
      } else if (animal instanceof Tiger) {
        Tiger tiger = (Tiger) animal;
        tiger.hunting();
      } else if (animal instanceof Eagle) {
        Eagle eagle = (Eagle) animai;
        eagle.flying();
      }
    }

    /*
     * Animal[] animals = new Animal[3];
     * 
     * animals[0] = new Human(); animals[1] = new Tiger(); animals[2] = new Eagle();
     * 
     * for (int i = 0; i < animals.length; i++) { animals[i].move(); }
     */

    /*
     * Human human = new Human(); human.move();
     * 
     * Tiger tiger = new Tiger(); tiger.move();
     * 
     * Eagle eagle = new Eagle(); eagle.move();
     */
  }
}
