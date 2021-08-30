package chapter10.section01;

public interface IOPort {
  public String type = "DVI"; // 인터페이스 -> public static final이 컴파일 자동으로 추가

  public String portType(); // RGB,DVI,HDMI .....

}
