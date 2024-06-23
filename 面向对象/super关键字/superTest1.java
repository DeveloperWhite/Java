package super关键字;
//super关键字
/*
this和super对比学习
this：
this出现在实例方法和构造方法中
this的语法：this.和this()
this不能出现在静态方法中
super：
super能出现在实例方法和构造方法中
super的语法是：super.和super()
super不能使用在静态方法中
super.大部分情况下是可以省略的，父类中有的属性，子类中也有同名属性，如果想在子类中访问父类的属性特征，如果省略，则访问的都是当前对象的内容（子类中）
父类中和子类中存在相同的属性或方法，如果想在子类中访问父类的数据（属性或方法），必须加上super.来区分
super只能出现在构造方法的第一行，通过当前的构造方法去调用父类中的构造方法，目的是：创建子类对象的时候，先初始化父类型特征
super（）表示通过子类构造方法调用父类的构造方法
当一个构造方法第一行既没有this（）又没有super（）时默认会有一个super（）表示当前子类的构造方法调用父类的无参数构造方法，所以必须保证父类的无参数构造方法是存在的
总结：
super.属性名 访问父类属性
super.方法名（实参）访问父类方法
super（实参）调用父类的构造方法
 */
public class superTest1 {
  public static void main(String[] args) {
    //创建子类对象
    new B();
  }
}
class A{
  public A(int i){
    System.out.println("A类中");
  }
}
class B extends A{
/*  public B(){
    super();
    数组.System.out.println("B类中");
  }*/
  public B(){
    super(123);
    System.out.println("B类中");
  }
}
