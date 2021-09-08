package chapter14;

public class AutoCloseEx2 implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("Resource 해제2....");
  }
}
