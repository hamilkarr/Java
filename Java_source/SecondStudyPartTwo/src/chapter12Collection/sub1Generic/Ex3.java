package chapter12Collection.sub1Generic;

public class Ex3 {
  public static void main(String[] args) {
    GenericPrinter<Material> printer = new GenericPrinter<Material>();

    printer.addMaterial(new Plastic());
    printer.printing();

    printer.addMaterial(new Powder());
    printer.printing();
  }
}
