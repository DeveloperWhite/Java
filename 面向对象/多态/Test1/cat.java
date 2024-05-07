package 多态.Test1;
//猫类
public class cat extends Animal{
  //方法重写
  @Override
  public void move() {
    System.out.println("猫在走猫步");
  }
  //不是从父类中继承过来的方法，是猫类特有的方法
  public void catchMouse(){
    System.out.println("猫抓老鼠");
  }
}
