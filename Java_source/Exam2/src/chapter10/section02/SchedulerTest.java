package chapter10.section02;

// 필기 보강
import java.io.IOException;

public class SchedulerTest {
  public static void main(String[] args) throws IOException {
    System.out.println("전화 상담 배분 방식 선택");
    System.out.println("R : 한명씩 차례로 할당");
    System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
    System.out.println("P : 우선순위가 높은 고객 먼저 할당");
    System.out.println("A : 상담원이 다음 전화 요청");

    int ch = System.in.read();
    Scheduler scheduler = null;
    if (ch == 'R') {
      scheduler = new RoundRobin();

    } else if (ch == 'L') {
      scheduler = new LeastJob();

    } else if (ch == 'P') {
      scheduler = new PriorityAllocation();
    } else if (ch == 'A') {
      scheduler = new AgentGetCall();
    }

    scheduler.getNextCall();
    scheduler.sendCallToAgent();
  }
}