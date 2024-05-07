package 多态.Test1;
//关于Java语言中的多态语法机制
/*
1.Animal，cat，bird类之间的关系：cat继承Animal，bird继承Animal，cat和bird之间没有任何继承关系
2.多态中的概念（前提两种类型必须有继承关系）：
向上转型：（up casting）子类向父类转称为向上转型又被称为自动类型转换
向下转型：（down casting）父类向子类转型称为向下转型又被称为强制类型转换（需加强制类型转换符）
 */
public class Test {
  public static void main(String[] args) {
    //普通语法机制
    Animal a=new Animal();
    a.move();
    cat b=new cat();
    b.move();
    bird c=new bird();
    c.move();
    //多态语法机制
    /*
    Animal和cat之间存在继承关系，Animal是父类，cat是子类
    cat is a Animal
    new cat（）创建对象的类型是cat，a1这个数据的引用类型是Animal，可见他们进行的类型转换
    子类型转换为父类型，称为向上转换，存在自动类型转换，允许父类型引用指向子类型对象
    以下程序分为编译阶段和运行阶段
    编译阶段编译器检查a1这个引用数据类型为Animal，
    由于Animal.class字节码文件中有move方法所以编译通过了，这个过程称为静态绑定，编译过程绑定
    只有静态绑定成功后才有后续的运行，而在运行阶段，JVM堆内存中创建的对象为cat对象，
    则运行时一定会调用cat对象的move方法此时发生了动态绑定
    和cat中重写不重写没有任何关系，若cat中不重写，它也调用的是cat中从Animal父类中继承过来的方法，无论怎样，都调用cat类中的方法
    父类型引用指向子类型对象导致程序在编译阶段和运行阶段绑定两种不同的形态，这种机制称为多态语法机制
    a2.catchMouse（）;为什么不能运行，因为在编译阶段，
    编译器检查到a1的类型是Animal类型而在Animal.class字节码文件中没有找到catchMouse方法，
    导致静态绑定失败所以编译失败，更别提运行了
    解决上述问题：
    a1引用的类型是Animal，而Animal类中没有catchMouse方法，我们将a1强制类型转换为cat类型，
    a1的类型是Animal类型（父类），转换为cat类型（子类），需要向下转型（强制类型转换）
    Animal a3=new bird（）;
    cat a4=（cat） a3;
    以上程序编译没有问题，因为a3是Animal类型，cat类型和Animal类型之间存在继承关系，Animal转cat为向下转型，需强制类型转换，语法合格
    但运行时，会出现异常，因为JVM堆内存当中真实存在的是bird类型，bird对象无法转换为cat对象，所以出现类型转换异常(java.lang.ClassCastException)
    这种异常常常出现在向下转型的时候会发生
    解决：使用instanceof运算符就能解决
    instanceof运算符语法格式：
    引用 instanceof 数据类型
    以上运算符执行结果是布尔类型，结果可能是true/false
    a1 instanceof Animal
    true表示：a1这个引用指向的对象是Animal类型
    false表示：a1这个引用指向的对象不是Animal类型
    */
    Animal a1=new cat();
    a1.move();
    //a1是Animal类型强制转换为cat类型，并用cat类型的a2来接受
    cat a2=(cat) a1;
    a2.catchMouse();
    /*
    解决类型转换异常的问题
    若a3引用指向的对象是cat类型，则把原来Animal类型强制转换为cat类型，
    若a3指向的对象是bird类型，则把原来的Animal类型强制转换为bird类型，
    可防止在运行的时候出现cat类型的引用指向bird类型的对象，而这两者不存在继承关系，所以不能相互转换，导致运行报错
    在进行强制类型转换前需要加上instanceof运算符进行判断，防止类型转换异常，这是一种编程好习惯
     */
    Animal a3=new bird();
    if(a3 instanceof cat){
      cat a4=(cat) a3;
      a4.catchMouse();
    } else if (a3 instanceof bird) {
      bird a4=(bird) a3;
      a4.fly();
    }
  }
}
