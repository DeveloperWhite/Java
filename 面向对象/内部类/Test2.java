package 内部类;
//和Test1进行对比
public class Test2 {
  public static void main(String[] args) {
   MyMath1 c=new MyMath1();
   //不定义该实现类，直接调用接口导入参数，实例化是要加上大括号
    //这边不定义实现类相当于没有名字，直接调用接口computer1
    //使用匿名内部类，表示实现类computerAchieve这个类，再大括号中把接口中的方法在匿名类中进行重写
    //不建议使用匿名内部类，该类只能调用一次，若把接口实现类定义出来能一直调用
   c.sum(new computer1(){
     @Override
     public int sum(int a, int b) {
       return a+b;
     }
   },100,120);
  }
}
 interface computer1{
  int sum(int a,int b);
 }
 //可以不定义该实现类
class MyMath1{
   public void sum(computer1 c,int x,int y){
     int value=c.sum(x,y);
     System.out.println(value);
   }
 }