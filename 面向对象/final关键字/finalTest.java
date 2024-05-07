package final关键字;
//final关键字
/*
1.final修饰的类无法被继承
2.final修饰的方法无法被覆盖
3.final修饰的变量一旦赋值后，不可重新赋值
4.final修饰的实例变量，系统规定，修饰后实例变量必须手动赋值，不能采用默认值
//实例变量有默认值，final修饰的变量一旦赋值后就不可重新赋值，综合考虑，最终决定final关键字修饰的实例变量必须手动赋值，不可采用默认值
5.final修饰的引用，一旦指向某个对象之后，不能在指向其他对象，被指向的对象无法被垃圾回收器回收，但指向对象内部的内存是可以被修改的
6.final修饰的实例变量一般是不可变的，这种变量一般和static联合使用，被称为"常量"
 */
public class finalTest {
  public static void main(String[] args) {
    int k=100;
    k=20;
   /*final int i=100;
    i=120;*/
    //final修饰的变量一旦赋值后，不可重新赋值
  }
}
