package this关键字.this1;
//在
public class this1 {
  String name;//实例变量
  //实例方法
  public void doSome(){
    System.out.println("llll");
  }
  public void doOther(){//本身为实例方法，其中有this，可直接调用doSome（）方法
    System.out.println("kkkkkk");
    this.doSome();
  }
//带有static的主方法中调用实例方法
  public static void main(String[] args) {//带有static的主方法，没有this，想调用实例方法必须先创建对象
    //调用实例方法先创建对象后引用.
    this1 c=new this1();
    c.doSome();
    c.doOther();
  }
}
