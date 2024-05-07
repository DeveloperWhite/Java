package super关键字;
//super什么时候不能省略
//JAVA语言中区分子类和父类中的同名属性
/*
this.name 当前对象的name属性
super.name 当前对象的父类型特征中的name属性
 */
public class superTest3 {
  public static void main(String[] args) {
    Vip c=new Vip("张三");
    c.shopping();
  }
}
class customer{
  String name;
  public customer() {
  }
  public customer(String name) {
    super();
    this.name = name;
  }
}
class Vip extends customer{
  //假设子类有和父类同名的属性
  //java中允许在子类中出现和父类中同名变量
  String name;
  public Vip() {

  }
  //super(name)通过子类的构造方法调用父类的构造方法public customer（实参）构造方法
  public Vip(String name) {
    super(name);//张三传到这，然后这里继承父类中的customer有参构造传给父类中的name属性
  }
  public void shopping(){
    System.out.println(this.name);//null
    System.out.println(super.name);//张三
    System.out.println(name);//null，name之前什么都不加，自动加this.
  }
}
