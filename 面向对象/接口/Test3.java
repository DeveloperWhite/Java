package 接口;
//继承和实现都存在
//extends关键字在前
//implements关键字在后
//接口通常提取的是行为动作
public class Test3 {
  public static void main(String[] args) {
    //创建对象
    Flyable a=new cat();
    a.fly();
    Flyable b=new pig();
    b.fly();
    Flyable c=new fish();
    c.fly();

  }
}
//动物类，父类
class Animal{

}
//翅膀接口，是一对翅膀
interface Flyable{
  void fly();
}
//动物类子类，猫类继承动物类，实现飞翔的接口，能让猫可以飞翔
class cat extends Animal implements Flyable{
  public void fly(){
    System.out.println("肥猫起飞");
  }
}
class snake extends Animal{

}
//想飞就插上翅膀这个接口
class pig extends Animal implements Flyable{
  public void fly(){
    System.out.println("猪要起飞");
  }
}
//没写extends继承默认继承Object
class fish implements Flyable{
  @Override
  public void fly() {
    System.out.println("飞鱼");
  }
}
