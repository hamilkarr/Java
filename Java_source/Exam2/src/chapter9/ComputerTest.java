package chapter9;

import java.util.ArrayList;

public class ComputerTest {
  public static void main(String[] args) {
    // Computer c1 = new Computer(); 추상클래스는 인스턴스 생성자 불가능.
    Computer c2 = new DeskTop();
    // NoteBook c3 = new NoteBook();
    // c2.keyboard();
    Computer c4 = new Tablet();
    // c4.keyboard();

    ArrayList<Computer> computers = new ArrayList<>();
    computers.add(c2);
    computers.add(c4);

    for (Computer c : computers) {
      if (c instanceof NoteBook) {
        NoteBook nc = (NoteBook) c;
        nc.webcam();
      }
      c.keyboard();
    }
  }
}
