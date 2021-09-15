package chapter09.sub2;

public class TestEx1 {
  public static void main(String[] args) {
    animalMove(new Human());
    animalMove(new Tiger());
    animalMove(new Eagle());
  }

  public static void animalMove(Animal animal) {
    animal.move();
    if (animal instanceof Mammal) { // Human, Tiger
      Mammal mammal = (Mammal) animal;
      mammal.breeds();
    } else if (animal instanceof Eagle) {
      Eagle eagle = (Eagle) animal;
      eagle.hatch();
    }
  }
}
