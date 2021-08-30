package chapter7;

public class ArrayEx3 {
  public static void main(String[] args) {
    char[] alpha = new char[26];
    char ch = 'A';
    for (int i = 0; i < alpha.length; i++) {
      alpha[i] = ch++;
    }
    System.out.print(alpha);
    /*
     * for (int i = 0; i < alpha.length; i++) { System.out.print(alpha[i]); }
     */
  }
}
