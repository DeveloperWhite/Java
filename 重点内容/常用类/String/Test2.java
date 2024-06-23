package 常用类.String;

/**/
public class Test2 {
  public static void main(String[] args) {
    String s1="Hello";
    String s2="Hello";
//    分析这个结果是true还是false
//    很明显是true，因为双等号表示的是变量保存的内存地址，而他们都指向常量池中的Hello
    System.out.println(s1==s2);//true
    String s3=new String("xyz");
    String s4=new String("xyz");
//    双等号保存的是内存地址，而这里面new对象之后不同对象内存地址不同，所以这里面的内存地址不同
    System.out.println(s3==s4);//false
//    通过这个案例的学习，知道了字符串的比较不能通过双等号，或者说双等号不保险，应该调用String类的equals方法
//    去源码中查找方法：首先双shfit查找对应的类，然后ctrl+F12查找类中的方法
    System.out.println(s3.equals(s4));//true
  }
}

