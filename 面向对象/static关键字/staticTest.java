package static关键字;
/*
1.static关键字可以定义静态代码块
语法格式：
static{
  java语句
}
2.静态代码块在类加载时执行并且只执行一次
3.静态代码块在一个类中可以编写多个，并且遵循自上而下顺序依次执行
4.作用：和具体的需求有关，例如，项目要求在类加载的时候执行代码完成日志的记录，
  这段记录日志的代码就可以编写在静态代码块当中，完成日志记录
//实例代码块/语句块（使用很少）
1.实例代码块可以编写多个，并且遵循自上而下顺序依次执行
2.实例代码块在构造方法执行之前执行，构造方法执行一次，实例代码块就对应执行一次
3.实例代码块执行时机也是一个特殊的时机被称为对象初始化时机
方法定义为静态方法的时机：方法描述的是动作，当所有的对象执行这个动作的时候，
最终产生的影响是一样的，那么这个动作已经不属于一个对象的动作，可以将这个动作提升为类级别的动作，模板级别的动作
当这个动作不需要对象的参与，就可以定义为静态方法
静态方法中无法访问实例变量和实例方法，需要创建对象，后通过引用.访问
 */

public class staticTest {
  //实例代码块
  //无参构造法
  public staticTest(){
    System.out.println("构造方法执行");
  }
  {
    System.out.println("实例代码块1");
  }
  {
    System.out.println("实例代码块2");
  }
  {
    System.out.println("实例代码块3");
  }
  //静态代码块
  static{
    System.out.println("类加载1");
  }
  static{
    System.out.println("类加载2");
  }
  static{
    System.out.println("类加载3");
  }
  //主入口
  public static void main(String[] args) {
    System.out.println("11111111");
    //new对象无参构造的调用方法
    new staticTest();
    new staticTest();
  }
}
