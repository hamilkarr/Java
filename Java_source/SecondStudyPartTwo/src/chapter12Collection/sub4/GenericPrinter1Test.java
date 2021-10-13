package chapter12Collection.sub4;

public class GenericPrinter1Test {
  public static void main(String[] args) {
    GenericPrinter1<Powder1> powderPrinter1 = new GenericPrinter1<>();
    powderPrinter1.setMaterial(new Powder1());
    Powder1 powder1 = powderPrinter1.getMaterial();
    System.out.println(powderPrinter1);
    System.out.println("===================================");

    GenericPrinter1<Plastic1> plasticPrinter1 = new GenericPrinter1<>();
    plasticPrinter1.setMaterial(new Plastic1());
    Plastic1 plastic1 = plasticPrinter1.getMaterial();
    System.out.println(plasticPrinter1);
  }
}
