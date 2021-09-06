package chapter11.wrapper;

// import java.lang.Integer;

public class IntegerA {
  public static void main(String[] args) {
    int num1 = 100;
    Integer num2 = Integer.valueOf(200);

    int num3 = num1 + num2;
    // Integer -> int -> ¾ð ¹Ú½Ì

    System.out.println(num3);

    Integer num4 = num1; // int -> Integer -> ¿??Åä ¹Ú½Ì
    System.out.println(num4.hashCode());
  }

}
