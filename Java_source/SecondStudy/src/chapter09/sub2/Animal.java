package chapter09.sub2;

public abstract class Animal {
  public String text = "Animal";

  abstract void move();

  void showInfo() {
    System.out.println("Animal!");
  }
}
