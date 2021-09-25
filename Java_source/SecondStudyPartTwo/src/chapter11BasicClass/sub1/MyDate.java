package chapter11BasicClass.sub1;

import java.util.Objects;

public class MyDate {
  int day;
  int month;
  int year;

  public MyDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof MyDate))
      return false;
    MyDate other = (MyDate) obj;
    return day == other.day && month == other.month && year == other.year;
  }

  public class MyDateTest {
    public static void main(String[] args) {
      MyDate date1 = new MyDate(9, 18, 2004);
      MyDate date2 = new MyDate(9, 18, 2004);
      System.out.println(date1.equals(date2));
    }
  }
}
