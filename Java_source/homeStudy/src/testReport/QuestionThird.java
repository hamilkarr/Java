package testReport;

public class QuestionThird {
  public static void main(String[] args) {
    int floor = 5;
    switch (floor) {
      case 1:
        System.out.println(floor + "층 약국 입니다.");
        break;
      case 2:
        System.out.println(floor + "층 정형외과 입니다.");
        break;
      case 3:
        System.out.println(floor + "층 피부과 입니다.");
        break;
      case 4:
        System.out.println(floor + "층 치과 입니다.");
        break;
      case 5:
        System.out.println(floor + "층 헬스클럽 입니다.");
        break;
      default:
        System.out.println("없는 층 입니다.");
    }
  }
}
