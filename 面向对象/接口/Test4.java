package 接口;
//接口在开发中的作用
/*
类似于多态在开发中的作用
多态的作用:面向抽象编程，不是面向具体编程，降低程序的耦合度，提高程序的扩展力
接口的作用：面向抽象编程以后可以改为面向接口编程，有了接口就会可插拔，扩展力就强
 */
/*
饭馆吃饭，有菜单，有厨师，有顾客
 */
//以后进行大项目的开发，一般都是将大项目分成一个模块，一个模块，模块和模块之间采用接口连接，降低耦合度
/*
is a，has a，like a关系
is a：
cat is a animal
凡是能够满足is a的表示继承关系
A extends B
has a：
i has a pen
凡是能够满足has a的表示关联关系，通常以属性的形式存在
A{
   B b;
}
like a;像
cooker like a foodMenu（厨师就像一个菜单一样）
凡是能够满足like a表示实现关系，通常是类实现接口
A implements B
 */
public class Test4 {
  public static void main(String[] args) {
    //创建中餐厨师对象
    foodMenu cooker1=new chinaCooker();
    //创建西餐厨师对象
    foodMenu cooker2=new americaCooker();
    //创建顾客对象
    //仅仅传入了厨师对象，而我们将西餐厨师和中餐厨师都作为foodMenu传入进来，因为这两类都继承了foodMenu，都为foodMenu，耦合度降低
    Customer c=new Customer(cooker1);
    Customer c2=new Customer(cooker2);
    //点菜
    c.order();
    c2.order();
  }
}
//顾客类
class Customer{
  //接口是引用数据类型，可以用来定义实例变量，属性
  private foodMenu menu;//养成封装的好习惯
  //如果下面这样写就表示写死了，只表示顾客只能吃中餐或西餐
/*
  chinaCooker china;
  americaCooker america;
*/
//有参和无参构造方法
  public Customer() {
  }

  public Customer(foodMenu menu) {
    this.menu = menu;
  }
  //get，set方法
  public foodMenu getMenu() {
    return menu;
  }

  public void setMenu(foodMenu menu) {
    this.menu = menu;
  }
  //提供一个点菜的方法
  public void order(){
    /*先拿到菜单才能点菜
    foodMenu f=this.getMenu();*/
    //也可以不调用get方法，因为在本类中的私有属性可以直接访问
    menu.egg();
    menu.fish();
  }
}
//菜单接口，抽象的
interface foodMenu{
 void egg();
 void fish();
}
//中餐厨师
//实现菜单上的菜
class chinaCooker implements foodMenu{
  @Override
  public void egg() {
    System.out.println("中餐厨师做的鸡蛋");
  }

  @Override
  public void fish() {
    System.out.println("中餐厨师做的鱼");
  }
}
//西餐厨师
//实现菜单上的菜
class americaCooker implements foodMenu{
  @Override
  public void egg() {
    System.out.println("西餐厨师做的鸡蛋");
  }

  @Override
  public void fish() {
    System.out.println("西餐厨师做的鱼");
  }
}
