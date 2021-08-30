package Chapter5;

public class AccessEx1 {
  public int num1 = 10;
  int num2 = 20;

  private int num3 = 30;
  protected int num4 = 40;

  public AccessEx1() {
    System.out.println(this.num3);
  }
}
