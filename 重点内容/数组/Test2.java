package 数组;
//一维数组的深入：数组中存储的是引用数据类型
public class Test2 {
  public static void main(String[] args) {
//    静态初始化创建一个animals类型的数组，里面存储a1和a2两个对象
    Animals a1=new Animals();
    Animals a2=new Animals();
    Animals [] animals={a1,a2};
//    对animals数组进行遍历
    for(int i=0;i<animals.length;i++){
//      下面就像
//      定义int类型
//      int [] array={1,2,3};
//      for(int i=0;i<array.length;i++){
//        int temp=array[i];
//        System.out.println(temp);
//      或者合并
//        System.out.println(array[i]);
//      }
//      这里接受一个animals类型的变量，在调用move方法
//      Animals a=animals[i];
//      a.move();
//      animals表示数组，animals[i]表示一个animals类型的对象
//      可以合并
      animals[i].move();
    }
//      动态初始化一个长度为2的Animals类型数组
    Animals [] anim=new Animals[2];
//      创建一个animal对象，放到数组的第一个盒子中
    anim[0]=new Animals();
//      animals数组中不能存放product类型的数据
//      anim[1]=new Product();
//      cat对象即cat类型数据可以存放到animals数组中，因为cat是animals的子类
    anim [1]=new cat();
    anim [0].move();
    anim [1].move();


//    静态初始化创建一个animals数组，存储bird和cat类型，相当于new两次传进去
    Animals [] animals1={new cat(),new bird()};
    for (int i=0;i<animals1.length;i++){
//      下面代码取出来的可能是cat也可能是bird，不过肯定是animal
//      animals1[i]
//      如果调用的是父类中已经存在的方法，即使子类中重写了，他也不要向下转型，直接调用即可
      animals[i].move();
//      想要调用子类中特有的方法，需要向下转型
      if(animals1[i] instanceof cat){
//        转型
        cat c=(cat)animals1[i];
        c.catchMouse();
      } else if (animals1[i] instanceof bird) {
//        转型
        bird b=(bird)animals1[i];
        b.song();
      }
    }



  }
}
//动物类
class Animals{
  public void move(){
    System.out.println("animals move");
  }
}
//商品类
class Product{

}
//cat是animals的子类
class cat extends Animals{
//  重写move方法
  public void move() {
    System.out.println("猫在走猫步");
  }
//  如果在子类cat中有父类中没有的特有方法
  public void catchMouse(){
    System.out.println("猫在抓老鼠");
  }

}
//bird是animals的子类
class bird extends Animals{
  //  重写move方法
  public void move() {
    System.out.println("鸟在飞");
  }
  //  如果在子类bird中有父类中没有的特有方法
  public void song(){
    System.out.println("鸟在歌唱");
  }

}