package 多态.Test2;
//主人
  //喂养宠物的方法
  /*在这段代码中，`cat`类是一个自定义的类，它描述了猫的属性和行为。当我们声明一个变量或参数为`cat`类型时，
  它实际上是一个引用，即指向`cat`类实例的指针。这个引用指向在内存中实际创建的`cat`对象。因此，当我们将一个`cat`对象的引用作为参数传递给`feed`方法时，
  我们可以通过这个引用来访问和操作这个对象的属性和行为，包括调用`cat`类中定义的成员方法，如`eat`方法。这里相当于主方法中引用tom创建了cat对象，并将tom引用传入feed方法中，从而调用eat方法
  */
/*  public class Master {
  public void feed(cat c){
    c.eat();
  }
  public void feed(dog d){
    d.eat();
  }
}*/
//以上这段代码，并没有使用java语言中的多态机制，Master类的扩展性很差，因为只要插一个新的宠物，Master类中就要加一个新的方法
//目标：提高扩展力，降低程序的耦合度
//主人和dog，cat的dog的关联程度很强，耦合度太高
public class Master{
  /*
  这里相当于，主方法中a.feed（new dog（））或者a,feed（new cat（）），将括号中的值
  传到Master类中即pet c=new dog（）或者pet c=new cat（），这里含有pet是父类，cat和dog是子类，子类转化为父类是自动类型转换
  这里为父类型引用，可调用子类型中的方法
   */
  public void feed(pet c){
    c.eat();
  }
}
