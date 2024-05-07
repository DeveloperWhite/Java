package Object类;

import java.util.Objects;

public class 自动生成toString和equals方法 {
  public static void main(String[] args) {
    Time c=new Time(1970,3,22);
    System.out.println(c.toString());//Time{year=1970, month=3, day=22}
    Time c1=new Time(1970,3,24);
    System.out.println(c.equals(c1));//false
  }
}
class Time extends Object {
  private int year;
  private int month;
  private int day;

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public Time() {
  }

  public Time(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
//Generate中直接自动生成toString和equals方法
  @Override
  public String toString() {
    return "Time{" +
            "year=" + year +
            ", month=" + month +
            ", day=" + day +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Time time = (Time) o;
    return year == time.year && month == time.month && day == time.day;
  }
}