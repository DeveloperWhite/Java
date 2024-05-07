package 抽象类;
//一个非抽象类继承抽象类，必须将抽象类中的方法进行覆盖(重写)
//若子类也和父类一样定义成抽象类的话，那么继承过来的抽象方法也可以不覆盖（重写）
public class abstractTest2 {
  public static void main(String[] args) {
    //能不能使用多态
    //父类型引用指向子类型对象
    Animal a=new bird();//面向抽象编程
    //之后都是调用a.XXX
    //a的类型都是Animal，Animal又是抽象的
    //面向抽象编程，可以减低程序的耦合度，提高程序的扩展力
    a.move();
  }
}
//动物类（抽象类）
abstract class Animal{
  //抽象方法
  public abstract void move();
}
//非抽象类，子类
//子类会继承父类中move抽象方法，而非抽象类中不能出现抽象方法，需要将父类中继承的抽象方法进行覆盖或者是重写
class bird extends Animal{
  public void move(){
    System.out.println("鸟儿在飞翔");
  }
}
