package chapter11BasicClass;

class MyDate {
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

  // @Override
  // public boolean equals(Object obj) {

  // if (obj instanceof MyDate) {
  // MyDate date = (MyDate) obj;
  // return (this.day == date.day && this.month == date.month && this.year ==
  // date.year);
  // }
  // return false;
  // }

  @Override
  public int hashCode() {
    return day * 10 + month * 101 + year * 102;
  }
}

public class MyDateTest {
  public static void main(String[] args) {
    MyDate date1 = new MyDate(9, 18, 2004);
    MyDate date2 = new MyDate(9, 18, 2004);
    System.out.println(date1.equals(date2));
  }
}