package 继承;
//测试类
/*
//继承
关于继承，继承是三大特征之一：封装，继承，多态
基本作用：代码复用，但最重要的作用是：有了继承才有以后方法覆盖和多态机制
继承的语法格式：
[修饰符列表] class 类名 extends 父类名{
       类体=属性+方法
JAVA语言中的继承只支持单继承，一个类只能继承一个类，不能继承多个类
关于继承中的术语：
B类继承A类：
A类称为：父类，基类，超类，superclass
B类称为：子类，派生类，subclass
子类继承父类继承哪些数据：
私有的不支持继承
构造方法不支持继承
其他都可继承
虽然JAVA语言中只支持单继承，但是一个类也可以间接继承其它类
例如：
C extend B{}
B extend A{}
A extend T{}
C直接继承B类，间接继承T,A类
}
JAVA语言中，假设没有继承任何一个类的话，默认继承JAVASE库中的java.lang.Object类
 */
public class Test {
  public static void main(String[] args) {
    creditAccount c=new creditAccount();
    c.setBalance(1000);
    System.out.println(c.getBalance());
  }
}
