package final关键字;

public class finalTest3 {
  public static void main(String[] args) {
    //创建一个User对象
    User u=new User();
    //又创建一个新的User对象
    //程序执行到此处表示，以上对象已成为垃圾数据，等待垃圾回收器的回收
    u=new User();
/*    final User c=new User();
    c=new User();*/
    //final修饰引用，一旦指向某个对象之后，不能在指向其他对象，被指向的对象无法被垃圾回收器回收，但指向对象内部的内存是可以被修改的
    final User u1=new User();
    u1.id=50;
    u1.id=30;
  }
}
