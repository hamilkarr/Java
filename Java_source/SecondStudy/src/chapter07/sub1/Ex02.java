package chapter07.sub1;

import java.util.Arrays;

public class Ex02 {
  public static void main(String[] args) {
    int[][] nums = new int[2][3];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        System.out.println(nums[i][j]);
      }
    }

    int[][][] nums2 = new int[2][3][4];
    for (int i = 0; i < nums2.length; i++) {
      for (int j = 0; j < nums2.length; j++) {
        for (int k = 0; k < nums2.length; k++) {
          System.out.println(nums2[i][j][k]);
        }
      }
    }
  }
}
