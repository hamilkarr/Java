package Chapter5;

public class Person {
  int age;
  String name;
  boolean isMarried = true;
  int children;

  /*
   * public Person() { System.out.println("생성자 호출"); }
   */ /*
       * 기본 생성자가 없으면 인스턴스 생성이 불가능하다. 생성자가 없으면 컴파일할때 자동으로 추가한다.
       */

  public Person(int age, String name) { // 생성자 매개변수에 2개만 입력한 경우
    this.age = age;
    this.name = name;
  }

  public Person(int age, String name, boolean isMarried, int children) {
    this.age = age;
    this.name = name;
    this.isMarried = isMarried;
    this.children = children;
  }

  public void showinfo() {
    String isMarriedstr = isMarried ? "결혼" : "미혼";
    System.out.println("나이 = " + age);
    System.out.println("이름 = " + name);
    System.out.println("결혼 여부 " + isMarriedstr);
    System.out.println("자녀수 = " + children);
  }
}
