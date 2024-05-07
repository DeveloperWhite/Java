package 参数传递;
/*
方法调用的时候，涉及参数传递的问题，传递的时候，java只遵循一种语法机制，
就是将变量中保存的值传过去，只不过有时候传的是字面值，有时候传的是另一个java对象的内存地址
 */
//此中初始值为10，运用add方法相当于传递10进入方法中，原main方法中还存着初始值01的内存地址，保持不变，而add方法中传入的10经过++变成11
public class 字面值传递 {
  public static void main(String[] args) {
    int i=10;
    add(i);//11
    System.out.println(i);//10
  }
  public static void add(int i){
    i++;
    System.out.println(i);
  }
}
