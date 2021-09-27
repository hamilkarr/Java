package chapter14Exception.sub1;

public class ResourceEx1 implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("ResourceEx1 닫기.");

  }

}
