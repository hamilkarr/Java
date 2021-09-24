package chapter13innerClass_Lambda_Stream.sub1InnerClass;

public class Ex1 {
  public static void main(String[] args) {
    OuterClass out = new OuterClass();
    OuterClass.InnerClass inner = out.new InnerClass();
    inner.innerMethod();
    inner.innerStaticMethod();
    System.out.println("======================================");
    OuterClass.InnerClass.innerStaticMethod();
  }
}
