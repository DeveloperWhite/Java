package 接口;
//接口和接口之间支持多继承，一个类可以实现多个接口，弥补了Java中类和类只支持单继承，而现实世界中存在多继承，Java接口弥补了多继承
//向下转型前养成好习惯，加上instanceof进行判断
public class Test2 {
  public static void main(String[] args) {
    //多态，父类型引用指向子类型对象
    X x=new D();
    Y y=new D();
    Z z=new D();
    x.m1();
    //x.m1()，x只能调用m1方法，不能调用m2方法，在类中，若类X和Y存在继承关系才能进行强制类型转换，若没有继承关系，则不能转换，而在接口中即使这两者之间没有继承关系，也能进行强制类型转换
    //虽然接口之间没有继承关系也可以互转，编译器没意见，但是运行时可能会出现ClassCastException
    //强制类型转换,能用x去访问
    //编译没问题,运行也没问题
    Y y2=(Y) x;
    y2.m2();
    //编译没问题，运行有问题，m引用指向H对象，而强转为f后，f引用和H对象没关系
    M m=new H();
    //F f=(F) m;
    if(m instanceof F){
      F f=(F) m;
    }
  }
}
interface M{}
interface F{}
class H implements M{}
interface X{
  void m1();
}
interface Y{
  void m2();
}
interface Z{
  void m3();
}
//实现多个接口就类似于多继承
class D implements X,Y,Z{
  //抽象方法要重写覆盖
  //实现X的接口m1
  public void m1(){
    System.out.println("m1");
  }
  //实现Y的接口m2
  public void m2(){
    System.out.println("m2");
  }
  //实现Z的接口m3
  public void m3(){

  }
}