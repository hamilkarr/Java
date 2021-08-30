package chapter10.section01;

public class Monitor implements Display, MainBoard, PowerSupply, IOPort {
  public final static int NUM = 10;

  @Override
  public String type() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String portType() {
    // System.out.println(IOPort.type);
    // TODO Auto-generated method stub
    return IOPort.type;
  }

}
