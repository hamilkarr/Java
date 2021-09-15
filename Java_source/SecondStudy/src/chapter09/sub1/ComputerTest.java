package chapter09.sub1;

public class ComputerTest {
  public static void main(String[] args) {
    NoteBook note = new NoteBook();
    DeskTop desk = new DeskTop(); // Computer 인스턴스 생성후 -> DeskTop 인스턴스 생성

    // Computer com = new Computer();
    Computer[] computers = new Computer[2];
    computers[0] = note;
    computers[1] = desk;

  }
}
