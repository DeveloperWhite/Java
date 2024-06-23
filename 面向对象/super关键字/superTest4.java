package super关键字;
//this可以单独用，super不能单独用，必须用super.才行
//super不是引用，super也不保存内存地址，super也不指向任何对象
//super只是代表当前对象内部的那一块父类型特征
public class superTest4 extends Object{
  //静态方法，主方法
  public static void main(String[] args) {
     superTest4 c=new superTest4();
     c.doSome();
  }
  //定义实例方法
  public void doSome(){
    //输出引用的时候会自动调用引用的tcoString()方法（若没有继承则自动继承Object类中的方法）
    System.out.println(this);
    //与这句一样：数组.System.out.println(this.toString());
    //superTest4@10f87f48输出类名+内存地址
    /*编译报错，需要在super后加个.
    数组.System.out.println(super);*/
  }
}
