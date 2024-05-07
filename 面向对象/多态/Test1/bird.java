package 多态.Test1;
//鸟儿类
public class bird extends Animal{
  //方法重写
  public void move(){
    System.out.println("鸟儿在飞翔");
  }
  //是鸟类特有的方法
  public void fly(){
    System.out.println("鸟捉虫");
  }
}
