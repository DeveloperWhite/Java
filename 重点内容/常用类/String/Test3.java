package 常用类.String;
/*面试题：分析一下代码，一共创建了几个对象*/
public class Test3 {
  public static void main(String[] args) {
//    这里一共创建了三个对象
//    方法区字符串常量池中有一个Hello对象
//    堆内存中有两个String对象
    String x=new String("Hello");
    String y=new String("Hello");

  }
}
