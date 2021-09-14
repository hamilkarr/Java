package chapter06.section2;

public class Transportation {
  private String lineNo;
  private int fare;
  private int passengerCount;
  private int profit;

  public Transportation(String lineNo, int fare) {
    this.lineNo = lineNo;
    this.fare = fare;
  }

  public int getFare() {
    return fare;
  }

  public void collect() {
    profit += fare;
    passengerCount++;
  }

  public void showInfo() {
    System.out.println("노선번호 : " + lineNo + ", 승객수 : " + passengerCount + ", 총이익 : " + profit);
  }

}
