package chapter14Exception.sub1;

public class ResourceEx2 implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("ResourceEx2 닫기.");

  }

}
