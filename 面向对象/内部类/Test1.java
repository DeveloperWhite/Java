package 内部类;
//内部类：在类的内部又定义了一个新的类
/*
内部类分为：
1.实例内部类：类似于实例变量
2.静态内部类：类似于静态变量
3.局部内部类：类似于局部变量
4.匿名内部类(局部内部类的一种)：用的最多
本节代码没讲到匿名内部类
 */
public class Test1 {
  public static void main(String[] args) {
    //调用MyMath中的sum方法
    MyMath m=new MyMath();
    //需要把参数传进去，后面两个数字都好传，关键computer c如何传进去
    //无法new computer实例化，因为他为抽象的，但通过implements(实现)关键字，实现抽象接口的实例化从而能传入对象
    //相当于合在一起写
    /*computerAchieve c=new computerAchieve();
    m.sum(c,100,120);*/
    m.sum(new computerAchieve(),100,120);
  }
}
class ccc{
  //静态内部类
  static class in{

  }
  //没有static叫做实例内部类
  class inn{

  }
  public void doSome(){
    //在方法中类似于实例变量
    //实例内部类
    class inn3{

    }
  }
  public void doOther(){
    //doSome方法中的局部内部类inn3在doOther方法中不能调用

  }
}
//定义个计算接口
interface computer{
  //抽象方法
  int sum(int a,int b);
}
//如何传入接口的参数，通过编写接口实现类
//这样写相当于该类有名字，名字是computerAchieve
class computerAchieve implements computer{
  //对接口中的方法进行重写，进而实现该方法
  @Override
  public int sum(int a, int b) {
    return a+b;
  }
}
//数学类
class MyMath{
  //定义数学求和方法，调接口中的求和，不要多想把他看成String name
  public void sum(computer c,int x,int y){
    int value=c.sum(x,y);
    System.out.println(value);
  }
}
