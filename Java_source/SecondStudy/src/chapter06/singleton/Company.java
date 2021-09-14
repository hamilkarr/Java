package chapter06.singleton;

public class Company {
  // 싱글톤 패턴은 인스턴스가 무조건 동일한 1개만 생성

  // 1. 생성자 -> private 접근 제어자(외부 접근 X, 내부에서만 접근)
  // 2. 내부에서 인스턴스 생성
  // 3. 내부에서 생성된 인스턴스를 외부에서 접근할 수 있는 메서드(public)
  // 4. 외부에서 생성 불가 -> 생성없이 클래스 명으로

  private static Company instance = new Company();

  private Company() {
  }

  public static Company getInstance() {
    return instance;
  }

}
