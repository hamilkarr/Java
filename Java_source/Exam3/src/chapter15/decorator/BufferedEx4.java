package chapter15.decorator;

import java.io.*;

public class BufferedEx4 {
  public static void main(String[] args) {
    try (FileReader fr = new FileReader("output2.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("output2_copied.txt");
        BufferedWriter bw = new BufferedWriter(fw))

    {
      int i;
      while ((i = br.read()) != -1) {
        bw.write(i);
      }
      bos.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
