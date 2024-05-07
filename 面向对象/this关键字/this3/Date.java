package this关键字.this3;
//自定义的日期类
/*
this作用：
1.可以使用在实例方法中表示当前对象
2.可以使用在构造方法当中，通过当前构造方法调用其他构造方法
this.year=1970;
this.month=12;
this.day=23;
//以上的代码和下面有参构造的代码重复，我们可以通过调用下面的构造方法来完成，前提是不能创建新的对象
//new Date（1970,12,23）;
//需要采用this来调用，这种方法不会创建新的java对象
 */
public class Date {
  //属性
  private int year;
  private int month;
  private int day;
  //构造无参函数，使得调用此方法时输出1970.12.23
  public Date() {
    /*this.year=1970;
    this.month=12;
    this.day=23;*/
    //以上的代码和下面有参构造的代码重复，我们可以通过调用下面的构造方法来完成，前提是不能创建新的对象
    //new Date（1970,12,23）;
    //需要采用this来调用，这种方法不会创建新的java对象，这段this调用只能出现在第一行，上面不能写其他代码
    //在一个构造方法中只能调用一次其他构造方法，只能写一次this（实参）
    this(1970,12,23);
  }
  //构造有参函数
  public Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  //set，get方法
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
  //构造实例方法使得可以将日期输出至控制台
  public void print(){
    System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
  }
}
