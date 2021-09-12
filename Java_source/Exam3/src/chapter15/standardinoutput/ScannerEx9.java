package chapter15.standardinoutput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class History {
  private int date;
  private String item;
  private int type;
  private int price;

  public History(int date, String item, int type, int price) {
    this.date = date;
    this.item = item;
    this.type = type;
    this.price = price;
  }

  @Override
  public String toString() {
    String typeStr = (type == 0) ? "지출" : "수입";
    return "날짜 : " + date + ", 품목 : " + item + ", 구분 :" + typeStr + ", 금액 :" + price;
  }

}

public class ScannerEx9 {
  public static void main(String[] args) throws IOException {
    ArrayList<History> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.print("날짜 : ");
    int date = Integer.parseInt(scanner.nextLine());
    System.out.println();

    System.out.print("품목명 : ");
    String item = scanner.nextLine();
    System.out.println();

    System.out.print("지출(0),수입(1) : ");
    int type = Integer.parseInt(scanner.nextLine());
    System.out.print("금액 : ");
    int price = Integer.parseInt(scanner.nextLine());

    list.add(new History(date, item, type, price));

    for (History history : list) {
      System.out.println(history);
    }
  }
}
