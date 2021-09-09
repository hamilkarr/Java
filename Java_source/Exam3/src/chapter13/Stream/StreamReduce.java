package chapter13.Stream;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

class NumsReducer implements IntBinaryOperator {

  @Override
  public int applyAsInt(int left, int right) {
    // TODO Auto-generated method stub
    return left + right;
  }

}

public class StreamReduce {
  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int result = Arrays.stream(nums).reduce(0, (a, v) -> a + v);
    System.out.println(result);
    System.out.println("=========================");

    int result2 = Arrays.stream(nums).reduce(0, new NumsReducer());
    System.out.println(result2);

    // Arrays.stream(nums).reduce((a, v) -> a + v).stream().forEach(n->
    // System.out.println(n));
    int result3 = Arrays.stream(nums).reduce((a, v) -> a + v).getAsInt();
    System.out.println(result3);
  }
}