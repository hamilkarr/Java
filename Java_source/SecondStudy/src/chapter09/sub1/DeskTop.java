package chapter09.sub1;

public class DeskTop extends Computer {

  @Override
  void cpu() {
    System.out.println("데스크탑 cpu");
  }

  @Override
  void motherboard() {
    System.out.println("데스크탑 motherboard");

  }
}
