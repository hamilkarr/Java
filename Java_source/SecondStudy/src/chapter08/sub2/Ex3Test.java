package chapter08.sub2;

import java.util.ArrayList;

public class Ex3Test {
  public static void main(String[] args) {
    Human human = new Human();
    Tiger tiger = new Tiger();

    ArrayList<Animal> list = new ArrayList<>();

    list.add(human);
    list.add(tiger);

    for (Animal animal : list) {
      animal.move();
      if (animal instanceof Human) {
        Human human1 = (Human) animal; // 다운캐스팅
        human1.readBook();
      } else if (animal instanceof Tiger) {
        Tiger tiger1 = (Tiger) animal;
        tiger1.hunting();
      }
    }
  }
}
