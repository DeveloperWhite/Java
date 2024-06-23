package 常用类.String;
/*关于java中内置的String类，字符串类型，属于引用数据类型
* 双引号括起来的字符串直接存储在方法区的字符串常量池中,因为字符串在实际的开发中使用的太频繁，为了提高执行效率。
*
* */
public class Test1 {
  public static void main(String[] args) {
//    这里的字符串是定义的，从方法区中的字符串常量池中来
//    str表示的不是字符串，而是该字符串对象的内存地址
    String str="abcdef";
//    这是使用new对象来创建的字符串对象，分析这里的字符串是从哪来的
//    凡是双引号括起来的都在字符串常量池中，只不过new对象的时候一定在堆内存中开辟空间
    String str2=new String("str");
  }
}
