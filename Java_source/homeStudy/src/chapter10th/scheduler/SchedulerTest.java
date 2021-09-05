package chapter10th.scheduler;

import java.io.IOException;

public class SchedulerTest {
  public static void main(String[] args) throws IOException {
    // R , L, P
    System.out.println("전화 상담 배분방식을 선택하세요. R, L, P, A ");
    int ch = System.in.read();
    Scheduler scheduler = null;

    if (ch == 'R' || ch == 'r') {
      scheduler = new RoundRobin();
    } else if (ch == 'L' || ch == 'l') {
      scheduler = new LeastJob();
    } else if (ch == 'p' || ch == 'P') {
      scheduler = new PriorityAllocation();
    } else if (ch == 'A' || ch == 'a') {
      scheduler = new AgentGetCall();
    } else {
      System.out.println("지원하지 않은 기능입니다.");
      return;
    }
    scheduler.getNextCall();
    scheduler.sendCallToAgent();
  }
}
