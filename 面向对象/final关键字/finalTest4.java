package final关键字;

public class finalTest4 {
  public static void main(String[] args) {
    System.out.println(Chinese.GUI_JI);

  }
}
//中国人类
class Chinese{
  //国籍
  //国籍不会变
  //final修饰的变量一般是不可变的，这种变量一般和static联合使用，被称为"常量"
  //常量定义的语法格式：
  //public static final 类型 常量名=值;
  //Java规范中要求，常量名字全部大写，每个单词之间用下划线分开
  public static final String GUI_JI="China";
}
