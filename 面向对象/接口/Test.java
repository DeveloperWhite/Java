package 接口;
//接口
/*
1.接口是引用数据类型，编译后也是class字节码文件
2.接口是完全抽象的（抽象类是半抽象的），接口是特殊的抽象类
3.接口的定义语法：不能有class关键字
[修饰符列表] interface 接口名{
}
类：
[修饰符列表] class 类名{
}
4.接口支持多继承，一个接口可以继承多个接口
5.接口中只包含常量和抽象方法
6.接口中所有的元素都是public修饰，都是公开的
7.接口中的抽象方法定义时，public static可以省略
8.接口中只能定义抽象方法，而抽象方法不能带有方法体，所以接口中的方法不能有方法体
9.接口中的常量，public static final可以省略
10.类和类之间叫继承，类和接口之间叫实现，但仍可用继承去看待
11.继承使用extends关键字，实现使用implements关键字
12.接口中不能创建对象，要创建对象也是实现的子类中创建对象，也不能实例化：new MyMath();
 */
public class Test {
  public static void main(String[] args) {
    //访问接口的常量
    System.out.println(MyMath.PI);
    //常量不能重新赋值(修改)
    //使用多态，父类型引用指向子类型对象
    MyMath c=new ABC();
    //调用接口里的方法，面向接口编程
    System.out.println(c.sum(12,10));//22
    System.out.println(c.sub(12,10));//2

  }
}
//定义接口A
interface A{

}
interface B{

}
//支持多继承
interface C extends A,B{

}
interface MyMath{
  //抽象方法
  //public abstract int sum(int a,int b);
  //接口当中既然都有事抽象方法，则public abstract 就可以省略、
  //抽象方法
  int sum(int a,int b);
  //相减的抽象方法
  int sub(int a,int b);
  //public static final double PI=3.1415926;
  //public static final可以省略
  double PI=3.1415926;
}
//编写一个类（非抽象类）
//会继承抽象方法，所以在普通方法中会报错，要重写，或者把类定义成抽象类
class ABC implements MyMath{
  //重写/覆盖/实现接口中上述方法
/*接口中的方法都是公共的public，所以继承之后子类中只能给他分配更高的访问权限而不能分配低的访问权限，所以public不能去除
  访问权限更低了
  int sum(int a,int b){
    return a+b;
  }*/
  public int sum(int a,int b){
    return a+b;
  }
  public int sub(int a,int b){
    return a-b;
  }
}