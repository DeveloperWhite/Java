import final关键字.B;

/*
猜数字游戏
一个类A1有一个实例变量v，从键盘接受一个正整数作为实例变量v的初始值，另外再定义一个类B1，对A的实例变量v进行猜测
如果大了则提示大了
小了则提示小了
等于则提示猜测成功
 */
public class 猜数字游戏  {
  public static void main(String[] args) {
    //创建A对象并赋值实例变量v的值
    A1 c=new A1(100);
    //创建B1的对象并将A1的对象变量c赋值（A1的引用）
    B1 t=new B1(c);
    java.util.Scanner s=new java.util.Scanner(System.in);
    //一直猜下去
    while (true){
      System.out.println("输入数字：");
      int num1=s.nextInt();
      t.cai(num1);
    }
  }
}
class A1{
  private int V;//封装的实例变量v

  public A1() {
  }

  public A1(int v) {
    V = v;
  }

  public int getV() {
    return V;
  }

  public void setV(int v) {
    V = v;
  }
}
class B1{
  //通过B猜测A
  //通过B对象有一个A对象的引用
  //B1类用于对A1的实例变量V进行猜测。B1类包含一个私有的A1对象引用t，通过该引用可以访问和操作A1类中的实例变量V。
  private A1 a;//封装

  public B1() {
  }

  public B1(A1 t) {
    this.a = t;
  }

  public A1 getT() {
    return a;
  }

  public void setT(A1 t) {
    this.a = t;
  }

  //定义猜的方法
  public void cai(int num){
    //实际数字
    int shiJiZhi=a.getV();//通过t引用访问实例变量v的值
    if (shiJiZhi==num){
      System.out.println("猜测成功");
      //以前没有写过，猜对终止
      System.exit(0);
      //终止程序的执行
      //终止JVM
    } else if (shiJiZhi>num) {
      System.out.println("猜小了");
    }else{
      System.out.println("猜大了");
    }
  }
}
