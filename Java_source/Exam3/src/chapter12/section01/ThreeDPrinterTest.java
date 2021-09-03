package chapter12.section01;

public class ThreeDPrinterTest {
  public static void main(String[] args) {
    Plastic plastic = new Plastic();
    ThreeDPrinter printer = new ThreeDPrinter();
    printer.setMaterial(plastic);
    Plastic plastic2 = (Plastic) printer.getMaterial();
    plastic2.showInfo();

    Powder powder = new Powder();
    printer.setMaterial(powder);
    Powder powder2 = (Powder) printer.getMaterial();
    powder2.showInfo();

  }
}
