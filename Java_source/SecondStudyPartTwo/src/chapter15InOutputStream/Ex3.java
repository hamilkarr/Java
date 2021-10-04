package chapter15InOutputStream;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String text = scanner.nextLine();
      System.out.println(text);
    }
  }
}
