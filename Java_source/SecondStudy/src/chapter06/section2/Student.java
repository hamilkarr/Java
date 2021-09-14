package chapter06.section2;

public class Student<T extends Transportation> {
  private String name;
  private int money;

  public Student(String name, int money) {
    this.name = name;
    this.money = money;
  }

  public void ride(Transportation trans) {
    int fare = trans.getFare();
    this.money -= fare;
    trans.collect(); // 요금 징수, 승객 수 증가
    // trans.method();

    // T -> Object -> 입력된 형
    /*
     * if (trans instanceof Bus) { Bus bus = (Bus)trans; bus.method(); } else if
     * (trans instanceof Subway) { Subway sub = (Subway)trans; sub.method(); }
     */
  }

  public void showInfo() {
    System.out.println("이름 : " + name + ", 잔액 : " + money);
  }
}
