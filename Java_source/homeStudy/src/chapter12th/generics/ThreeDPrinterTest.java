package chapter12th.generics;

import java.io.PrintWriter;

public class ThreeDPrinterTest {
  public static void main(String[] args) {
    ThreeDPrinter<Powder> printer = new ThreeDPrinter<>();
    printer.setMaterial(new Powder());
    Powder powder = printer.getMaterial();
    System.out.println(printer);

    ThreeDPrinter<Plastic> printer1 = new ThreeDPrinter<>();
    printer1.setMaterial(new Plastic());
    Plastic plastic = printer1.getMaterial();
    System.out.println(printer1);

    printer1.printing();
  }
}
