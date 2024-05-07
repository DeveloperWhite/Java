package this关键字.this1;

public class CustomerTest {
  public static void main(String[] args) {
    //相当于在堆内存中创建了两个不同的Customer对象，在栈内存中的c1指向其中一个对象，c2指向另一个对象
    //创建Customer对象
    //当使用c1去访问该对象的话此时this就是c1
    Customer c1=new Customer();
    c1.name="zhangSan";
    //再创建Customer对象
    //当使用c2去访问该对象的话此时的this就是c2
    Customer c2=new Customer();
    c2.name="lisi";
    c1.shopping();
    c2.shopping();
    //调用带static方法：类名.方式访问，不需要对象的参与
    Customer.doSome();
  }
}
