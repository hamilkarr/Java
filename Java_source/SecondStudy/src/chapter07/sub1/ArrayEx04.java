package chapter07.sub1;

public class ArrayEx04 {
  public static void main(String[] args) {
    String[] texts = new String[3];
    texts[0] = "ABC";
    texts[1] = "DEF";
    texts[2] = "GHI";
    // texts[3] = "JKL";

    String[] texts2 = new String[6];
    for (int i = 0; i < texts.length; i++) {
      texts2[i] = texts[i];
    }

    texts2[3] = "JKL";
    texts2[4] = "MNO";
    texts2[5] = "PQR";
  }
}
