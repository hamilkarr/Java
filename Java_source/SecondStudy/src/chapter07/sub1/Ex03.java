package chapter07.sub1;

public class Ex03 {
  public static void main(String[] args) {
    int[][] nums = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
    for (int i = 0; i < nums.length; i++) {
      System.out.println("========" + i + "행========");
      for (int j = 0; j < nums.length; j++) {
        System.out.println(nums[i][j]);
      }
    }
  }
}
