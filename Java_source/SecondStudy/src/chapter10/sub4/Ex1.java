package chapter10.sub4;

public class Ex1 {
  InterfaceEx ex2 = new InterfaceEx() {
    public int add(int num1, int num2) {
      return num1 + num2;
    }
  };

  public static void main(String[] args) {
    InterfaceEx ex = new InterfaceEx() {
      public int add(int num1, int num2) {
        return num1 + num2;
      }
    };
    System.out.println(ex.add(10, 30));
    Ex1 ex1 = new Ex1();
    System.out.println(ex1.ex2.add(10, 30));
  }
}
