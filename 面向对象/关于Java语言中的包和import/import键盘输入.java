package 关于Java语言中的包和import;
import java.util.Scanner;
public class import键盘输入 {
  public static void main(String[] args) {
    Scanner c=new Scanner(System.in);
    System.out.println("请输入：");
    String name=c.next();
    System.out.println("您输出的名字是："+name);
  }
}
