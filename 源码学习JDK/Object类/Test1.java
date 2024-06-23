package Object类;

import java.util.Objects;

//JDK库的根类：Object
/*
因为这些方法都是子类通用的，任何一个类默认继承Object，就算没有直接继承，最终也会间接继承
Object类中常用的方法：
如何查找：
1.查阅源代码(比较麻烦)
2.查阅Java的类库的帮助文档
API（Application Program interface）：应用程序编程接口，整个JDK的类库就是一个JavaSE的API，每个API都会配置一套API帮助文档，就是sun公司提前写好的类库
常用方法：
protected Object clone()  //负责对象克隆
boolean	equals (Object obj)  //判断两个对象是否相等
int	hashCode()  //获取对象哈希值
protected void finalize()  //垃圾回收器负责调用的方法
String	toString()  //将对象转化为字符串形式

关于Object类中的toString（）方法（返回值为String类型字符串）
源代码：
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
源代码上toString（）方法默认实现：
类名+@+对象的内存地址转换为十六进制的形式
作用：调用这个方法可以将这个java对象转换为字符串形式
建议所有的子类都去重写toString（）方法

关于关于Object类中的equals（）方法
源代码：
public boolean equals(Object obj) {
        return (this == obj);
    }
源代码上toString（）方法默认实现：
默认实现上调用的还是==，而==不能判断两个java对象是否相等，Object类中的equals方法不够用，则需要重写equals方法
作用：以后编程的过程当中，都要通过equals方法来判断两个对象是否相等
//JAVA语言中的字符串String，重写了toString和equals方法
String类已经重写equals方法，比较两个字符串不能用==，必须使用equals方法，
String类已经重写toString方法。
//Java中基本数据类型的数据是否相等采用==，Java中所有引用数据类型的数据统一采用equals方法来判断
equals方法的深层理解：
 //只要不是类中自带的重写equals方法，都要在类中重写equals方法，防止一个类中还有其他引用数据类型，
 需要在里面创建对象，此时重写equals方法，有效避免比较引用类中的对象地址，从而比较内容

 //关于Object类中的finalize方法
源代码;
     protected void finalize() throws Throwable { }
finalize方法只有一个方法体，里面没有代码，用protected关键字修饰
这个方法不需要程序员手动调用,JVM垃圾回收器自动调用,只需要重写方法即可
当一个对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize方法，同样也是为程序员准备了一个时机：垃圾回收时机
static{}静态代码块也准备了一个时机：类加载时机

//关于hashCode方法
源代码：
public native int hashCode();
这个方法不是抽象方法，带有native关键字，底层调用c++程序
作用：返回哈希码
实际上就是一个Java对象的内存地址，经过哈希算法，得出的一个值
所以hashCode方法的执行结果可以看成是一个Java对象的内存地址
 */
public class Test1 {
  public static void main(String[] args) {
    myTime c=new myTime(1970,8,22);
    String c1=c.toString();
    //未重写toString()方法前输出默认输出：类名@对象的内存地址转换为十六进制的形式
    //数组.System.out.println(c1);结果：myTime@b4c966a
    //我希望看到一个具体地日期字符串，则需要重写toString（）方法
    System.out.println(c1);//1970年8月22日
    //判断两个基本数据类型的数据是否相等直接使用==就行，这里的双等号保存的是保存的数据100
    int a=100;
    int b=100;
    System.out.println(a==b);
    //判断两个Java对象（引用数据类型）是否相等
    //创建一个新对象
    myTime t=new myTime(2008,8,8);
    //再创建一个新对象，这里若用双等号则比较的是t和t1对象的内存地址，显然两个对象内存地址不同，不能用==来判断两个Java对象是否相等
    myTime t1=new myTime(2008,8,8);
    System.out.println(t==t1);//false，比较的是对象的内存地址
    //重写equals方法之前调用默认equals方法
//    数组.System.out.println(t.equals(t1));//false，因为运用的还是==相等
    //重写后的equals方法
    System.out.println(t.equals(t1));//true
    //再创建一个对象
    myTime t2=new myTime(2008,8,9);
    System.out.println(t.equals(t2));//false
    //若指向null，因为null不是指向myTime，不能通过instanceof关键字
    myTime t3=null;
    System.out.println(t.equals(t3));//false
    //大部分情况下采用这样的方式创建字符串对象
    String s1="Hello";
    String s2="abc";
    //实际上String属于一个类，不属于基本数据类型，一定存在构造方法
    //new了两次，两个对象内存地址，s3保存的内存地址和s4保存的内存地址不同，用双等号不能判断这两个对象是否相等，只能调用equals方法
    String s3=new String("Test1");
    String s4=new String("Test1");
    System.out.println(s3==s4);//false
    //而String类中已经重写equals方法直接调用即可
    System.out.println(s3.equals(s4));//true
    //String类重写toString方法
    String s5=new String("动力节点");
    //如没重写则输出类名@十六进制地址
    System.out.println(s5.toString());//已经重写，输出动力节点
    System.out.println(s5);//.toString也可以省略，输出的是动力节点而不是对象的内存地址表明toString方法已经重写
    person m=new person();
    //如何把person对象变成垃圾
    m=null;
    //hashCode方法
    Object n=new Object();
    int hashCodeValue=n.hashCode();
    System.out.println(hashCodeValue);
  }
}
class myTime extends Object{
  int year;
  int month;
  int day;

  public myTime() {
  }

  public myTime(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  //默认toString方法
/*  public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
  }*/

  //重写toString方法（简洁的，易阅读的）
  @Override
  public String toString() {
    return this.year+"年"+this.month+"月"+this.day+"日";
  }
  //默认equals方法
/*  public boolean equals(Object obj) {
    return (this == obj);
  }*/
  //this为引用t，obj为参数，采用多态

  //重写equals方法，根据需要比较的内容来定重写的equals方法
/*  @Override
  public boolean equals(Object obj) {
    //当对象中年，月，日都相同时才表示两个对象相同
    //获取第一个对象的年月日
    int year1=this.year;
    int month1=this.month;
    int day1=this.day;
    //获取第二个对象的年月日
*//*    int year2=obj.year;
    int month2=obj.month;
    int day2=obj.day;*//*
    //父类中的引用无法访问子类中的变量，需要向下转型，同时要加上instanceof关键字防止类型转换异常
    //如果父类型obj引用指向myTime对象则进行强制类型转换
    if(obj instanceof myTime){
      myTime m=(myTime)obj;
      int year2=m.year;
      int month2=m.month;
      int day2=m.day;
      //比较
      if(year1==year2&&month1==month2&&day1==day2){
        return true;
      }
    }
    //代表转换对象都不对
    return false;
  }*/

  //改良一下equals方法
  @Override
  public boolean equals(Object obj) {
    //如果obj指向null或者obj没有指向myTime
    if (obj == null || !(obj instanceof myTime)) {
      return false;
    }
    //如果obj和this本来对象的内存地址相同
    if (obj == this) {
      return true;
    }
    //表示能转型
    myTime m = (myTime) obj;
    return this.year == m.year && this.month == m.month && this.day == m.day;
    }

}
class person{
  //该方法已经过时了
  //重写finalize方法
  //person对象被垃圾回收器回收的时候，垃圾回收器负责调用finalize方法
  protected void finalize()throws Throwable{
    System.out.println("即将被销毁");
  }
}

