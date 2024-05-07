package this关键字;
public class Test {
  /*
  带有static的方法既可以采用类名.访问，也可以采用创建对象后引用的方式访问，
  但即使采用引用的方式访问，实际执行的时候与引用的对象无关，他会忽视编写的引用.默认为类名.（或者类名.省略）
   */
  //带有static的方法
  public static void method1(){
    //调用doSome
    //使用完整方式
    Test.doSome();
    //使用省略方式
    doSome();
    //调用doOther
    //使用完整方式
    Test c=new Test();
    c.doOther();
    //使用省略方式
    //无
    //访问i
    //使用完整方式
    System.out.println(c.i);
    //使用省略方式
    //无
  }
  //没有static的方法
  public void method2(){
    //调用doSome
    //使用完整方式
    Test.doSome();
    //使用省略方式
    doSome();
    //调用doOther
    //使用完整方式
    this.doOther();
    //使用省略方式
    doOther();
    //访问i
    //使用完整方式
    System.out.println(this.i);
    //使用省略方式
    System.out.println(i);
  }

  //主方法
  public static void main(String[] args) {
    //编写程序调用method1
    //使用完整方式
    Test.method1();
    //使用省略方式
    method1();
    //编写程序调用method2
    //使用完整方式
    Test c=new Test();
    c.method2();
    //使用省略方式
    //无
  }
  //没有static的变量
  int i;
  //有static的方法
  public static void doSome(){
    System.out.println("doSome");
  }
  //没有static的方法
  public void doOther(){
    System.out.println("doOther");
  }
}
