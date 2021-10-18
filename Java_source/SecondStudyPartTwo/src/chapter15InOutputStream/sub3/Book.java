package chapter15InOutputStream.sub3;

import java.io.Serializable;

public class Book implements Serializable {
  private static final long serialVersionUID = 1234567890L;  
  public String title;
  transient public int price;
  public String author;
}
