package chapter10th.sort;

public class QuickSort implements Sort {

  @Override
  public void ascending(int[] arr) {
    System.out.println("QuickSort ascending");

  }

  @Override
  public void descending(int[] arr) {
    System.out.println("QuickSort descending");

  }

  @Override
  public void description() {
    // TODO Auto-generated method stub
    Sort.super.description();
    System.out.println("QuickSort 입니다.");
  }

  /*
   * @Override public void description() { System.out.println("QuickSort 입니다."); }
   */

}
