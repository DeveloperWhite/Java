package this关键字.this3;

public class DateTest {
  public static void main(String[] args) {
    //创建日期对象1,调用无参构造
    Date c1=new Date();
    c1.print();
    //创建日期对象2，调用有参构造
    Date c2=new Date(2008,8,8);
    c2.print();
  }
}
