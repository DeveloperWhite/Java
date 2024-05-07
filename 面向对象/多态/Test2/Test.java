package 多态.Test2;
//多态的作用：降低程序的耦合度，提高程序的扩展力，父类型引用指向子类型对象，
//核心：面向抽象编程，不要面向具体编程
/*
多态在实际开发中的作用，以下面主任喂养宠物的例子来说明
//主人类
主人可以喂养宠物，所以主人可以有喂养这个动作
//宠物类
宠物可以吃东西，所以宠物有吃东西这个动作
 */
public class Test {
  public static void main(String[] args) {
    //创建主人对象
    Master a=new Master();
    //创建猫对象
    cat tom=new cat();
    //主任喂养猫
    a.feed(tom);
    //创建狗对象
    dog erha=new dog();
    //主人喂养狗
    a.feed(erha);
  }
}
