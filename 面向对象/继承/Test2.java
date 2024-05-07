package 继承;
public class Test2 {
  public static void main(String[] args) {
    C m=new C();
    m.doSome();//这里的调用的doSome方法是从B中继承过来的doSome方法
  }
}
class A{
  public void doSome(){
    System.out.println("doSome");
  }
}
class B extends A{

}
class C extends B{

}
