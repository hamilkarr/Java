package chapter05.sub2;

public class Schedule {
  private int year;
  private int month;
  private int day;

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    if (year < 1) {
      year = 1;
    }
    this.year = year;
  }

  public int getMonth() {

    return month;
  }

  public void setMonth(int month) {
    if (month < 1) {
      month = 1;
    }
    if (month > 12) {
      month = 12;
    }
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    if (day < 1) {
      day = 1;
    }
    if (day > 31) {
      day = 31;
    }
    if (month == 2 && day > 28) {
      day = 28;
    }

    this.day = day;
  }

  void showInfo() {
    System.out.println(year + "-" + month + "-" + day);
  }
}
