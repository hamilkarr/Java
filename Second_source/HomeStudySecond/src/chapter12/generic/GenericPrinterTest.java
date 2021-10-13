package chapter12.generic;

public class GenericPrinterTest {
  public static void main(String[] args) {
    GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
    powderPrinter.setMaterial(new Powder());
    // Powder powder = powderPrinter.getMaterial();
    System.out.println(powderPrinter);
  }
}
