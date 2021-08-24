package chapter6;

public class Bus {
  int busNum;
  int busPassengerCount;
  int busFare;
  int busProfit;

  public Bus(int busNum, int busFare) {
    this.busNum = busNum;
    this.busFare = busFare;
  }

  public void collect(Student s) {
    this.busProfit += this.busFare; // 버스는 승객이 낸 돈을 수익에 추가
    this.busPassengerCount++;

    s.money -= this.busFare; // 버스에 탄 학생의 돈에서 버스요금 만큼 차감
  }

  public void showInfo() {
    System.out.println("Bus No." + this.busNum + " : " + busPassengerCount + "명 탑승 : " + busProfit);
  }
}
