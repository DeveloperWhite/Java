package this关键字.this1;
//this关键字
/*
1.this是一个引用，this是一个变量，this变量中保存的内存地址指向了堆内存Java对象自身，this存储在JVM堆内存java对象内部
2.创建100个java对象，每一个对象都有this，也就有100个不同的this
  没有static关键字参与的方法被称为实例方法
  没有static关键字参与的变量被称为实例变量
3.this可以出现在实例方法（不带static的方法）中指向当前正在执行动作的对象，this代表当前对象
4.this在多数情况下都是可以省略不写的
5.this不能使用在带有static的方法中
 */
//顾客类
public class Customer {
  //姓名
  String name;//实例变量，访问该对象的时候必须先创建对象通过引用访问（引用.name）
  //无参构造方法
  public Customer(){
  }
  //不带static关键字的方法，顾客购物行为，每个顾客购物是不一样的，所以属于对象级别的行为，this属于访问当前对象
  public void shopping(){
    //当张三在购物的时候输出张三在购物
    //当李四在购物的时候输出李四在购物
    //在访问实例变量name的时候必须用引用.，
    System.out.println(this.name+"在购物");
  }
  //带有static方法，若要访问name应该创建对象，和main方法中一样，这里引用是访问c指向的对象，而并非当前对象
  public static void doSome(){
    Customer c=new Customer();
    System.out.println(c.name);
  }
}
