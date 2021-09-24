package chapter13innerClass_Lambda_Stream.sub1InnerClass;

public class OuterClass4 {
  InnerAbstractClass in = new InnerAbstractClass() {

    @Override
    public void innerMethod() {
      // TODO Auto-generated method stub

    }

  };

  public InnerAbstractClass innerMethod() {
    return new InnerAbstractClass() {

      @Override
      public void innerMethod() {
        System.out.println("지역 내부 메서드");

      }

    };

  }
}
