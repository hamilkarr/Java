package chapter08;

import java.util.ArrayList;

class Animal {
  public void move() {
    System.out.println("동물이 움직임");
  }
}

class Human extends Animal {
  public void move() {
    System.out.println("사람이 두발로 걸음");
  }

  public void read() {
    System.out.println("사람이 책을 읽음");
  }
}

class Tiger extends Animal {
  public void move() {
    System.out.println("호랑이가 네발로 걸음");
  }

  public void hunting() {
    System.out.println("호랑이가 사냥을 함");
  }
}

class Eagle extends Animal {
  public void move() {
    System.out.println("독수리가 하늘을 날아감");
  }

  public void flying() {
    System.out.println("독수리가 날개로 하늘을 날아감");
  }
}

public class AnimalTest_P276 {
  public static void main(String[] args) {

    ArrayList<Animal> animalList = new ArrayList<>();
    animalList.add(new Human());
    animalList.add(new Tiger());
    animalList.add(new Eagle());

    for (Animal ani : animalList) {
      ani.move();
    }

    System.out.println("========== 다운캐스팅 예제 시작 ============");

    for (int i = 0; i < animalList.size(); i++) {
      Animal ani = animalList.get(i);

      if (ani instanceof Human) {
        Human h = (Human) ani;
        h.read();
      } else if (ani instanceof Tiger) {
        Tiger t = (Tiger) ani;
        t.hunting();
      } else if (ani instanceof Eagle) {
        Eagle e = (Eagle) ani;
        e.flying();
      } else {
        System.out.println("없는 동물입니다.");
      }
    }
  }
}
