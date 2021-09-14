package chapter07.sub1;

public class Ex01 {
  public static void main(String[] args) {
    // int[] nums = new int[4];
    // System.out.println(nums[0]);
    // System.out.println(nums[1]);
    // System.out.println(nums[2]);
    // System.out.println(nums[3]);

    // int[] nums = new int[] { 10, 20, 30, 40, 50 };
    // int[] nums = { 10, 20, 30, 40, 50 };

    int[] nums;
    nums = new int[] { 1, 2, 3, 4, 5 };
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }
}
